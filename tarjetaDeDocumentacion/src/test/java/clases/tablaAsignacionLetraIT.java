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
        assertEquals("H", tabla.calcularLetraDni("43224953H"));
        assertEquals("J", tabla.calcularLetraDni("43179224H"));
        assertEquals("M", tabla.calcularLetraDni("43029210H"));
    }
    
    @Test
    public void eliminarUltimaLetratest(){
        TablaAsignacionLetra tabla = new TablaAsignacionLetra();
        tabla.setTablaAsignacion();
        tabla.setResultado("43224953H");
        tabla.eliminarUltimaLetra();
        assertEquals("43224953", tabla.getResultado());
          
    }
    
    @Test
    public void replazarLetraPorValor(){
        TablaAsignacionLetra tabla = new TablaAsignacionLetra();
        Nie nie = new Nie("X1234567H");
        tabla.setTablaAsignacion();
        tabla.reemplazarLetrasPorValor(nie);
        assertEquals("01234567H", tabla.getResultado());
        
        TablaAsignacionLetra tabla1 = new TablaAsignacionLetra();
        Nie nie1 = new Nie("Y1234567H");
        tabla1.setTablaAsignacion();
        tabla1.reemplazarLetrasPorValor(nie1);
        assertEquals("11234567H", tabla1.getResultado());
        
        TablaAsignacionLetra tabla2 = new TablaAsignacionLetra();
        Nie nie2 = new Nie("Z1234567H");
        tabla2.setTablaAsignacion();
        tabla2.reemplazarLetrasPorValor(nie2);
        assertEquals("21234567H", tabla2.getResultado());
        
    }
    
    @Test
    public void testCalcularLetraNie() {
        TablaAsignacionLetra tabla = new TablaAsignacionLetra();
        Nie nie = new Nie("X1234567H");
        
        tabla.setTablaAsignacion();
        assertEquals("L", tabla.calcularLetraNie(nie));
        
        Nie niePrueba = new Nie("Y1234567H");
        assertEquals("X", tabla.calcularLetraNie(niePrueba));
        
        Nie niePrueba1 = new Nie("Y2345678H");
        assertEquals("Z", tabla.calcularLetraNie(niePrueba1));
        
         Nie niePrueba2 = new Nie("Z2345678H");
        assertEquals("M", tabla.calcularLetraNie(niePrueba2));
        
    }

}
