public class TopSecret {

    public static void main(String[] args) {

        // no args -> show list
        if (args.length == 0) {
            ProgramControl.printFileList();
        }
        // 1 arg -> default key
        else if (args.length == 1) {
            ProgramControl.displayFile(args[0]);
        }
        // 2 args -> custom key
        else if (args.length == 2) {
            ProgramControl.displayFile(args[0], args[1]);
        }
        // too many args
        else {
            System.out.println("Error: Too many arguments.");
            System.out.println("Usage: java TopSecret [FileID] [Key]");
        }
    }
}