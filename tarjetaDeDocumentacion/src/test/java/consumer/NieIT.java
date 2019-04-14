package consumer;

import clases.TablaAsignacionLetra;
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
        Nie nie = new Nie("X1234567");

        nie.getTabla().setTablaAsignacion();
        assertEquals("L", nie.getObtenerLetraDocumentacion());

        Nie niePrueba = new Nie("Y1234567");
        niePrueba.getTabla().setTablaAsignacion();
        assertEquals("X", niePrueba.getObtenerLetraDocumentacion());

        Nie niePrueba1 = new Nie("Y2345678");
        niePrueba1.getTabla().setTablaAsignacion();
        assertEquals("Z", niePrueba1.getObtenerLetraDocumentacion());
        
        Nie niePrueba2 = new Nie("Z2345678");
        niePrueba2.getTabla().setTablaAsignacion();
        assertEquals("M", niePrueba2.getObtenerLetraDocumentacion());

    }
    
    @Test
        public void testValidadorDocumentoIdentidad() {
            Nie nie = new Nie();
            assertEquals(true, nie.validadorDocumentoIdentidad("X1234567A"));
            Nie nie2 = new Nie();
            assertEquals(false, nie2.validadorDocumentoIdentidad("a1234567A"));
            Nie nie3 = new Nie();
            assertEquals(false, nie3.validadorDocumentoIdentidad("X567A"));
            Nie nie4 = new Nie("Z1234567ññ");
            assertEquals(false, nie4.validadorDocumentoIdentidad());
            Nie nie5 = new Nie("Z1234567a");
            assertEquals(true, nie5.validadorDocumentoIdentidad());
            }
        }

