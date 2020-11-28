import java.awt.Frame;
import java.awt.GridLayout;
import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficaBarras implements Observer {
	Frame f = new Frame("Barras");
	
	DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	JFreeChart barra = ChartFactory.createBarChart("Votos", null, null, dataset, PlotOrientation.VERTICAL, true, true, false);
	ChartPanel barras = new ChartPanel(barra);
	
	
	public void Graficar(ChartPanel chartpanel) {
		 f.setLayout(new GridLayout(1,1));
		 f.setSize(400,500);  
		 f.setLocation(1200,0);
		 f.add(barras);
		 f.setVisible(true);
		
		 
			 
	
	}
	@Override
	public void actualizar(ArrayList<candidato> candidato) {
		for(int i=0;i<candidato.size();i++){
			   
			String serie = candidato.get(i).getNombre();
			dataset.addValue(candidato.get(i).getNvotos(), serie,"");
   
         }

		
		
		Graficar(barras);
	
	}

	

}
