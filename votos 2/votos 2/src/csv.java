import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class csv implements Observer{
	
	public void actualizar(ArrayList<candidato> candidato) {
	    try{
	    	 FileWriter fw = new FileWriter("nuevo.csv",false);
	         BufferedWriter bw = new BufferedWriter(fw);
	         PrintWriter pw = new PrintWriter(bw);
                int votos =0;
	         for(int i=0;i<candidato.size();i++){
				   
	        	 votos = candidato.get(i).getNvotos();
	        	 pw.println(candidato.get(i).getNombre()+","+votos); 
	         }
            pw.close();        
        }catch(Exception e){
        
        }
       
	}

}
