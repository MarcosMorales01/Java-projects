package Score;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import java.util.*;
import java.io.*;
public class ScoreGui extends JDialog implements ActionListener
{

    public ScoreGui()
    {
        super();
    }
    public void ScoreGui()//the ScoreGui Method displays the scores in order from lowest to highest.
    {
        Container cp = getContentPane();
        JButton ok = new JButton("OK");
        
        ok.setActionCommand("OK");
        ok.addActionListener(this);
        
        int lineNum = 0;
        cp.add(ok,BorderLayout.SOUTH);
             try{
                    String line = "";
                    String[] myScoreArray = new String[100];
                    
                    //* No tiene corchetes este for
                    for(int i = 0; i < myScoreArray.length; i++)
                        myScoreArray[i] = " ";
                        String line1 = "";
                    BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream("scores.txt")));//leer los datos de las puntuaciones
                    int recordsCount=0;
                    while((line = br1.readLine()) != null) 
                    {
                        line = br1.readLine();
                        if(line != "")
                        {
                            recordsCount += 1;
                            int tempPOS = line.indexOf("*");//use la estrella para indicar que el siguiente personaje será el nivel del laberinto por el que clasificaremos.
                            String pos = line.substring(tempPOS + 1);
                            int index = Integer.parseInt(pos);
                            
                            if(myScoreArray[index] == " ")
                                myScoreArray[index] = line;//agregue la puntuación a la matriz.
                          else
                          {
                               for(int i = 0; i < myScoreArray.length; i++)
                               {
                                   if(index + i < myScoreArray.length)//evitar errores de matriz fuera de límites.
                                   {
                                   if(myScoreArray[index + i].equals(" "))
                                   {
                                       myScoreArray[index + 1] = line;//agregar una puntuación a la siguiente área disponible de la matriz
                                   }
                                   }//final del primer if
                               }//final del ciclo for
                           }//final del else
                             JPanel scorePanel = new JPanel();
                             scorePanel.setLayout(new GridLayout(recordsCount,recordsCount));
                             
                                 for(int i = 0; i < myScoreArray.length; i++)
                                 {
                                     if(myScoreArray[i] != " ")
                                     {
                                         mainLabel = new JLabel(myScoreArray[i], JLabel.LEFT);//mostrar la puntuación en la pantalla
                                         scorePanel.add(mainLabel);
                                         setLocation(700,70);
                                     }
                                 }//final del ciclo for
                                cp.add(scorePanel); 
                           }//terminar primero el if
                     }//terminar primero el bucle mientras            
                }//fin del try
                catch(IOException ex) {
                    JFrame frame = new JFrame("Alert");
                    JOptionPane.showMessageDialog(frame, "Problem with scores.txt file.  Cant load high Scores");
                }//fin del catch
        pack();
        setVisible (true);
    }//fin del constructor
    
    public void actionPerformed(ActionEvent e)
    {
        dispose();
    }
private JLabel mainLabel;
}//fin de la clase