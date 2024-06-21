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
import java.awt.Color;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtValue1;
	private JTextField txtValue2;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		
		try {
			  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch(Exception e) {
			  System.out.println("Error setting native LAF: " + e);
			}
		
		setTitle("Addition zweier Zahlen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 210, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel textZahl1 = new JLabel("1. Zahl");
		textZahl1.setBounds(10, 11, 46, 14);
		contentPane.add(textZahl1);
		
		JLabel textZahl2 = new JLabel("2. Zahl");
		textZahl2.setBounds(10, 36, 46, 14);
		contentPane.add(textZahl2);
		
		txtValue1 = new JTextField();
		txtValue1.setForeground(new Color(220, 20, 60));
		txtValue1.setText("0");
		txtValue1.setBounds(66, 8, 118, 20);
		contentPane.add(txtValue1);
		txtValue1.setColumns(10);
		
		txtValue2 = new JTextField();
		txtValue2.setForeground(new Color(220, 20, 60));
		txtValue2.setText("0");
		txtValue2.setColumns(10);
		txtValue2.setBounds(66, 33, 118, 20);
		contentPane.add(txtValue2);
		
		JLabel textErgebnis = new JLabel("Ergebnis");
		textErgebnis.setBounds(10, 79, 46, 14);
		contentPane.add(textErgebnis);
		
		txtResult = new JTextField();
		txtResult.setForeground(new Color(0, 128, 0));
		txtResult.setColumns(10);
		txtResult.setBounds(66, 76, 118, 20);
		contentPane.add(txtResult);
		
		JButton btnResult = new JButton("Berechnen");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double zahl1, zahl2, ergebnis;
				zahl1 = Double.parseDouble(txtValue1.getText());
				zahl2 = Double.parseDouble(txtValue2.getText());
				ergebnis = zahl1 + zahl2;
				txtResult.setText(String.valueOf(ergebnis));
            }
		});
		btnResult.setBounds(10, 107, 87, 23);
		contentPane.add(btnResult);
		
		JButton btnClose = new JButton("Beenden");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
            }
		});
		btnClose.setBounds(107, 107, 77, 23);
		contentPane.add(btnClose);
	}
}
