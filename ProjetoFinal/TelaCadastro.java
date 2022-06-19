package ProjetoFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField nomeTxtField;
	private JTextField tituloTxtField;
	private JTextField dataHora_TxtField;
	private JTextField localTxtField;
	private JTextField obsTxtField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro: ");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel.setBounds(28, 33, 90, 23);
		contentPane.add(lblNewLabel);
		
		JLabel nome = new JLabel("Nome:");
		nome.setFont(new Font("Century", Font.PLAIN, 11));
		nome.setBounds(22, 71, 46, 14);
		contentPane.add(nome);
		
		JLabel titulo = new JLabel("T\u00EDtulo:");
		titulo.setFont(new Font("Century", Font.PLAIN, 11));
		titulo.setBounds(22, 114, 46, 14);
		contentPane.add(titulo);
		
		JLabel dataHora = new JLabel("Data/Hora:");
		dataHora.setFont(new Font("Century", Font.PLAIN, 11));
		dataHora.setBounds(10, 159, 58, 14);
		contentPane.add(dataHora);
		
		JLabel local = new JLabel("Local:");
		local.setFont(new Font("Century", Font.PLAIN, 11));
		local.setBounds(22, 207, 46, 14);
		contentPane.add(local);
		
		JLabel lblNewLabel_2_3 = new JLabel("Observa\u00E7\u00F5es:");
		lblNewLabel_2_3.setFont(new Font("Century", Font.PLAIN, 11));
		lblNewLabel_2_3.setBounds(210, 137, 75, 14);
		contentPane.add(lblNewLabel_2_3);
		
		nomeTxtField = new JTextField();
		nomeTxtField.setBounds(78, 68, 86, 20);
		contentPane.add(nomeTxtField);
		nomeTxtField.setColumns(10);
		
		tituloTxtField = new JTextField();
		tituloTxtField.setBounds(78, 111, 86, 20);
		contentPane.add(tituloTxtField);
		tituloTxtField.setColumns(10);
		
		dataHora_TxtField = new JTextField();
		dataHora_TxtField.setBounds(78, 156, 86, 20);
		contentPane.add(dataHora_TxtField);
		dataHora_TxtField.setColumns(10);
		
		localTxtField = new JTextField();
		localTxtField.setBounds(78, 204, 86, 20);
		contentPane.add(localTxtField);
		localTxtField.setColumns(10);
		
		obsTxtField = new JTextField();
		obsTxtField.setBounds(290, 79, 120, 110);
		contentPane.add(obsTxtField);
		obsTxtField.setColumns(10);
		
		JLabel achadosPerdidosM = new JLabel("Achados e Perdidos");
		achadosPerdidosM.setFont(new Font("Freestyle Script", Font.PLAIN, 32));
		achadosPerdidosM.setBounds(128, 11, 174, 29);
		contentPane.add(achadosPerdidosM);
	}
}
