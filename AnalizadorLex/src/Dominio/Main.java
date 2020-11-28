
package Dominio;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;


/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Main {

   public static boolean isRepeated(ArrayList<String> l, String test) 
	{
		for(String s: l) {
			if(s.startsWith(test))
				return true;
		}
		return false;
	}
	
	public static ArrayList<String> list = new ArrayList<String>();
	public static ArrayList<String> tokenizedList = new ArrayList<String>();
	
	public static ArrayList<String> IDS = new ArrayList<String>();
	public static ArrayList<String> TXT = new ArrayList<String>();
	public static ArrayList<String> VAL = new ArrayList<String>();
	
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		Reader.read();
		System.out.println("INICIAL");
		list.forEach(System.out::println);
		TokenIdentifier.identify(list);
		System.out.println("\nDEX");
		tokenizedList.forEach(System.out::println);
		PrintWriter writer = new PrintWriter("programa.lex", "UTF-8");
		tokenizedList.forEach(writer::println);
		writer.close();
		
		PrintWriter writer2 = new PrintWriter("programa.sim", "UTF-8");
		writer2.println("IDS");
		IDS.forEach(writer2::println);
		writer2.println("");
		writer2.println("TXT");
		TXT.forEach(writer2::println);
		writer2.println("");
		writer2.println("VAL");
		VAL.forEach(writer2::println);
		writer2.println("");
		writer2.close();
	}


    
}
