import org.junit.Test;

import static org.junit.Assert.*;


public class IlmaPrognoosTest {
    @Test
    public void getName() throws Exception {
        IlmaPrognoos prognoos = new IlmaPrognoos("Prognoos");
        assertEquals("Prognoos", prognoos.getName());
    }

    @Test
    public void testNewConnection() { fail();}

    @Test
    public void getPraegunePrognoos() {
        assertTrue(false);
    }

    @Test
    public void getKolmePaevaPrognoos() {
        assertTrue(false);
    }

    @Test
    public void getGeoPrognoos() {
        assertTrue(false);
    }
}