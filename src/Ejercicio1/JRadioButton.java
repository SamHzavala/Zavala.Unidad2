package Ejercicio1;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JRadioButton extends JFrame {

	private JPanel contentPane;
	String[] VectorPreguntas = {"1.- A quien le decian 007: ", "2.- Callie es diminutivo de: ", 
			"3.- Que personaje murio en la temporada 11 episodio 23: ", "4.- Cuantos hijos tiene meredith grey: ", 
			"5.- Quien fue la persona de Meredith Grey: "};
		int ContRespuestasBien = 0;
		int ContQuiz = 0;
	String[] VectorRespuestasCorrectas = {"George O'malley", "Calliope", "Derek Shepherd", "Tres Hijos", "Cristina Yang y Alex Karev"};
	String[] VectorRespuestasIncorrectas1 = {"Alex Karev", "California", "Lexie Grey", "Dos Hijos", "Lexie Grey y Mark Sloan"};
	String[] VectorRespuestasIncorrectas2 = {"Arizona Robbins", "Carolina", "Mark Sloan", "Cinco Hijos", "Maggie Pierce y Izzie Stevens"};
	private JLabel lblPregunta;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioButton frame = new JRadioButton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public JRadioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 414);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		javax.swing.JRadioButton rdbtnRespuesta1 = new javax.swing.JRadioButton("George O'malley");
		rdbtnRespuesta1.setBackground(new Color(135, 206, 250));
		rdbtnRespuesta1.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		rdbtnRespuesta1.setForeground(new Color(128, 0, 0));
		rdbtnRespuesta1.setBounds(47, 111, 353, 28);
		contentPane.add(rdbtnRespuesta1);
		
		javax.swing.JRadioButton rdbtnRespuesta2 = new javax.swing.JRadioButton("Alex Karev");
		rdbtnRespuesta2.setBackground(new Color(135, 206, 250));
		rdbtnRespuesta2.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		rdbtnRespuesta2.setForeground(new Color(128, 0, 0));
		rdbtnRespuesta2.setBounds(47, 163, 353, 28);
		contentPane.add(rdbtnRespuesta2);
		
		javax.swing.JRadioButton rdbtnRespuesta3 = new javax.swing.JRadioButton("Arizona Robbins");
		rdbtnRespuesta3.setBackground(new Color(135, 206, 250));
		rdbtnRespuesta3.setFont(new Font("Sitka Subheading", Font.BOLD, 16));
		rdbtnRespuesta3.setForeground(new Color(128, 0, 0));
		rdbtnRespuesta3.setBounds(48, 226, 352, 28);
		contentPane.add(rdbtnRespuesta3);
		
		ButtonGroup radRespuesta = new ButtonGroup();
		radRespuesta.add(rdbtnRespuesta1);
		radRespuesta.add(rdbtnRespuesta2);
		radRespuesta.add(rdbtnRespuesta3);
		
		
		
		JButton btnAnterior = new JButton("ANTERIOR");
		btnAnterior.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ContQuiz--;
				switch(ContQuiz)
				{
				case 0:
					lblPregunta.setText(VectorPreguntas[ContQuiz].toString());
					rdbtnRespuesta1.setText(VectorRespuestasIncorrectas1[ContQuiz].toString());
					rdbtnRespuesta2.setText(VectorRespuestasCorrectas[ContQuiz].toString());
				rdbtnRespuesta3.setText(VectorRespuestasIncorrectas2[ContQuiz].toString());
				;break;
				case 1:
					lblPregunta.setText(VectorPreguntas[ContQuiz].toString());
					rdbtnRespuesta1.setText(VectorRespuestasIncorrectas1[ContQuiz].toString());
					rdbtnRespuesta2.setText(VectorRespuestasCorrectas[ContQuiz].toString());
					rdbtnRespuesta3.setText(VectorRespuestasIncorrectas2[ContQuiz].toString());
					;break;
				case 2:
					lblPregunta.setText(VectorPreguntas[ContQuiz].toString());
					rdbtnRespuesta1.setText(VectorRespuestasIncorrectas1[ContQuiz].toString());
					rdbtnRespuesta2.setText(VectorRespuestasCorrectas[ContQuiz].toString());
					rdbtnRespuesta3.setText(VectorRespuestasIncorrectas2[ContQuiz].toString());
					;break;
				case 3:
					lblPregunta.setText(VectorPreguntas[ContQuiz].toString());
					rdbtnRespuesta1.setText(VectorRespuestasIncorrectas1[ContQuiz].toString());
					rdbtnRespuesta2.setText(VectorRespuestasCorrectas[ContQuiz].toString());
					rdbtnRespuesta3.setText(VectorRespuestasIncorrectas2[ContQuiz].toString());
					;break;
				case 4:
					lblPregunta.setText(VectorPreguntas[ContQuiz].toString());
					rdbtnRespuesta1.setText(VectorRespuestasIncorrectas1[ContQuiz].toString());
					rdbtnRespuesta2.setText(VectorRespuestasCorrectas[ContQuiz].toString());
					rdbtnRespuesta3.setText(VectorRespuestasIncorrectas2[ContQuiz].toString());
					;break;
				
				}
				
			}
		});
		btnAnterior.setBackground(new Color(238, 232, 170));
		btnAnterior.setForeground(new Color(51, 0, 51));
		btnAnterior.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		btnAnterior.setBounds(10, 311, 113, 23);
		contentPane.add(btnAnterior);
		
		JButton btnSiguiente = new JButton("SIGUIENTE");
		btnSiguiente.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(rdbtnRespuesta2.isSelected())
				{
					ContRespuestasBien++;
				}
				ContQuiz++;
				switch(ContQuiz)
				{
				case 0:
					lblPregunta.setText(VectorPreguntas[ContQuiz].toString());
					rdbtnRespuesta1.setText(VectorRespuestasIncorrectas1[ContQuiz].toString());
					rdbtnRespuesta2.setText(VectorRespuestasCorrectas[ContQuiz].toString());
					rdbtnRespuesta3.setText(VectorRespuestasIncorrectas2[ContQuiz].toString());
					;break;
				case 1:
					lblPregunta.setText(VectorPreguntas[ContQuiz].toString());
					rdbtnRespuesta1.setText(VectorRespuestasIncorrectas1[ContQuiz].toString());
					rdbtnRespuesta2.setText(VectorRespuestasCorrectas[ContQuiz].toString());
					rdbtnRespuesta3.setText(VectorRespuestasIncorrectas2[ContQuiz].toString());
					;break;
				case 2:
					lblPregunta.setText(VectorPreguntas[ContQuiz].toString());
					rdbtnRespuesta1.setText(VectorRespuestasIncorrectas1[ContQuiz].toString());
					rdbtnRespuesta2.setText(VectorRespuestasCorrectas[ContQuiz].toString());
					rdbtnRespuesta3.setText(VectorRespuestasIncorrectas2[ContQuiz].toString());
					;break;
				case 3:
					lblPregunta.setText(VectorPreguntas[ContQuiz].toString());
					rdbtnRespuesta1.setText(VectorRespuestasIncorrectas1[ContQuiz].toString());
					rdbtnRespuesta2.setText(VectorRespuestasCorrectas[ContQuiz].toString());
					rdbtnRespuesta3.setText(VectorRespuestasIncorrectas2[ContQuiz].toString());
					;break;
				case 4:
					lblPregunta.setText(VectorPreguntas[ContQuiz].toString());
					rdbtnRespuesta1.setText(VectorRespuestasIncorrectas1[ContQuiz].toString());
					rdbtnRespuesta2.setText(VectorRespuestasCorrectas[ContQuiz].toString());
					rdbtnRespuesta3.setText(VectorRespuestasIncorrectas2[ContQuiz].toString());
					;break;
					
					
				}
				
				
				
			}
		});
		
		btnSiguiente.setBackground(new Color(238, 232, 170));
		btnSiguiente.setForeground(new Color(51, 0, 51));
		btnSiguiente.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		btnSiguiente.setBounds(133, 311, 113, 23);
		contentPane.add(btnSiguiente);
		
		JButton btnEvaluar = new JButton("EVALUAR");
		btnEvaluar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(contentPane, "La puntuacion que alcanzo fue de: " + ContRespuestasBien + " Puntos.");;
			}
		});
		btnEvaluar.setBackground(new Color(238, 232, 170));
		btnEvaluar.setForeground(new Color(51, 0, 51));
		btnEvaluar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		btnEvaluar.setBounds(256, 311, 98, 23);
		contentPane.add(btnEvaluar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBackground(new Color(238, 232, 170));
		btnSalir.setForeground(new Color(51, 0, 51));
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				System.exit(0);
			}
		});
		btnSalir.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		btnSalir.setBounds(364, 311, 107, 23);
		contentPane.add(btnSalir);
		
		lblPregunta = new JLabel("A quien le decian 007:");
		lblPregunta.setFont(new Font("Sylfaen", Font.BOLD, 17));
		lblPregunta.setForeground(new Color(102, 0, 204));
		lblPregunta.setBounds(37, 23, 416, 54);
		contentPane.add(lblPregunta);
	}
}
