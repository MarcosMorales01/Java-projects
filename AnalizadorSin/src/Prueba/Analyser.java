/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Analyser {
    public static final String ASIGNACION_INVALIDA = "Asignacion invalida";
	public static final String PROGRAMA_INICIADO = "El inicio del programa ya se habia definido";
	public static final String ERROR_COMPARACION = "Error de sintaxis en comparacion";
	public static final String ERROR_LECTURA = "Error de sintaxis al leer";
	public static final String ERROR_IMPRESION = "Error en la sintaxis de impresion";
	public static final String ERROR_ASIGNACION = "Error de asignacion";
	public static final String ERROR_REPETICION = "Error en la sintaxis de REPETIR";
	//System.out.println("pop"+Main.changedStack.peek());
	public static void analyze() {
		while (!Main.changedStack.empty()) {
			switch (Main.changedStack.peek()) {
			
			case "SINO":
				if(Main.needStack.peek().equals("FINSI"))
				Main.changedStack.pop();
				else {
					Main.error("ERROR DE FINSI");
					return;
				}
				break;
			
			case "SI":
				Main.changedStack.pop();
				if(Main.changedStack.peek().equals("COMPARA")) {
					compara();
					Main.needStack.push("FINSI");
					if(Main.changedStack.peek().equals("ENTONCES")) {
						Main.changedStack.pop();
					} else {
						Main.error("Falta ENTONCES, despues de SI");
						return;
					}
					
				} else {
					Main.error("No hay comparacion en SI");
					return;
				}
				break;
			
			
			
			
			
			
			
			
			
			case "FINSI":
				Main.changedStack.pop();
				if(Main.needStack.peek().equals("FINSI")) {
					Main.needStack.pop();
				} else {
					Main.error("Error de SI-FINSI");
					return;
				}
				break;
			
			case "FINREP":
				if(Main.needStack.peek().equals("FINREP")) {
					Main.changedStack.pop();
					Main.needStack.pop();
				} else {
					Main.error(ERROR_REPETICION);
				}
				break;
			case "REPITE":
				
				Main.changedStack.pop();
				if(Main.changedStack.peek().equals("ID")) {
					Main.changedStack.pop();
					if(Main.changedStack.peek().equals("VECES")) {
						Main.changedStack.pop();
						Main.needStack.push("FINREP");
					} else {
						Main.error(ERROR_REPETICION);
					}
				} else {
					Main.error(ERROR_REPETICION);
				}
				break;
			case "PROGRAMA":
				if (Main.needStack.contains("FINPROG")) {
					Main.error(PROGRAMA_INICIADO);
					return;
				} else {
					
					Main.changedStack.pop();
				
					if (Main.changedStack.peek().equals("ID")) {
						
						Main.changedStack.pop();
						if (Main.changedStack.peek().equals("ASGN")) {
							Main.error(ASIGNACION_INVALIDA);
						}
					}
					Main.needStack.push("FINPROG");
				}
				break;

			case "IMPRIME":
				Main.changedStack.pop();
				if (Main.changedStack.peek().equals("ID") || Main.changedStack.peek().equals("T3XT")) {
					Main.changedStack.pop();
				} else {
					Main.error(ERROR_IMPRESION);
				}
				break;
			case "LEE":
				Main.changedStack.pop();
				if (Main.changedStack.peek().equals("ID")) {
					Main.changedStack.pop();
				} else {
					Main.error(ERROR_LECTURA);
				}
				break;

			case "FINPROG":
				Main.changedStack.pop();
				if (Main.needStack.peek().equals("FINPROG")) {
					Main.needStack.pop();
				}
				
				else {
					Main.error("Error se encontro final de programa antes de terminar el codigo");
					return;
				}	break;
				

			case "$":
				if (Main.needStack.peek().equalsIgnoreCase("$"))
					javax.swing.JOptionPane.showMessageDialog(null, "Compilacion exitosa");
				return;

			case "ID":
				Main.changedStack.pop();
				if (Main.changedStack.peek().equals("ASGN")) {
					Main.changedStack.pop();
					if (Main.changedStack.peek().equals("ID")) {
						Main.changedStack.pop();
						if (Main.changedStack.peek().equals("OPAR")) {
							Main.changedStack.pop();
							if (Main.changedStack.peek().equals("ID")) {
								Main.changedStack.pop();
						
							} else {
								Main.error(ERROR_ASIGNACION);
							
							}
						} else {
							
						}
					} else {
						
						Main.error(ERROR_ASIGNACION);
					
					}
				} else {
					
					Main.error(ERROR_ASIGNACION);
				
				}
				break;
		default:
			Main.error("Error de sintaxis");
			return;
			}
		}
	}

	public static void compara() {

		Main.changedStack.pop();
		if (Main.changedStack.peek().equals("ID")) {
			Main.changedStack.pop();
			if (Main.changedStack.peek().equals("OPREL")) {
				Main.changedStack.pop();
				if (Main.changedStack.peek().equals("ID")) {
					Main.changedStack.pop();
				} else {
					Main.error("ERROR_COMPARACION");
				}
			} else {
				Main.error("ERROR_COMPARACION");
			}
		} else {
			Main.error("ERROR_COMPARACION");
		}

	}

}
