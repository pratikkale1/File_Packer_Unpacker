# File Packer Unpacker with Encryption

This GitHub project, named "File Packer Unpacker with Encryption," is a Java-based application that allows users to pack multiple files into a single archive file and later unpack them. The project includes three main Java classes:

1. **MarvellousLogin.java**: This class is responsible for handling user authentication. It presents a graphical login interface and ensures that only authorized users can access the packing and unpacking functionalities.

2. **MarvellousPacker.java**: This class is responsible for packing files from a specified directory into a single archive file. It supports various file types and organizes them into the archive along with their original names and sizes.

3. **MarvellousUnpack.java**: This class is responsible for unpacking files from a previously created archive file. It reads the archive and restores the original files, preserving their names and contents.

4. **MarvellousPackFront.java**: This class serves as the front end for the packing process. It allows users to specify the source directory containing files to pack and the destination archive file name.

## Usage Instructions

To use this project, follow these steps:

1. **Login**: Run the `MarvellousLogin.java` file to access the application. You must log in with the correct username and password ("MarvellousAdmin" for both by default) to proceed.

2. **Packing Files**: After logging in, you can use the `MarvellousPackFront.java` interface to specify the source directory containing files to pack and the destination archive file name. Click the "SUBMIT" button to initiate the packing process.

3. **Unpacking Files**: To unpack files, run the `MarvellousUnpack.java` file and provide the path to the archive file created during packing. It will restore the original files to their respective locations.

## Project Structure

The project is structured into multiple Java classes, each responsible for a specific part of the application. Here's an overview of the project structure:

- **MarvellousLogin.java**: Handles user authentication and login interface.
- **MarvellousPacker.java**: Manages the packing of files into an archive.
- **MarvellousUnpack.java**: Handles the unpacking of files from an archive.
- **MarvellousPackFront.java**: Front-end for specifying packing parameters.
- **InvalidFileException.java**: Custom exception class for handling invalid archive files.

## Dependencies

This project uses standard Java libraries and Swing for the graphical user interface. There are no external dependencies.

## Build and Run

To build and run the project, you can use any Java IDE or compile and run the Java files from the command line. Make sure to set up your IDE or command line environment correctly to compile and execute Java applications.

## GitHub Repository

The complete project source code is available on GitHub at [https://github.com/yourusername/your-repo-name](https://github.com/yourusername/your-repo-name). You can clone the repository, contribute to the project, or report issues on the GitHub platform.

## License

The project is open-source and released under an open-source license (mention the specific license here). Please review the LICENSE.md file for detailed information on licensing and usage.

Feel free to extend and enhance this project as needed for your requirements.
