import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class MarvellousPacker
{
	FileOutputStream outstream = null;
	String ValidExt[] = {".txt",".c",".java",".cpp"};
	
	public MarvellousPacker(String src, String Dest) throws Exception
	{
		Sytem.out.println("akshay");

		String Magic = "Marvellous11";
		byte arr[] = Magic.getBytes();
		File outfile = new File(Dest);
		
		File infile = null;
		outstream = new FileOutputStream(outfile);
		outstream.write(arr,0,arr.length);
		
		File folder = new File(src);
		
		Sytem.out.println("akshay");

		if (!folder.isAbsolute()) {
			System.out.println("akshay");
			folder = new File(System.getProperty("user.dir"), src);
		}

		if (!folder.exists()) {
            throw new IOException("Source directory does not exist.");
        }
		
		//System.setProperty("user.dir",folder.getName());
		Sytem.out.println("akshay");
		listAllFiles(folder.getAbsolutePath());
		System.out.println();
		
	}

	public void listAllFiles(String path) {
		try (Stream<Path> paths = Files.walk(Paths.get(path))) {
			paths.forEach(filePath -> {
				if (Files.isRegularFile(filePath)) {
					try {
						String name = filePath.getFileName().toString();
						String ext = name.substring(name.lastIndexOf("."));
						
						List<String> list = Arrays.asList(ValidExt);
						
						if (list.contains(ext)) {
							File file = new File(filePath.toString()); // Use filePath to construct the File object
							Pack(file.getAbsolutePath());
						}
					} catch (Exception e) {
						System.out.println(e);
					}
				}
			});
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	
	// public void listAllFiles(String path)
	// {
	// 	//System.out.println(path);

	// 	try
	// 	(Stream<Path> paths = Files.walk(Paths.get(path)))
	// 	{
	// 		paths.forEach(filePath ->
	// 				{
	// 					if(Files.isRegularFile(filePath))
	// 					{
	// 						try
	// 						{
	// 							String name = filePath.getFileName().toString();
	// 							String ext = name.substring(name.lastIndexOf("."));
								
	// 							List<String> list = Arrays.asList(ValidExt);
								
	// 							if(list.contains(ext))
	// 							{
	// 								File file = new File(name); //File file = new File(filePath.getFileName().toString())
	// 								Pack(file.getAbsolutePath());
	// 							}
	// 						}	
	// 							catch (Exception e)
	// 							{
	// 								System.out.println(e);
	// 							}
	// 					}
	// 				});
	// 	}
	// 	catch(IOException e)
	// 	{
	// 		System.out.println(e);
	// 	}
	// }

	public void Pack(String filePath)
	{
		FileInputStream instream =null;
		
		try
		{
			byte[] buffer = new byte[1024];
			
			int length;
			
			byte temp[] = new byte[100];
			File fobj = new File(filePath);
			
			String Header = filePath+" "+fobj.length();
			for(int i = Header.length(); i<100 ; i++)
				Header +=" ";
			
			temp = Header.getBytes();
			instream = new FileInputStream(filePath);
			outstream.write(temp,0, temp.length);
			
			while((length = instream.read(buffer))>0)
			{
				outstream.write(buffer,0,length);
			}
			
			instream.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}