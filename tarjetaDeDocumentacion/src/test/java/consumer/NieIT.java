
package consumer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ozeh
 */
public class NieIT {
    
    public NieIT() {
    }

    @Test
    public void testGetLetraDocumentacion() {
        Nie nie = new Nie("X1234567");
        assertEquals('X', nie.getLetraDocumentacion());
    }

    
    @Test
    public void testGetParteNumerica() {
        Nie nie = new Nie("X1234567");
        assertEquals("1234567", nie.getParteNumerica());
    }

    
    @Test
    public void testGetObtenerLetraDocumentacion() {
    }
    
}
