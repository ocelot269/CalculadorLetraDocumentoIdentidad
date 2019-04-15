package clases;

import consumer.Nie;
import java.util.HashMap;

public class TablaAsignacionLetra {

    //Variables
    private HashMap<Integer, String> documento = new HashMap<Integer, String>();

    private String[] letrasDni = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B",
        "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    private String resultado = "";

    //Getters y setters
    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

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

    
    public void eliminarUltimaLetra(){
        setResultado(getResultado().substring(0, getResultado().length() - 1));
    }
    public String replazarLetrasPorValor(Nie nie) {
        switch (nie.getLetraDocumentacion()) {
            case 'X':
                setResultado(nie.getNie().replaceFirst(String.valueOf(nie.getLetraDocumentacion()), "0"));
                break;

            case 'Y':

                setResultado(nie.getNie().replaceFirst(String.valueOf(nie.getLetraDocumentacion()), "1"));
                break;

            case 'Z':

                setResultado(nie.getNie().replaceFirst(String.valueOf(nie.getLetraDocumentacion()), "2"));
                break;
        }

               
        
         return getResultado();
    }

    //Falta refactorizar
    public String calcularLetraNie(Nie nie) {
        int calculo = 0;
                replazarLetrasPorValor(nie);
                eliminarUltimaLetra();
                calculo = Integer.parseInt(getResultado()) % getLongitudDni();
                setResultado(getLetraDni(calculo));
                

        return getResultado();

    }

}
