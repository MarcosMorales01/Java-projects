package dominio;

/**
 *
 * @author marco
 */
public class Fecha {
    
    private int dia;
    private int mes;
    private int anio;
    private String mes2;
    
    public int getDia(){
        return dia;
    }
    
    public void setDia(int dia){
       this.dia = dia; 
    }
    
    public int getMes(){
        return mes;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getAnio(){
        return anio;
    }
    
    public void setAnio(int anio){
        this.anio = anio;
    }
    
    public String DarFechaFormatoNumerico(){ // 01/05/2019
        String fechaFormtNumerico;
        fechaFormtNumerico = Integer.toString(dia) + '/' + Integer.toString(mes) + '/' + Integer.toString(anio);
        return fechaFormtNumerico;
    }
    
    public String DarFechaFormatoTexto(){ // 01 de mayo del 2019
        String fechaFormtNumerico;
        fechaFormtNumerico = Integer.toString(dia) + " de " + mes2 + " de " + Integer.toString(anio);
        return fechaFormtNumerico;
    }
    
    public void RecibirFecha( int day, int month, int year ){
        
        dia = day;
        anio = year;
        
        switch( month ){
            case 1: 
                mes2 = "enero";
                break;
            case 2: 
                mes2 = "febrero";
                break;
            case 3: 
                mes2 = "marzo";
                break;
            case 4: 
                mes2 = "abril";
                break; 
            case 5: 
                mes2 = "mayo";
                break;
            case 6: 
                mes2 = "junio";
                break;
            case 7: 
                mes2 = "julio";
                break;
            case 8: 
                mes2 = "agosto";
                break;
            case 9: 
                mes2 = "septiembre";
                break;
            case 10: 
                mes2 = "octubre";
                break;
            case 11: 
                mes2 = "noviembre";
                break;
            case 12: 
                mes2 = "diciembre";
                break;
            default:
                break;
        }
    }
}
