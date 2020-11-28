import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.RootPaneContainer;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;



public class GraficaPastel implements Observer {
	Frame f = new Frame("Pastel");
	DefaultPieDataset pie = new DefaultPieDataset();
	JFreeChart chart = ChartFactory.createPieChart("Votos",pie,true,true,false);
	ChartPanel panel = new ChartPanel(chart);
	 public void Graficar(DefaultPieDataset pie){
		
		 f.setLayout(new GridLayout(1,1));
		 f.setSize(400,500);  
		 f.setLocation(800,0);

		
		 
			 f.add(panel);
			 f.setVisible(true);
	    }
	
	

	 
  


	@Override
	public void actualizar(ArrayList<candidato> candidato) {
		
		for(int i=0;i<candidato.size();i++){
			   
			pie.setValue(candidato.get(i).getNombre(),candidato.get(i).getNvotos());
		
   
         }
		
	
		Graficar(pie);
		
	}
	
	
}
	
