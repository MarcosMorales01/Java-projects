package Principal;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import java.util.*;
import java.io.*;
public class ScoreGui extends JDialog implements ActionListener {

    public ScoreGui() {
        super();
    }
    
    public void ScoreGui() {// el método ScoreGui muestra las puntuaciones en orden de menor a mayor.
        Container containerScore = getContentPane();
        JButton buttonOk = new JButton("OK");
        buttonOk.setActionCommand("OK");
        buttonOk.addActionListener(this);
        int lineNumScore = 0;
        containerScore.add(buttonOk,BorderLayout.SOUTH);
            try {
                    String lineScoreHelp = "";
                    String[] myScoreArray = new String[100];
                    for(int i = 0; i < myScoreArray.length; i++)
                        myScoreArray[i] = " ";
                        String line1 = "";
                    BufferedReader reedTheScore = new BufferedReader(new InputStreamReader(new FileInputStream("scores.txt")));//leer los datos de las puntuaciones
                    int recordsCount = 0;
                    while((lineScoreHelp = reedTheScore.readLine()) != null) {
                        lineScoreHelp = reedTheScore.readLine();
                        if(lineScoreHelp != "") {
                            recordsCount += 1;
                            int positionScoreVariable = lineScoreHelp.indexOf("*");//use la estrella para indicar que el siguiente personaje será el nivel del laberinto por el que clasificaremos.
                            String positionScore = lineScoreHelp.substring(positionScoreVariable + 1);
                            int indexScore = Integer.parseInt(positionScore);
                            if(myScoreArray[indexScore] == " ") {
                                myScoreArray[indexScore] = lineScoreHelp;//agregue la puntuación a la matriz.
                            } else {
                                for(int i = 0; i < myScoreArray.length; i++) {
                                   if(indexScore + i < myScoreArray.length) {//evitar errores de matriz fuera de límites.
                                        if(myScoreArray[indexScore + i].equals(" ")) {
                                           myScoreArray[indexScore + 1] = lineScoreHelp;//agregar una puntuación a la siguiente área disponible de la matriz
                                        }
                                   }//final del primer if
                               }//final del ciclo for
                           }//final del else
                             JPanel scorePanel = new JPanel();
                             scorePanel.setLayout(new GridLayout(recordsCount,recordsCount));
                                for(int i = 0; i < myScoreArray.length; i++) {
                                    if(myScoreArray[i] != " ") {
                                        mainScoreLabel = new JLabel(myScoreArray[i], JLabel.LEFT);//mostrar la puntuación en la pantalla
                                        scorePanel.add(mainScoreLabel);
                                    }
                                }//final del ciclo for
                                containerScore.add(scorePanel); 
                        }//terminar primero el if
                    }//terminar primero el bucle mientras            
                }//fin del try//fin del try
                catch(IOException e) {
                    JFrame frameErrorScore = new JFrame("Alert");
                    JOptionPane.showMessageDialog(frameErrorScore, "Problem with scores.txt file.  Cant load high Scores");
                }//fin del catch
        pack();
        setVisible(true);
    }//fin del constructor
    
    public void actionPerformed(ActionEvent e) {
        dispose();
    }
    private JLabel mainScoreLabel;
}//fin de la clase