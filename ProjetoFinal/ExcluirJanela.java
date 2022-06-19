package ProjetoFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Font;

public class ExcluirJanela extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel achadosPerdidosM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExcluirJanela frame = new ExcluirJanela();
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
	public ExcluirJanela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel excluirLabel = new JLabel("Insira um dado do item que voc\u00EA deseja excluir");
		excluirLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		excluirLabel.setBounds(24, 75, 340, 31);
		contentPane.add(excluirLabel);
		
		JLabel lblNewLabel = new JLabel("(nome, t\u00EDtulo, data, etc) :");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel.setBounds(24, 100, 190, 21);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(24, 132, 235, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		achadosPerdidosM = new JLabel("Achados e Perdidos");
		achadosPerdidosM.setFont(new Font("Freestyle Script", Font.PLAIN, 32));
		achadosPerdidosM.setBounds(121, 31, 174, 29);
		contentPane.add(achadosPerdidosM);
	}

}
