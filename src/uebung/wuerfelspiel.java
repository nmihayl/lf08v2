package uebung;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class wuerfelspiel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wuerfelspiel frame = new wuerfelspiel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public wuerfelspiel() {

		try {
			  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch(Exception e) {
			  System.out.println("Error setting native LAF: " + e);
			}


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 170, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblW1 = new JLabel("Würfel 1:");
		lblW1.setBounds(10, 11, 46, 14);
		contentPane.add(lblW1);

		JLabel lblW2 = new JLabel("Würfel 2:");
		lblW2.setBounds(10, 36, 46, 14);
		contentPane.add(lblW2);

		JLabel lblW3 = new JLabel("Würfel 3:");
		lblW3.setBounds(10, 61, 46, 14);
		contentPane.add(lblW3);

		final JLabel lblW1Result = new JLabel("0");
		lblW1Result.setBounds(66, 11, 46, 14);
		contentPane.add(lblW1Result);

		final JLabel lblW2Result = new JLabel("0");
		lblW2Result.setBounds(66, 36, 46, 14);
		contentPane.add(lblW2Result);

		final JLabel lblW3Result = new JLabel("0");
		lblW3Result.setBounds(66, 61, 46, 14);
		contentPane.add(lblW3Result);

		JLabel lblErgebnis = new JLabel("Ergebnis:");
		lblErgebnis.setBounds(10, 86, 46, 14);
		contentPane.add(lblErgebnis);

		final JLabel lblErgebnisResult = new JLabel("na.");
		lblErgebnisResult.setBounds(66, 86, 78, 14);
		contentPane.add(lblErgebnisResult);

		JButton btnDice = new JButton("Würfeln");
		btnDice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dice1 = 0;
				int dice2 = 0;
				int dice3 = 0;
				boolean result = false;
				String noPasch = "kein Pasch";
				String pasch = "Pasch!";

				Random rand1 = new Random();
				int max = 6;
				int min = 1;
				int randomNum1 = rand1.nextInt((max - min) + 1) + min;

				Random rand2 = new Random();
				int randomNum2 = rand2.nextInt((max - min) + 1) + min;

				Random rand3 = new Random();
				int randomNum3 = rand3.nextInt((max - min) + 1) + min;

				System.out.println(randomNum1 + "|" + randomNum2 + "|" + randomNum3);
				lblW1Result.setText(String.valueOf(randomNum1));
				lblW2Result.setText(String.valueOf(randomNum2));
				lblW3Result.setText(String.valueOf(randomNum3));

				if(randomNum1 == randomNum2 && randomNum2 == randomNum3) {
				    lblErgebnisResult.setText(String.valueOf(pasch));
				} else {
				    lblErgebnisResult.setText(String.valueOf(noPasch));
				}

			}
		});
		btnDice.setBounds(10, 111, 134, 23);
		contentPane.add(btnDice);

		JButton btnExit = new JButton("Beenden");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(10, 145, 134, 23);
		contentPane.add(btnExit);
	}
}
