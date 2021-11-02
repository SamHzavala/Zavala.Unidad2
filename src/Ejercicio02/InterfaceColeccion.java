package Ejercicio02;


import java.util.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class InterfaceColeccion extends JFrame {
	
	Stack<String> varPila = new Stack<String>(); 

	private JPanel contentPane;
	private JTextField txtExpresion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceColeccion frame = new InterfaceColeccion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfaceColeccion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 229);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnValidar = new JButton("VALIDAR");
		btnValidar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				
				
				String varExpresion = txtExpresion.getText();
				char varCaracter = ' ';
				int flagError = 0;
				
				
				
				for (int x=0; x<varExpresion.length(); x++)
				{
					
					
					varCaracter = varExpresion.charAt(x);
					
						if (varCaracter == '(')
						{
							varPila.push("abre");
						}
						if (varCaracter == ')')
						{
							if (varPila.size() == 0)
							{
								flagError = 1;
								break;
							}
							else
							{
								varPila.pop();
							}
						}
				}
				
				if (varPila.isEmpty() && flagError == 0)
				{
					JOptionPane.showMessageDialog(btnValidar,"La expresion es correcta" );
				}
				else
				{
					JOptionPane.showMessageDialog(btnValidar,"La expresion es incorrecta");
				}
			}
		});
		btnValidar.setBounds(28, 154, 89, 23);
		contentPane.add(btnValidar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				System.exit(0);
			}
		});
		btnSalir.setBounds(186, 154, 89, 23);
		contentPane.add(btnSalir);
		
		txtExpresion = new JTextField();
		txtExpresion.setBounds(56, 74, 198, 38);
		contentPane.add(txtExpresion);
		txtExpresion.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("EXPRESION MATEMATICA");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 14));
		lblNewLabel.setBounds(68, 31, 208, 18);
		contentPane.add(lblNewLabel);
	}
}
