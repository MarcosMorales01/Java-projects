import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class votos {
	Frame f1,f2,f3;

	JComboBox ch;
	JButton b,z;
	int nt = 0,nb = 0,no = 0;
	CareTaker caretaker = new CareTaker();
	Originator originator = new Originator();
	observado ob = new observado();
	GraficaPastel pastel = new GraficaPastel();
	GraficaBarras barras = new GraficaBarras();
	ArrayList<candidato> candidatos = new ArrayList<candidato>();
	csv excel = new csv();
	int mementos = 0;
	public votos() {
		ob.agregar(pastel);
		ob.agregar(barras);
		ob.agregar(excel);
		
		f1 = new Frame("Votos");
	
		
		f1.setLayout(new GridLayout(1,1));

	
		
	
		f1.setSize(400,500);
	
	

		ch = new JComboBox();
		b = new JButton("Votar");
		z = new JButton("Undo");
		candidato trump = new candidato();
		trump.setNombre("trump");
		candidatos.add(trump);

		candidato bush = new candidato();
		bush.setNombre("bush");
		candidatos.add(bush);
	
		candidato obama = new candidato();
		obama.setNombre("obama");
		candidatos.add(obama); 
	
		ch.addItem(trump.getNombre());
		ch.addItem(bush.getNombre());
		ch.addItem(obama.getNombre());
		f1.setVisible(true);
		f1.add(ch);
		
		
		b.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    
			if(ch.getSelectedItem() == "trump") {
				nt = nt+1;
				trump.setNvotos(nt);
				ob.notificar(candidatos);
		        originator.setEstado(candidatos);
		        caretaker.addMemento(originator.guardar());
		  
                mementos++;
			}
			if(ch.getSelectedItem()== "bush") {
				nb = nb+1;
				bush.setNvotos(nb);
				ob.notificar(candidatos);
		
				originator.setEstado(candidatos);
				
				caretaker.addMemento(originator.guardar());
				 mementos++;
			}
			if(ch.getSelectedItem()== "obama") {
				no = no+1;
				obama.setNvotos(no);
	
				ob.notificar(candidatos);
				originator.setEstado(candidatos);
			
				caretaker.addMemento(originator.guardar());
				 mementos++;
			}
		  }
		});
		f1.add(b);
		
		
		z.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			  {
				mementos = mementos-1;
				originator.restaurar(caretaker.getMemento(mementos));
				ob.notificar(candidatos);
			
			  }
		});
		
		
	    f1.add(z);


		
		
		
	
		
	}

	public static void main(String[] args) {
		
		votos obj = new votos();
		
	}
}
