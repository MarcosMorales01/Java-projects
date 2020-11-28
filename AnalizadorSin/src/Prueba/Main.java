/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import java.util.Stack;

/**
 *
 * @author Jose Marcos Morales Gomez
 */
public class Main {


	public static Stack<String> initialStack = new Stack<>();
	public static Stack<String> changedStack = new Stack<>();
	public static Stack<String> needStack = new Stack<>();

	public static void error(String e) {
		javax.swing.JOptionPane.showMessageDialog(null, e);
	}

	public static void main(String[] args) {
		needStack.push("$");
		changedStack.push("$");
		Reader.read();
		while (!initialStack.empty()) {
			if (initialStack.peek().equals("HEX"))
				changedStack.push("ID");
			else
				changedStack.push(initialStack.peek());
			initialStack.pop();
		}

		changedStack.forEach(System.out::println);
		if (changedStack.contains("Error"))
			error("Error lexico");
		Analyser.analyze();

	}


    
}
