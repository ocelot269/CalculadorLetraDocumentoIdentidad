/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumer;

import clases.TarjetaDocumentacion;


public class Nie extends TarjetaDocumentacion{

    //Variables
    private String nie=null;
    
    //Constructor
    
    public Nie(){
        super();
    }
    
    //Constructor
    
    public Nie(String nie){
        setNie(nie);
    }
    
    //Inicio Getters y setters
    
    
    public String getNie() {
        return nie;
    }

    
    public void setNie(String nie) {
        this.nie = nie;
    }
    
    
    //Fin getters y setters
    @Override
    public char getLetraDocumentacion() {
      return getNie().charAt(0);
    }

    @Override
    public String getParteNumerica() {
        return getNie().substring(1,getNie().length());
    }

    @Override
    public String getObtenerLetraDocumentacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
