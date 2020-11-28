/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
class TokenIdentifier {
    //ID, T3XT, HEX, ASGN, OPAR, OPREL;
	private static String operadoresAritmeticos[] = {"+", "-", "*", "/"};
	private static String operadoresRelacionales[] = {">", "<", "=="};
	private static String palabrasReservadas[] = {"PROGRAMA", "FINPROG", "SI", "ENTONCES"
			,"SINO", "FINSI", "REPITE", "VECES", "FINREP", "IMPRIME","LEE", "COMPARA"};
	public static void identify(ArrayList<String> list ) {
		for(String s: list) {//line by line
			if(s.startsWith("#"))
				continue;
			if(s.contains("\"")) {
				System.out.println(s);
				
				s=s.substring(0, s.indexOf("\""))+s.substring(s.indexOf("\"")).replaceAll("\\s+","");
				System.out.println(s);
			}
			String[] splited = s.split(" ");	
			outter:for(String cadenaDividida: splited) {
				for(String ar: operadoresAritmeticos) {
					if(cadenaDividida.equals(ar)) {
						Main.tokenizedList.add(Token.OPAR.name());
						continue outter;
					}
				}
				
				for(String rel: operadoresRelacionales) {
					if(cadenaDividida.equals(rel)) {
						Main.tokenizedList.add(Token.OPREL.name());
						continue outter;
					}
				}
				
				for(String res: palabrasReservadas) {
					if(cadenaDividida.equals(res)) {
						Main.tokenizedList.add(res);
						continue outter;
					}
				}
			
				if(isID(cadenaDividida)) {
					Main.tokenizedList.add(Token.ID.name());
					if(!Main.isRepeated(Main.IDS, cadenaDividida))
					Main.IDS.add(cadenaDividida+", ID"+(Main.IDS.size()+1));
					continue outter;
				}
				if(isLiteral(cadenaDividida)) {
					Main.tokenizedList.add(Token.T3XT.name());
					if(!Main.isRepeated(Main.TXT, cadenaDividida))
					Main.TXT.add(cadenaDividida+", TX"+(Main.TXT.size()+1));
					continue outter;
				}
				if(isHEX(cadenaDividida)) {
					Main.tokenizedList.add(Token.HEX.name());
					if(!Main.isRepeated(Main.VAL, cadenaDividida))
					Main.VAL.add(cadenaDividida+", "+Integer.parseInt(cadenaDividida.substring(2),16));
					continue outter;
				}
				if(cadenaDividida.equalsIgnoreCase("=")) {
					Main.tokenizedList.add(Token.ASGN.name());
					continue outter;
				}
			
			
				Main.tokenizedList.add("Error");
			}
		}
	}
	public static boolean isID(String s) {
		if(s.matches("[A-Za-z][A-Za-z0-9]+")) {
			return true;
		}
		return false;
	}
	public static boolean isLiteral(String s) {
		if(s.matches("\""+"[A-Za-z0-9]+"+"\"")) {
			return true;
		}
		return false;
	}
	
	public static boolean isHEX(String s) {
		if(s.matches("0x"+"[A-Za-z0-9]+")) {
			return true;
		}
		return false;
	}

}
