
package Principal;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class GrafoMatriz {
    int numVerts;
    static final int maxVerts = 20;
    Vertice[] verts;
    int[][] matAd;
    
    public GrafoMatriz(int mx) {
        matAd = new int[mx][mx];
        verts = new Vertice[mx];
        
        for(int i = 0; i < mx; i++) {
            for(int j = 0; j < mx; j++) {
                matAd[i][j] = 0;
            }
        }
        numVerts = 0;
    }
    
    public GrafoMatriz() {
        this(maxVerts);
    }
    
    public int numeroDeVertices() {
        return numVerts;
    }
    
    public Vertice[] vertices() {
        return verts;
    }
    
    public void nuevoVertice(String nom) {
        boolean esta = numVertice(nom) >= 0;
        
        if(!esta) {
           Vertice v = new Vertice(nom); 
           v.asigVert(numVerts);
           verts[numVerts++] = v;
        }
    }
    
    public void nuevoArco(String a, String b) throws Exception{
        
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        
        if( va < 0 || vb < 0) throw new Exception("Vertice no existe");
            
        matAd[va][vb] = 1;
        matAd[vb][va] = 1;
    }
    
    public boolean adyacente(String a, String b) throws Exception {
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        
        if(va < 0 || vb < 0) throw new Exception ("Vertice no existe");
        
        return matAd[va][vb] == 1;
    }
    
    public boolean adyacente(int a, int b) throws Exception {
        int va = 0, vb = 0;
        if(va < 0 || vb < 0) throw new Exception ("Vertice no existe");
        return matAd[va][vb] == 1;
    }
    
    public int numVertice(String vs) {
        Vertice v = new Vertice(vs);
        boolean encontrado = false;
        int i = 0;
        
        for(; (i < numVerts) && !encontrado;){
            encontrado = verts[i].equals(v);
            if(!encontrado) i++;
            
        }
        return (i < numVerts) ? i : -1;
        
    }
    
    public void imprimirMatriz() {
        
        //System.out.println(matAd.length);
        
        for(int i = 0; i < matAd.length; i++) {
            System.out.print("| ");
            for(int j = 0; j < matAd.length; j++) {
                
                System.out.print(" " + matAd[i][j] + " ");
            }
            System.out.println(" |");
        }
    }
    
    public void recorridoAnchura(Vertice inicio) {
        Queue<Vertice> cola = new LinkedList<>();
        cola.add(inicio);
        //distance[s] = 0;
        Vertice actual, next;
        int i;
        /*
        while(!cola.isEmpty()) {
            actual = cola.poll();
            for(i = 0; i < (int)matAd[actual].size(); i++) {
                
            }
            
        }
*/
        
        
    }
}
