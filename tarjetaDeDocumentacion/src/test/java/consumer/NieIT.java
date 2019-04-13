
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
    }

    
    @Test
    public void testGetObtenerLetraDocumentacion() {
    }
    
}
