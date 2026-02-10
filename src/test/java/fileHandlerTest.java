import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class fileHandlerTest {

    @Test
    void checkLoadPath() {
        fileHandler handler = new fileHandler("src/files/secret.txt");
        String path = handler.path();
        assertEquals("src/files/secret.txt", path );
    }

    @Test
    void loadFileChangeAndOutputTest() {
        fileHandler handler = new fileHandler("src/files/secret.txt");
        String output = handler.fileOut();
        assertEquals("Java is based on c", output);
        handler.changePath("src/files/secret2.txt");
        output = handler.fileOut();
        assertEquals("Every day Is a day to code\n" +
                "Hello world\n" +
                "SDE 3120", output);
    }
}