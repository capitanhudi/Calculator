package hspm;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HesapMeşın extends JFrame {

	private JPanel contentPane;
	private JTextField ekran;
	
	int sayi1 , sayi2 , sonuc;

	String islem="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HesapMeşın frame = new HesapMeşın();
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
	public HesapMeşın() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\asus\\Pictures\\k_16103452_k_25132546_webduyuru.ico"));
		setTitle("HesapMakinesi by prenses");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 372, 413);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"7");
			}
		});
		btn7.setBackground(Color.RED);
		btn7.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btn7.setBounds(20, 229, 57, 53);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"8");
			}
		});
		btn8.setBackground(Color.RED);
		btn8.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btn8.setBounds(87, 229, 57, 53);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"9");
			}
		});
		btn9.setBackground(Color.RED);
		btn9.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btn9.setBounds(154, 229, 57, 53);
		contentPane.add(btn9);
		
		JButton btntopla = new JButton("+");
		btntopla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!ekran.getText().equals(""))
					sayi1 = Integer.parseInt(ekran.getText());
					islem ="toplama";
				    ekran.setText("");
			}
		});
		btntopla.setBackground(Color.RED);
		btntopla.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btntopla.setBounds(222, 246, 57, 53);
		contentPane.add(btntopla);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"1");
			}
		});
		btn1.setBackground(Color.RED);
		btn1.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btn1.setBounds(20, 101, 57, 53);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"2");
			}
		});
		btn2.setBackground(Color.RED);
		btn2.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btn2.setBounds(87, 101, 57, 53);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"3");
			}
		});
		btn3.setBackground(Color.RED);
		btn3.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btn3.setBounds(154, 101, 57, 53);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"4");
			}
		});
		btn4.setBackground(Color.RED);
		btn4.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btn4.setBounds(20, 165, 57, 53);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"5");
			}
		});
		btn5.setBackground(Color.RED);
		btn5.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btn5.setBounds(87, 165, 57, 53);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"6");
			}
		});
		btn6.setBackground(Color.RED);
		btn6.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btn6.setBounds(154, 165, 57, 53);
		contentPane.add(btn6);
		
		JButton btnçıkart = new JButton("-");
		btnçıkart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!ekran.getText().equals(""))
					sayi1 = Integer.parseInt(ekran.getText());
					islem ="cikarma";
				    ekran.setText("");
			}
		});
		btnçıkart.setBackground(Color.RED);
		btnçıkart.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btnçıkart.setBounds(289, 246, 57, 53);
		contentPane.add(btnçıkart);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"0");
			}
		});
		btn0.setBackground(Color.RED);
		btn0.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btn0.setBounds(20, 293, 57, 53);
		contentPane.add(btn0);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText()+"00");
			}
		});
		btn00.setBackground(Color.RED);
		btn00.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btn00.setBounds(97, 293, 57, 53);
		contentPane.add(btn00);
		
		JButton btnçarp = new JButton("x");
		btnçarp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!ekran.getText().equals(""))
					sayi1 = Integer.parseInt(ekran.getText());
					islem ="carpma";
				    ekran.setText("");
			}
		});
		btnçarp.setBackground(Color.RED);
		btnçarp.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btnçarp.setBounds(222, 165, 57, 53);
		contentPane.add(btnçarp);
		
		JButton btnböl = new JButton("/");
		btnböl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!ekran.getText().equals(""))
					sayi1 = Integer.parseInt(ekran.getText());
					islem ="bolme";
				    ekran.setText("");
			}
		});
		btnböl.setBackground(Color.RED);
		btnböl.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btnböl.setBounds(289, 165, 57, 53);
		contentPane.add(btnböl);
		
		JButton btnesittir = new JButton("=");
		btnesittir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!ekran.getText().equals(""))
				   sayi2 = Integer.parseInt(ekran.getText());
				
				   if(islem == "toplama") {
					   sonuc = sayi1+sayi2;
					   ekran.setText(Integer.toString(sonuc));
				   }
				   
				   if(islem == "cikarma") {
					   sonuc = sayi1-sayi2;
					   ekran.setText(Integer.toString(sonuc));
				   }
				   
				   if(islem == "carpma") {
					   sonuc = sayi1*sayi2;
					   ekran.setText(Integer.toString(sonuc));
				   }
				   
				   if(islem == "bolme") {
					   sonuc = sayi1/sayi2;
					   ekran.setText(Integer.toString(sonuc));
				   }
				   

			}
		});
		btnesittir.setBackground(Color.RED);
		btnesittir.setFont(new Font("Arial Black", Font.PLAIN, 28));
		btnesittir.setBounds(181, 306, 165, 53);
		contentPane.add(btnesittir);
		
		ekran = new JTextField();
		ekran.setForeground(Color.WHITE);
		ekran.setBackground(Color.BLACK);
		ekran.setHorizontalAlignment(SwingConstants.RIGHT);
		ekran.setFont(new Font("Tahoma", Font.PLAIN, 39));
		ekran.setBounds(10, 11, 336, 65);
		contentPane.add(ekran);
		ekran.setColumns(10);
		
		JButton btnNewButton = new JButton("TEM\u0130ZLE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(229, 101, 117, 53);
		contentPane.add(btnNewButton);
	}
}
