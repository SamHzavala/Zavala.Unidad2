package Ejercicio3;

import javax.swing.JProgressBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ProgesoHilo implements Runnable
{
	private JProgressBar barra;
	private JPanel contentPane;
	
	
	public ProgesoHilo (JProgressBar BarraVentana)
	{
		this.barra = BarraVentana;
	}
	
	@Override
	public void run()
	{
		while (!Hilo.terminado)
		{
			//System.out.println("ProgresoHilo.Java");
			
			barra.setValue(Hilo.progreso);
			barra.repaint();
			
			if (Hilo.terminado)
			{
				barra.setValue(100);
				JOptionPane.showMessageDialog(contentPane, "A FINALIZADO LA CARGA");;
				//System.out.println("ProgesoHilo.Java");
				
				break;
			}
		}
	}
		
	
}
