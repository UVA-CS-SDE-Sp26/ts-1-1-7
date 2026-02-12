public class TopSecret {

    public static void main(String[] args) {
        fileHandler fileHandler;
        if (args.length == 0) {
            System.out.println("No arguments provided. Printing file list...");

        }
        else if (args.length == 1) {
            String fileID = args[0];
            fileHandler = new fileHandler(fileID);
            String fileContent = fileHandler.fileOut(); //TODO FOR CIPHER: Pass fileContent into cipher object
                                                        // in order to get file content to decrypt

            System.out.println("Processing file: " + fileID + " with Default Key.");

        }
        else if (args.length == 2) {
            String fileID = args[0];
            String key = args[1];
            fileHandler = new fileHandler(fileID);
            String fileContent = fileHandler.fileOut(); //TODO FOR CIPHER: Pass fileContent into cipher object
                                                        // in order to get file content to decrypt

            System.out.println("Processing file: " + fileID + " with Custom Key: " + key);

        }

        else {
            System.out.println("Error: Too many arguments.");
            System.out.println("Usage: java TopSecret [FileID] [Key]");
        }
    }
}