import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgramControlTest {
    @Test
    void parseFileIdToIndexTest() {
        assertEquals(0, ProgramControl.parseFileIdToIndex("01"));
        assertEquals(1, ProgramControl.parseFileIdToIndex("02"));
        assertEquals(-1, ProgramControl.parseFileIdToIndex("A1"));
        assertEquals(-1, ProgramControl.parseFileIdToIndex("1"));
        assertEquals(-1, ProgramControl.parseFileIdToIndex(null));
        assertEquals(-1, ProgramControl.parseFileIdToIndex("1"));
        assertEquals(-1, ProgramControl.parseFileIdToIndex("AA"));
        assertEquals(-1, ProgramControl.parseFileIdToIndex("0a"));
    }

    @Test
    void listDataFiles_returnsSortedFiles() throws Exception {
        Path data = Paths.get("data");
        Files.createDirectories(data);

        // create fake files
        Files.createFile(data.resolve("z.txt"));
        Files.createFile(data.resolve("a.txt"));
        Files.createFile(data.resolve("m.txt"));

        List<String> result = ProgramControl.listDataFiles();

        assertEquals(List.of("a.txt", "m.txt", "z.txt"), result);
    }


}
