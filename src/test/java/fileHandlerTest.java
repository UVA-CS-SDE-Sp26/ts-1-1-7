import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class fileHandlerTest {

    @Test
    void checkLoadPath() {
        fileHandler handler = new fileHandler("src/files/secret.txt");
        String path = handler.path();
        assertEquals(path, "src/files/secret.txt");
    }

    @Test
    void loadFileAndOutputTest() {
        fileHandler handler = new fileHandler("src/files/secret.txt");
        String output = handler.fileOut();
        assertEquals("Java is based on c", output);
    }
}