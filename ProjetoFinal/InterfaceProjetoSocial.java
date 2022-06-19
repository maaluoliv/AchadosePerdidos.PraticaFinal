package ProjetoFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;

public class InterfaceProjetoSocial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceProjetoSocial frame = new InterfaceProjetoSocial();
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
	public InterfaceProjetoSocial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel achadosPerdidosM = new JLabel("Achados e Perdidos");
		achadosPerdidosM.setFont(new Font("Freestyle Script", Font.PLAIN, 32));
		achadosPerdidosM.setBounds(136, 36, 174, 29);
		contentPane.add(achadosPerdidosM);
		
		JLabel lblNewLabel = new JLabel("Selecione a op\u00E7\u00E3o desejada:");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel.setBounds(23, 76, 229, 29);
		contentPane.add(lblNewLabel);
		
		JButton BotãoGerenciamento = new JButton("Gerenciamento de Item");
		BotãoGerenciamento.setForeground(Color.WHITE);
		BotãoGerenciamento.setBackground(new Color(0, 51, 102));
		BotãoGerenciamento.setFont(new Font("Century", Font.PLAIN, 10));
		BotãoGerenciamento.setBounds(160, 129, 119, 29);
		contentPane.add(BotãoGerenciamento);
		
		JButton BotãoCadastro = new JButton("Cadastro de Item");
		BotãoCadastro.setForeground(Color.WHITE);
		BotãoCadastro.setBackground(new Color(0, 51, 102));
		BotãoCadastro.setFont(new Font("Century", Font.PLAIN, 10));
		BotãoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BotãoCadastro.setBounds(10, 129, 119, 29);
		contentPane.add(BotãoCadastro);
		
		JButton BotãoBusca = new JButton("Busca de Item");
		BotãoBusca.setForeground(Color.WHITE);
		BotãoBusca.setBackground(new Color(0, 51, 102));
		BotãoBusca.setFont(new Font("Century", Font.PLAIN, 10));
		BotãoBusca.setBounds(305, 129, 119, 29);
		contentPane.add(BotãoBusca);
	}
}
