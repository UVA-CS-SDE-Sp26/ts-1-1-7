public class TopSecret {

    public static void main(String[] args) {
        // [Role A] Main Entry Point
        // Determines the action based on the number of arguments.
        // 입력값(args)의 개수에 따라 프로그램의 동작을 결정합니다.

        // 1. No arguments provided -> List Mode
        // 입력값이 없을 때 (0개) -> 파일 목록 보여주기
        if (args.length == 0) {
            System.out.println("No arguments provided. Printing file list...");
            // TODO: Call Role C's method to print the file list here.
            // 나중에 Role C가 만든 파일 목록 출력 함수를 연결할 예정입니다.
        }

        // 2. One argument provided -> Default Decipher Mode
        // 입력값이 1개일 때 (파일 ID) -> 기본 키(Default Key)로 해독하기
        else if (args.length == 1) {
            String fileID = args[0];
            System.out.println("Processing file: " + fileID + " with Default Key.");
            // TODO: Call Role B's method to decrypt using the default key.
            // 나중에 Role B가 만든 암호 해독(기본키) 함수를 연결할 예정입니다.
        }

        // 3. Two arguments provided -> Custom Decipher Mode
        // 입력값이 2개일 때 (파일 ID + 암호 키) -> 사용자가 입력한 키로 해독하기
        else if (args.length == 2) {
            String fileID = args[0];
            String key = args[1];
            System.out.println("Processing file: " + fileID + " with Custom Key: " + key);
            // TODO: Call Role B's method to decrypt using the custom key.
            // 나중에 Role B가 만든 암호 해독(커스텀키) 함수를 연결할 예정입니다.
        }

        // 4. Incorrect usage (Too many arguments)
        // 그 외: 입력값이 너무 많거나 잘못된 경우 (에러 처리)
        else {
            System.out.println("Error: Too many arguments.");
            System.out.println("Usage: java TopSecret [FileID] [Key]");
        }
    }
}