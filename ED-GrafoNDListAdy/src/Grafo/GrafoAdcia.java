
package Grafo;
//import listagenerica*;
/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class GrafoAdcia {
    
    int numVerts;
    static int maxVerts = 20;
    VerticeAdy[] tablAdc;
    
    public GrafoAdcia(int mx) {
        tablAdc = new VerticeAdy[mx];
        numVerts = 0;
        maxVerts = mx;
    }
    
    public GrafoAdcia() {
        this(maxVerts);
    }
    
    public int numeroDeVertices() {
        return numVerts;
    }
    
    public VerticeAdy[] vertices() {
        return tablAdc;
    }
    
    public Lista listAdyc(int v) throws Exception{
        if(v < 0 || v >= numVerts) {
            throw new Exception("Vertice fuera de rango");
            
        }
        
        return tablAdc[v].lad;
    }
    
    public void nuevoVertice(String nom) {
        boolean esta = numVertice(nom) >= 0;
        
        if(!esta) {
            VerticeAdy v = new VerticeAdy(nom);
            v.asigVert(numVerts);
            tablAdc[numVerts++] = v;
        }
    }
    
    public void nuevoArco(String a, String b) throws Exception {
        if(!adyacente(a,b)) {
            int va, vb;
            va = numVertice(a);
            vb = numVertice(b);
            if(va < 0 || vb < 0) throw new Exception("Vertice no existe");
            Arco ab = new Arco(vb);
            tablAdc[va].lad.insertarCabezaLista(ab);
            
        }    
    }
    
    public void borrarArco(String a, String b) throws Exception {
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        
        if(va < 0 || vb < 0) throw new Exception ("Vetice no existe");
        
        Arco ab = new Arco(vb);
        tablAdc[va].lad.eliminar(ab);
    }
    public boolean adyacente(String a, String b) throws Exception {
        int va, vb;
        boolean resp;
        va = numVertice(a);
        vb = numVertice(b);
        
        if(va < 0 || vb < 0) throw new Exception ("Vertice no existe");
        
        if(tablAdc[va].lad.buscarLista(new Arco(vb)) != null) 
            return true;
        else 
            return false;
            
    }
    
    public boolean adyacente(int va, int vb) throws Exception {
       if(va < 0 || vb < 0) throw new Exception ("Vertice no existe");
       if(tablAdc[va].lad.buscarLista(new Arco(vb)) != null)
           return true;
       else
           return false;
    }
    
    public int numVertice(String nm) {
        VerticeAdy v = new VerticeAdy(nm);
        boolean encontrado = false;
        int i = 0;
        
        for(; i < numVerts && !encontrado;) {
            encontrado = tablAdc[i].equals(v);
            
            if(!encontrado) i++;
        }
        
        return (i < numVerts) ? i: -1;
    }

    public void imprimirLista() {
        for(int i = 0; i < tablAdc.length; i++) {
            System.out.print(tablAdc[i] + " ");
        }
        
    }
}