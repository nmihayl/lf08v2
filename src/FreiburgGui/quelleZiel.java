package FreiburgGui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class quelleZiel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fieldQuelle;
	private JTextField fieldZiel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quelleZiel frame = new quelleZiel();
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
	public quelleZiel() {
		
		try {
			  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch(Exception e) {
			  System.out.println("Error setting native LAF: " + e);
			}
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 170, 130);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuelle = new JLabel("Quelle");
		lblQuelle.setBounds(10, 11, 46, 14);
		contentPane.add(lblQuelle);
		
		fieldQuelle = new JTextField();
		fieldQuelle.setBounds(66, 8, 86, 20);
		contentPane.add(fieldQuelle);
		fieldQuelle.setColumns(10);
		
		JLabel lblZiel = new JLabel("Ziel");
		lblZiel.setBounds(10, 36, 46, 14);
		contentPane.add(lblZiel);
		
		fieldZiel = new JTextField();
		fieldZiel.setColumns(10);
		fieldZiel.setBounds(66, 33, 86, 20);
		contentPane.add(fieldZiel);
		
		JButton btnVerschieben = new JButton("Verschieben");
		btnVerschieben.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String quelle = fieldQuelle.getText();
				String ziel = quelle;
				fieldZiel.setText(String.valueOf(quelle));
			}
		});
		btnVerschieben.setBounds(10, 61, 142, 23);
		contentPane.add(btnVerschieben);
	}
}
