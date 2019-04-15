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

    public int getLongitudDni() { //Te dice la longitud del dni
        return this.getLetrasDni().length;
    }

    public String calcularLetraDni(String digitos_dni) { //calcular letra de control del dni(La ultima)
        int digitos = Integer.parseInt(digitos_dni.substring(0, digitos_dni.length()-1));
        int calculo = digitos % getLongitudDni();
        return getLetraDni(calculo);

    }

    
    public void eliminarUltimaLetra() {
        setResultado(getResultado().substring(0, getResultado().length() - 1)); //Elimina la ultima letra del nie
    }

    
    public String replazarLetrasPorValor(Nie nie) { //replaza las letra X/Y/Z por su valor
        
        switch (nie.getPrimeraLetraDocumentacion()) {
            case 'X':
                setResultado(nie.getNie().replaceFirst(String.valueOf(nie.getPrimeraLetraDocumentacion()), "0"));
                break;

            case 'Y':

                setResultado(nie.getNie().replaceFirst(String.valueOf(nie.getPrimeraLetraDocumentacion()), "1"));
                break;

            case 'Z':

                setResultado(nie.getNie().replaceFirst(String.valueOf(nie.getPrimeraLetraDocumentacion()), "2"));
                break;
        }

        return getResultado();
    }

    
    public String calcularLetraNie(Nie nie) { //te obtiene la ultima letra
        int calculo = 0;
        replazarLetrasPorValor(nie);
        eliminarUltimaLetra();
        calculo = Integer.parseInt(getResultado()) % getLongitudDni();
        setResultado(getLetraDni(calculo));

        return getResultado();

    }

}
