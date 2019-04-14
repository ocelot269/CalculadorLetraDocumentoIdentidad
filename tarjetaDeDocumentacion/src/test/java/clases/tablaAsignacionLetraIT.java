package clases;

import consumer.Nie;
import org.junit.Test;
import static org.junit.Assert.*;

public class tablaAsignacionLetraIT {

    public tablaAsignacionLetraIT() {
    }

    @Test
    public void testSetTablaAsignacion() {
        TablaAsignacionLetra tabla = new TablaAsignacionLetra();
        tabla.setTablaAsignacion();
        assertEquals("T", tabla.getLetraDni(0));
        assertEquals("R", tabla.getLetraDni(1));
        assertEquals("E", tabla.getLetraDni(22));
    }

    @Test
    public void testGetLongitudDni() {
    }

    @Test
    public void testCalcularLetraDni() {
        TablaAsignacionLetra tabla = new TablaAsignacionLetra();
        tabla.setTablaAsignacion();
        assertEquals("H", tabla.getLetraDni(18));
        assertEquals("H", tabla.calcularLetraDni("43224953"));
        assertEquals("J", tabla.calcularLetraDni("43179224"));
        assertEquals("M", tabla.calcularLetraDni("43029210"));
    }
    
    @Test
    public void testCalcularLetraNie() {
        TablaAsignacionLetra tabla = new TablaAsignacionLetra();
        Nie nie = new Nie("X1234567");
        
        tabla.setTablaAsignacion();
        assertEquals("L", tabla.calcularLetraNie(nie));
        
        Nie niePrueba = new Nie("Y1234567");
        assertEquals("X", tabla.calcularLetraNie(niePrueba));
        
        Nie niePrueba1 = new Nie("Y2345678");
        assertEquals("Z", tabla.calcularLetraNie(niePrueba1));
        
         Nie niePrueba2 = new Nie("Z2345678");
        assertEquals("M", tabla.calcularLetraNie(niePrueba2));
        
    }

}
