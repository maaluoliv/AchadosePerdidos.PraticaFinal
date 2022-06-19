package ProjetoFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;

public class BuscaJanela extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscaJanela frame = new BuscaJanela();
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
	public BuscaJanela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel buscaLabel = new JLabel("Escolha uma das op\u00E7\u00F5es de busca: ");
		buscaLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		buscaLabel.setBounds(24, 74, 277, 36);
		contentPane.add(buscaLabel);
		
		JButton botaoListar = new JButton("Listar");
		botaoListar.setForeground(Color.WHITE);
		botaoListar.setBackground(new Color(0, 51, 102));
		botaoListar.setBounds(41, 132, 115, 36);
		contentPane.add(botaoListar);
		
		JButton botaoBuscar = new JButton("Buscar Item ");
		botaoBuscar.setForeground(Color.WHITE);
		botaoBuscar.setBackground(new Color(0, 51, 102));
		botaoBuscar.setBounds(259, 132, 115, 36);
		contentPane.add(botaoBuscar);
		
		JLabel achadosPerdidosM = new JLabel("Achados e Perdidos");
		achadosPerdidosM.setFont(new Font("Freestyle Script", Font.PLAIN, 32));
		achadosPerdidosM.setBounds(127, 22, 174, 29);
		contentPane.add(achadosPerdidosM);
	}
}
