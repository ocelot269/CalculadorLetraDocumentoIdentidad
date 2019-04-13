package consumer;

import clases.TablaAsignacionLetra;
import clases.TarjetaDocumentacion;
import interfaces.Validable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dni extends TarjetaDocumentacion implements Validable {

    //variables
    private String dni;

    private TablaAsignacionLetra tablaAsignacion = new TablaAsignacionLetra();

    //Constructor
    
    
    public Dni() {
        super();
    }

    //Constructor
    
    
    public Dni(String dni) {
        this.dni = dni;
    }

    
    //getters y setters
    
    
    public void setDni(String dni) {
        this.dni = dni;
    }

    
    public TablaAsignacionLetra getTablaAsignacion() {
        return tablaAsignacion;
    }

    
    public String getDni() {
        return this.dni;
    }

    //Fin getters y setters
    
    
    //Inicio logica
    @Override
    public char getLetraDocumentacion() { // obtiene la letra del dni si el dni es valido y te la devuelve como char
        char letra = 0;
        
        if (validadorDocumentoIdentidad()) {
            letra = this.getDni().charAt(getDni().length() - 1);

        }
        else {
            
        }
        
        return letra;
    }
    
    
    @Override
    public String getParteNumerica() {      //Recoge del dni pasado que esté correctamente escrito y te devuelve el string
        
        String digitosDni =null;
        
        if (validadorDocumentoIdentidad()) {
            digitosDni = this.getDni().substring(0, this.getDni().length() - 1); //Aqui obtiene la parte numerica y la devuelve en forma de String
        }
        return digitosDni;
    }
    
    @Override
    public String getObtenerLetraDocumentacion() {
        return getTablaAsignacion().calcularLetraDni(getParteNumerica());
    }

    
    @Override
    public boolean validadorDocumentoIdentidad(String Dni) { //Te valida que el String que le pases se ha valido
        
        Pattern validatorDni = Pattern.compile("^[0-9]{8,8}[^IÑOUa-z]");
        Matcher comparador = validatorDni.matcher(Dni);

        return comparador.matches();
    }

    @Override
    public boolean validadorDocumentoIdentidad() { //Te valida que el patron que comprueba se a correcto
        
        Pattern validatorDni = Pattern.compile("^[0-9]{8,8}[^IÑOUa-z]");
        Matcher comparador = validatorDni.matcher(getDni());

        return comparador.matches();
    }

}
