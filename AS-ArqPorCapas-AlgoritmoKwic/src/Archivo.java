/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author heri9621
 */
public class Archivo {
    
    private String root;
    private ArrayList<String> listOfWords;
    
    
        public Archivo(String root) throws FileNotFoundException {
        this.root = root;
        this.listOfWords = listOfWords();
    }
    
        private ArrayList<String> listOfWords() throws FileNotFoundException {
        ArrayList<String> auxList = new ArrayList<>();
        File archivo = new File(this.root);
        Scanner sc = new Scanner(archivo);
        while(sc.hasNextLine()){
            auxList.add(sc.nextLine().toLowerCase());
        }
        return auxList;
    }
}
