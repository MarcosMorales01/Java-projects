package Lista;
/**
 *
 * José Marcos Morales Gómez
 */

public class ListaDoble extends ListaD{
    /**
     * Inserta al inicio 
     * @param dato dato a ingresar
     */
    @Override
    public void insertaInicio(Object dato) {
        if (vacio()){
           inicio = ultimo = new NodoDoble(dato);           
        }
        else{
          NodoDoble nuevo = new NodoDoble(dato,inicio,null);
          inicio.setAnterior(nuevo);
          inicio = nuevo;
        }
    }

    /**
     * Inserta al final
     * @param dato dato a ingresar
     */
    @Override
    public void insertaFinal(Object dato) {
        if (vacio()){
          inicio = ultimo = new NodoDoble(dato);          
        }
        else{
            NodoDoble temp = new NodoDoble(dato,null,ultimo); 
            ultimo.setSiguiente(temp);
            ultimo = temp;
        }
    }
    
    /**
     * Elimina al inicio
     * @return Objeto eliminado
     */
    @Override
    public Object eliminaInicio() {
        Object eliminado = null;
        if(vacio())
            System.out.println("Lista vacía");
        else{
          if (inicio == ultimo){
            eliminado = inicio.getDato();
            inicio = ultimo = null; 
          }
          else{
            eliminado = inicio.getDato();
            inicio = inicio.getSiguiente();
            inicio.setAnterior(null);
          }                
        }
        return eliminado;
    }

    /**
     * Elimina el final
     * @return Objeto eliminado
     */
    @Override
    public Object eliminaFinal() {
        Object eliminado = null;
        if(vacio())
            System.out.println("Lista vacía");
        else{
          if (inicio == ultimo){
            eliminado = inicio.getDato();
            inicio = ultimo = null; 
          }
          else{
            eliminado = ultimo.getDato();
            ultimo = ultimo.getAnterior();
            ultimo.setSiguiente(null);
          }                
        }
        return eliminado;
    }
    
    /*
    public void insertarEnOrden(Comparable dato){
        Alumno a = (Alumno)dato;
      if(vacio()){
        insertaInicio(dato);
      }
      else
        if (inicio == ultimo){//Solo hay un dato en la lista
            if (a.compareTo((Alumno)inicio.getDato())>0)
               insertaInicio(dato);
            else
               insertaFinal(dato);
        }
       else{
        NodoDoble antes = null, despues = inicio;
        while(despues!=null && a.compareTo((Alumno)despues.getDato())<0){
          antes = despues;
          despues = despues.getSiguiente();
        }

        if(antes==null)
            insertaInicio(dato);
        else
           if(despues==null)
               insertaFinal(dato);
           else{
             NodoDoble nuevo = new NodoDoble(dato,despues,antes); 
             antes.setSiguiente(nuevo);
             despues.setAnterior(nuevo);
             nuevo.setAnterior(antes);
           }        
        } 
    }*/
}
