package ProjetoFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;

public class ListarJanela extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarJanela frame = new ListarJanela();
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
	public ListarJanela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel listarLabel = new JLabel("Voc\u00EA deseja listar os itens por data ou status ?");
		listarLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		listarLabel.setBounds(21, 87, 334, 34);
		contentPane.add(listarLabel);
		
		JButton botaoData = new JButton("Data");
		botaoData.setForeground(Color.WHITE);
		botaoData.setBackground(new Color(0, 51, 102));
		botaoData.setBounds(64, 144, 104, 34);
		contentPane.add(botaoData);
		
		JButton botaoStatus = new JButton("Status");
		botaoStatus.setBackground(new Color(0, 51, 102));
		botaoStatus.setForeground(Color.WHITE);
		botaoStatus.setBounds(240, 144, 104, 34);
		contentPane.add(botaoStatus);
		
		JLabel achadosPerdidosM = new JLabel("Achados e Perdidos");
		achadosPerdidosM.setFont(new Font("Freestyle Script", Font.PLAIN, 32));
		achadosPerdidosM.setBounds(138, 23, 174, 29);
		contentPane.add(achadosPerdidosM);
	}

}
