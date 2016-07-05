import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Principal {

	private JFrame frmArbol;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmArbol.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmArbol = new JFrame();
		frmArbol.setTitle("ARBOL");
		frmArbol.setBounds(100, 100, 862, 681);
		frmArbol.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmArbol.getContentPane().setLayout(null);

		JButton btnJoto = new JButton("A\u00F1adir");
		btnJoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnJoto.setBounds(22, 596, 97, 25);
		frmArbol.getContentPane().add(btnJoto);

		JButton btnNewButton = new JButton("borrar");
		btnNewButton.setBounds(152, 596, 97, 25);
		frmArbol.getContentPane().add(btnNewButton);

		textField = new JTextField();
		textField.setBounds(16, 559, 103, 22);
		frmArbol.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(152, 558, 97, 25);
		frmArbol.getContentPane().add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 820, 512);
		frmArbol.getContentPane().add(panel);
	}
}
