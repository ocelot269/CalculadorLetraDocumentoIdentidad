/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumer;

import clases.TablaAsignacionLetra;
import org.junit.Test;
import static org.junit.Assert.*;

public class DniIT {

    public DniIT() {
    }
    

    @Test
    public void testGetLetraDocumentacion() {
        Dni documento = new Dni("43224953H");
        assertEquals('H', documento.getUltimaLetraDocumentacion());
        // assertEquals('z', documento.getLetraDni());
    }

    @Test
    public void testGetParteNumerica() {
        Dni documento = new Dni("43224953H");
        assertEquals("43224953", documento.getParteNumerica());
    }

    @Test
    public void testGetObtenerLetraDni() {
        Dni documento = new Dni("43224953H");
        TablaAsignacionLetra tabla = new TablaAsignacionLetra();
        tabla.setTablaAsignacion();
      
        assertEquals("H", tabla.calcularLetraDni("43224953"));
        
        assertEquals("H",documento.getObtenerLetraDocumentacion());
        
    }
    
    
    @Test
    public void testValidadorDocumentoIdentidad() {
        Dni documento = new Dni();
        assertEquals(true, documento.validadorDocumentoIdentidad("43224953H"));
        assertEquals(false, documento.validadorDocumentoIdentidad("43224953Ñ"));
        assertEquals(false, documento.validadorDocumentoIdentidad("43224953a"));
        assertEquals(false, documento.validadorDocumentoIdentidad("453a"));

    }

}
