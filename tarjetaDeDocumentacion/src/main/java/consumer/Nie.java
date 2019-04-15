package consumer;

import clases.TablaAsignacionLetra;
import clases.TarjetaDocumentacion;
import interfaces.Validable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Nie extends TarjetaDocumentacion implements Validable{

    //Variables
    private String nie = "";
    private TablaAsignacionLetra tabla = new TablaAsignacionLetra();

    //Constructor
    public Nie() {
        super();
    }

    //Constructor
    public Nie(String nie) {
        setNie(nie);
    }

    //Inicio Getters y setters
    public TablaAsignacionLetra getTabla() {
        return tabla;
    }

    public String getNie() {
        return nie;
    }
    
    
    public void getTablaAsignacion() {
        getTabla().setTablaAsignacion();
    }

    public void setNie(String nie) {
        this.nie = nie;
    }

    //Fin getters y setters
    @Override
    public char getPrimeraLetraDocumentacion() { //Obtienes la primera letra
        return getNie().charAt(0);
    }

    @Override
    public String getParteNumerica() { //Obtienes la parte Numerica del nie
        
        return getNie().substring(1, getNie().length()-1);
    }

    @Override
    public String getObtenerLetraDocumentacion() { //Obtiene la letra de control del nie
        getTablaAsignacion();
        return getTabla().calcularLetraNie(this);

    }

    @Override
    public boolean validadorDocumentoIdentidad() { //Te valida el que nie esté bien escrito
        Pattern validatorDni = Pattern.compile("^[XYZ]{1}[0-9]{7}[^IÑOU]{1,1}$");
        Matcher comparador = validatorDni.matcher(getNie());
        
        return comparador.matches();
    }

    @Override
    public boolean validadorDocumentoIdentidad(String Dni) { //Te valida que el String que le pases este bien Escrito
        Pattern validatorDni = Pattern.compile("^[XYZ]{1}[0-9]{7}[^IÑOU]{1,1}$");
        Matcher comparador = validatorDni.matcher(Dni);

        return comparador.matches();
    }
}

