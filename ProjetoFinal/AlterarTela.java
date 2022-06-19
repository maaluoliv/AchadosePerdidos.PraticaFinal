package ProjetoFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Font;

public class AlterarTela extends JFrame {

	private JPanel contentPane;
	private JTextField alterarBusca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarTela frame = new AlterarTela();
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
	public AlterarTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Preencha o campo com algum dado do item (Item, local, data, etc) :");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel.setBounds(22, 81, 379, 26);
		contentPane.add(lblNewLabel);
		
		alterarBusca = new JTextField();
		alterarBusca.setForeground(SystemColor.text);
		alterarBusca.setBounds(31, 118, 292, 20);
		contentPane.add(alterarBusca);
		alterarBusca.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Alterar");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(22, 53, 53, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel achadosPerdidosM = new JLabel("Achados e Perdidos");
		achadosPerdidosM.setFont(new Font("Freestyle Script", Font.PLAIN, 32));
		achadosPerdidosM.setBounds(122, 23, 174, 29);
		contentPane.add(achadosPerdidosM);
	}
}
