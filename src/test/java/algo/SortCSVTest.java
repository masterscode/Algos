package algo;

import org.junit.Test;
//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

class SortCSVTest {
    @Test
    public void shouldHandleTheExample() {
        assertEquals(
                "Adam,Beth,Charles,Danielle,Eric\n3907,17945,10091,10088,10132\n48,2,12,13,11",
                SortCSV.sortCsvColumns("Beth,Charles,Danielle,Adam,Eric\n17945,10091,10088,3907,10132\n2,12,13,48,11")
        );
    }
}

