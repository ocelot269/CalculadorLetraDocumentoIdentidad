package consumer;

import clases.TablaAsignacionLetra;
import java.util.Arrays;
import java.util.List;
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
        Nie nie = new Nie("X1234567h");
        assertEquals('X', nie.getPrimeraLetraDocumentacion());
    }

    @Test
    public void testGetParteNumerica() {
        Nie nie = new Nie("X1234567h");
        assertEquals("1234567", nie.getParteNumerica());
    }

    @Test
    public void testGetObtenerLetraDocumentacion() {
        Nie nie = new Nie("X1234567H");
        assertEquals("L", nie.getObtenerLetraDocumentacion());

        Nie niePrueba = new Nie("Y1234567S");
       
        assertEquals("X", niePrueba.getObtenerLetraDocumentacion());
        
        Nie niePrueba1 = new Nie("Y2345678H");
        
        assertEquals("Z", niePrueba1.getObtenerLetraDocumentacion());
        
        Nie niePrueba2 = new Nie("Z2345678H");
        
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
        
    @Test
        public void testgetUltimaLetraDocumentacion(){
           Nie nie = new Nie("X4322495H");
           assertEquals('H', nie.getUltimaLetraDocumentacion());
            
        }
        
//     @Test
//        public void testValidadorDocumentoIdentidad1() {
//		List<String> niesLista = Arrays.asList("Z3149115Y", "X0149115Y", "X3735122Z", "X4821048H", "Y3894320C",
//				"X9684113D", "X1134776W", "Z2089626N", "Y4267460P", "Z8920631V");
//
//		for (String nies : niesLista) {
//
//
//			Nie nie = new Nie(nies);
//			nie.validadorDocumentoIdentidad();
//			nie.getLetraDocumentacion();
//			nie.getObtenerLetraDocumentacion();
//			nie.validadorDocumentoIdentidad();
//
//                        assertTrue(nie.n() );
//		}
//    }   
}
