import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgramControlTest {
    @Test
    void parseFileIdToIndexTest() {
        assertEquals(0, ProgramControl.parseFileIdToIndex("01"));
        assertEquals(1, ProgramControl.parseFileIdToIndex("02"));
        assertEquals(-1, ProgramControl.parseFileIdToIndex("A1"));
        assertEquals(-1, ProgramControl.parseFileIdToIndex("1"));
    }

}
