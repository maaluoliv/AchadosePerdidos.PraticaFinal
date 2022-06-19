package ProjetoFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;

public class GerenciadorJanela extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenciadorJanela frame = new GerenciadorJanela();
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
	public GerenciadorJanela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Selecione uma das op\u00E7\u00F5es do gerenciador:");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 61, 303, 33);
		contentPane.add(lblNewLabel);
		
		JButton alterarBotao = new JButton("Alterar Item");
		alterarBotao.setBackground(new Color(0, 51, 102));
		alterarBotao.setForeground(Color.WHITE);
		alterarBotao.setFont(new Font("Century", Font.PLAIN, 11));
		alterarBotao.setBounds(55, 120, 120, 33);
		contentPane.add(alterarBotao);
		
		JButton excluirBotao = new JButton("Excluir Item");
		excluirBotao.setForeground(Color.WHITE);
		excluirBotao.setBackground(new Color(0, 51, 102));
		excluirBotao.setFont(new Font("Century", Font.PLAIN, 11));
		excluirBotao.setBounds(232, 120, 120, 33);
		contentPane.add(excluirBotao);
		
		JLabel achadosPerdidosM = new JLabel("Achados e Perdidos");
		achadosPerdidosM.setFont(new Font("Freestyle Script", Font.PLAIN, 32));
		achadosPerdidosM.setBounds(120, 11, 174, 29);
		contentPane.add(achadosPerdidosM);
	}

}
