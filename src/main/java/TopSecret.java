public class TopSecret {

    public static void main(String[] args) {
        // [Role A] Main Entry Point / 메인 진입점
        // This interface handles command-line arguments passed to the application.
        // 이 인터페이스는 애플리케이션에 전달된 커맨드 라인 인자(Arguments)를 처리합니다.

        // 1. No Arguments -> List Mode
        // 1. 입력값이 없을 때 (0개) -> 파일 목록 보여주기
        if (args.length == 0) {
            System.out.println("No arguments provided. Printing file list...");
            // TODO: Call Role C's method to print the file list here.
            // TODO: 여기서 Role C의 파일 목록 출력 메서드를 호출해야 함.
        }

        // 2. One Argument -> Default Mode (Default Decryption)
        // 2. 입력값이 1개일 때 -> 기본 키로 해독하기
        else if (args.length == 1) {
            String fileID = args[0];
            System.out.println("Processing file: " + fileID + " with Default Key.");
            // TODO: Call Role B's decryption method with default key.
            // TODO: Role B의 해독 메서드를 기본 키로 호출해야 함.
        }

        // 3. Two Arguments -> Custom Mode (Custom Key Decryption)
        // 3. 입력값이 2개일 때 -> 사용자 지정 키로 해독하기
        else if (args.length == 2) {
            String fileID = args[0];
            String key = args[1];
            System.out.println("Processing file: " + fileID + " with Custom Key: " + key);
            // TODO: Call Role B's decryption method with custom key.
            // TODO: Role B의 해독 메서드를 사용자 키로 호출해야 함.
        }

        // 4. Too many arguments -> Error Message
        // 4. 입력값이 너무 많을 때 -> 에러 메시지 출력
        else {
            System.out.println("Error: Too many arguments.");
            System.out.println("Usage: java TopSecret [FileID] [Key]");
        }
    }
}