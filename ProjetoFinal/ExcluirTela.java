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

public class ExcluirTela extends JFrame {

	private JPanel contentPane;
	private JTextField excluir_InputField;
	private JLabel achadosPerdidosM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExcluirTela frame = new ExcluirTela();
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
	public ExcluirTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel excluirLabel = new JLabel("Insira um dado para pesquisa do item que voc\u00EA deseja excluir ");
		excluirLabel.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		excluirLabel.setBounds(10, 54, 414, 43);
		contentPane.add(excluirLabel);
		
		JLabel lblNewLabel = new JLabel("(nome, t\u00EDtulo, data, etc) ");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 98, 193, 14);
		contentPane.add(lblNewLabel);
		
		excluir_InputField = new JTextField();
		excluir_InputField.setBounds(20, 133, 277, 20);
		contentPane.add(excluir_InputField);
		excluir_InputField.setColumns(10);
		
		achadosPerdidosM = new JLabel("Achados e Perdidos");
		achadosPerdidosM.setFont(new Font("Freestyle Script", Font.PLAIN, 32));
		achadosPerdidosM.setBounds(123, 21, 174, 29);
		contentPane.add(achadosPerdidosM);
	}
}
