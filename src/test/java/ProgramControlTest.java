import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;import static org.junit.jupiter.api.Assertions.assertEquals;

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
    void listSortedDataFilesTest() throws Exception {
        Files.writeString(Path.of("src/files/ProgramControlTestB.txt"), "test1");
        Files.writeString(Path.of("src/files/ProgramControlTestA.txt"), "test2");
        Files.writeString(Path.of("src/files/ProgramControlTestC.txt"), "test3");
        assertEquals(List.of("ProgramControlTestA.txt", "ProgramControlTestB.txt", "ProgramControlTestC.txt",
                "secret.txt", "secret2.txt"), ProgramControl.listDataFiles());
    }



}
