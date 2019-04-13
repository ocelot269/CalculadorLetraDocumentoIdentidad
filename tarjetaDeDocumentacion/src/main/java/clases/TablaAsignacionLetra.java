    package clases;

import java.util.HashMap;

public class TablaAsignacionLetra {

    //Variables
    private HashMap<Integer, String> documento = new HashMap<Integer, String>();    
    
    private String[] letrasDni = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B",
        "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    //Getters y setters
    public HashMap<Integer, String> getDocumento() {
        return documento;
    }

    
    public String[] getLetrasDni() {
        return letrasDni;
    }

    
    public void setLetrasDni(String[] letrasDni) {
        this.letrasDni = letrasDni;
    }
    
    public void setTablaAsignacion() { // Este método recorre una array, pàra obtener la letra del DNI
        
        for (int posicion = 0; posicion < getLetrasDni().length; posicion++) {
            getDocumento().put(posicion, getLetrasDni()[posicion]);//Se añade un valor al diccionario con clave valor
            
        }
        
    }
    
    public String getLetraDni(int posicion) { // te devuelve el valor de la clave introducida
        return getDocumento().get(posicion);
        
    }
    
    
    public int getLongitudDni() {
        return this.getLetrasDni().length;
    }
    
    
    public String calcularLetraDni(String digitos_dni) {
        int digitos = Integer.parseInt(digitos_dni);
        int calculo = digitos % getLongitudDni();
        return getLetraDni(calculo);
        
    }
    
}