
public class TopSecret {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No arguments provided. Printing file list...");
        }
        else if (args.length == 1) {
            String fileID = args[0];
            System.out.println("Processing file: " + fileID + " with Default Key.");

        }
        else if (args.length == 2) {
            String fileID = args[0];
            String key = args[1];
            System.out.println("Processing file: " + fileID + " with Custom Key: " + key);

        }
        else {
            System.out.println("Error: Too many arguments.");
            System.out.println("Usage: java TopSecret [FileID] [Key]");
        }
    }
}