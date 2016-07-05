import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Label;
import javax.swing.JLabel;

public class Arbol {

	private JFrame frmArbol;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arbol window = new Arbol();
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
	public Arbol() {
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
		btnJoto.setBounds(234, 31, 97, 25);
		frmArbol.getContentPane().add(btnJoto);

		JButton btnNewButton = new JButton("borrar");
		btnNewButton.setBounds(530, 31, 97, 25);
		frmArbol.getContentPane().add(btnNewButton);

		textField = new JTextField();
		textField.setBounds(367, 32, 116, 22);
		frmArbol.getContentPane().add(textField);
		textField.setColumns(10);
		
		Label label = new Label("Ingresar");
		label.setAlignment(Label.CENTER);
		label.setBounds(50, 34, 97, 22);
		frmArbol.getContentPane().add(label);
	}
}
