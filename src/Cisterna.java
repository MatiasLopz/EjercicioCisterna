import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Label;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cisterna extends JFrame {

	private JPanel contentPane;
	private Label lbl_nroDpto;
	private Label lblCorrIncorr;

	/**
	 * Launch the application.
	 */
	
	private int porciento;
	private Label lporcentaje;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cisterna frame = new Cisterna();
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
	public Cisterna() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 430);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCorrIncorr = new Label("-----");
		lblCorrIncorr.setAlignment(Label.CENTER);
		lblCorrIncorr.setBackground(new Color(255, 250, 205));
		lblCorrIncorr.setBounds(413, 104, 127, 22);
		contentPane.add(lblCorrIncorr);
		
		JButton bd1 = new JButton("Departamento 1");
		bd1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_nroDpto.setText("1");
			}
		});
		bd1.setBounds(54, 48, 127, 23);
		contentPane.add(bd1);
		
		JButton bd2 = new JButton("Departamento 2");
		bd2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_nroDpto.setText("2");
			}
		});
		bd2.setBounds(54, 103, 127, 23);
		contentPane.add(bd2);
		
		JButton bd3 = new JButton("Departamento 3");
		bd3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl_nroDpto.setText("3");
			}
		});
		bd3.setBounds(54, 161, 127, 23);
		contentPane.add(bd3);
		
		JButton bi = new JButton("Inicializar");
		bi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				porciento=0;
				lbl_nroDpto.setText("-----");
				lblCorrIncorr.setText("-----");
				lporcentaje.setText("0");
				repaint();
			}
		});
		bi.setBounds(235, 161, 127, 23);
		contentPane.add(bi);
		
		JButton bs = new JButton("Salir");
		bs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		bs.setBounds(413, 161, 127, 23);
		contentPane.add(bs);
		
		JButton bc = new JButton("Comenzar");
		bc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(lbl_nroDpto.getText())==1 && porciento<50){
					lblCorrIncorr.setText("Correcto");
				}else {
					if(Integer.parseInt(lbl_nroDpto.getText())==2 && porciento>=50 && porciento<=70) {
						lblCorrIncorr.setText("Correcto");
					}else {
						if(Integer.parseInt(lbl_nroDpto.getText())==3 && porciento>70) {
							lblCorrIncorr.setText("Correcto");
						}else {
							lblCorrIncorr.setText("Incorrecto");
						}
					}
				}
			}
		});
		bc.setBounds(413, 48, 127, 23);
		contentPane.add(bc);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 202, 554, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(21, 9, 1, 195);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(21, 9, 554, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(574, 11, 1, 195);
		contentPane.add(separator_3);
		
		JLabel lblNewLabel = new JLabel("Depto. Seleccionado:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(235, 52, 127, 14);
		contentPane.add(lblNewLabel);
		
		lbl_nroDpto = new Label("-----");
		lbl_nroDpto.setFont(new Font("Dialog", Font.BOLD, 15));
		lbl_nroDpto.setBackground(new Color(255, 250, 205));
		lbl_nroDpto.setAlignment(Label.CENTER);
		lbl_nroDpto.setBounds(235, 90, 127, 48);
		contentPane.add(lbl_nroDpto);
		

		
		JLabel lblNewLabel_1 = new JLabel("Nivel de la Cisterna:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(141, 234, 127, 14);
		contentPane.add(lblNewLabel_1);
		
		lporcentaje = new Label("0");
		lporcentaje.setBackground(new Color(255, 250, 205));
		lporcentaje.setFont(new Font("Dialog", Font.BOLD, 15));
		lporcentaje.setAlignment(Label.CENTER);
		lporcentaje.setBounds(449, 234, 62, 40);
		contentPane.add(lporcentaje);
		
		Button bizq = new Button("<<");
		bizq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				porciento=Integer.parseInt(lporcentaje.getText());
				if(porciento>0 || porciento==100) {
					porciento=porciento-10;
					lporcentaje.setText(""+porciento+"");
					repaint();
				}
			}
		});
		bizq.setFont(new Font("Dialog", Font.BOLD, 15));
		bizq.setBounds(420, 291, 62, 43);
		contentPane.add(bizq);
		
		Button bder = new Button(">>");
		bder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(porciento==0 || porciento<100) {
					porciento=porciento+10;
					lporcentaje.setText(""+porciento+"");
					repaint();
				}
			}
		});
		bder.setFont(new Font("Dialog", Font.BOLD, 15));
		bder.setBounds(488, 291, 62, 43);
		contentPane.add(bder);
		
		JLabel lbarrapor = new JLabel("0     10      20      30      40      50      60      70      80      90      100%");
		lbarrapor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lbarrapor.setBounds(54, 335, 362, 14);
		contentPane.add(lbarrapor);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(21, 219, 554, 2);
		contentPane.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(21, 363, 554, 2);
		contentPane.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(21, 219, 1, 146);
		contentPane.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(574, 219, 1, 146);
		contentPane.add(separator_7);
	}
	
	public void paint (Graphics g) {
		super.paint(g);
		g.setColor(Color.white);
		g.fillRect(62,285,300,60);
		g.setColor(Color.black);
		g.drawLine(92,315,92,345);
		g.drawLine(122,315,122,345);
		g.drawLine(152,315,152,345);
		g.drawLine(182,315,182,345);
		g.drawLine(212,315,212,345);
		g.drawLine(242,315,242,345);
		g.drawLine(272,315,272,345);
		g.drawLine(302,315,302,345);
		g.drawLine(332,315,332,345);
		g.setColor(Color.red);
		g.fillRect(62+(porciento*3),285,5,60);
	}
}
