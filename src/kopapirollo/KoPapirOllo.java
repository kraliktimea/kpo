package kopapirollo;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KoPapirOllo extends JFrame {

	private JPanel contentPane;
	private JTextField gepvalaszt;
	private JTextField jatekos;
	private JTextField gep;
	private JTextField jatekos_eredmeny;
	private JTextField gep_eredmeny;
	private JLabel label;
	private int jeredmeny = 0;
	private int geredmeny = 0;
	private int countJatek = 0;
	private int g_tipp;
	private JTextField jszam;
	private JLabel lblJtkokSzma;
	private JTextField dont;
	private JLabel dszam;
	private int dontetlenek = 0;
	JButton btnK = new JButton("K\u0150");
	JButton btnPapr = new JButton("PAP\u00CDR");
	JButton btnOll = new JButton("OLL\u00D3");

	public KoPapirOllo() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 333);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblKPapr = new JLabel("K\u0150 - PAP\u00CDR - OLL\u00D3");
		lblKPapr.setHorizontalAlignment(SwingConstants.CENTER);
		lblKPapr.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblKPapr.setBounds(89, -2, 278, 43);
		contentPane.add(lblKPapr);

		JLabel lblAGpVlasztsa = new JLabel("A g\u00E9p v\u00E1laszt\u00E1sa:");
		lblAGpVlasztsa.setHorizontalAlignment(SwingConstants.CENTER);
		lblAGpVlasztsa.setBounds(166, 34, 115, 22);
		contentPane.add(lblAGpVlasztsa);

		gepvalaszt = new JTextField();
		gepvalaszt.setBackground(Color.WHITE);
		gepvalaszt.setFont(new Font("Tahoma", Font.BOLD, 15));
		gepvalaszt.setHorizontalAlignment(SwingConstants.CENTER);
		gepvalaszt.setBounds(182, 63, 86, 43);
		contentPane.add(gepvalaszt);
		gepvalaszt.setColumns(10);

		jatekos = new JTextField();
		jatekos.setBackground(Color.WHITE);
		jatekos.setHorizontalAlignment(SwingConstants.CENTER);
		jatekos.setText("J\u00C1T\u00C9KOS");
		jatekos.setBounds(10, 125, 60, 31);
		contentPane.add(jatekos);
		jatekos.setColumns(10);

		gep = new JTextField();
		gep.setBackground(Color.WHITE);
		gep.setHorizontalAlignment(SwingConstants.CENTER);
		gep.setText("G\u00C9P");
		gep.setColumns(10);
		gep.setBounds(391, 125, 48, 31);
		contentPane.add(gep);

		JLabel lblEredmny = new JLabel("Eredm\u00E9ny:");
		lblEredmny.setHorizontalAlignment(SwingConstants.CENTER);
		lblEredmny.setBounds(155, 109, 154, 14);
		contentPane.add(lblEredmny);

		jatekos_eredmeny = new JTextField();
		jatekos_eredmeny.setBackground(Color.WHITE);
		jatekos_eredmeny.setFont(new Font("Tahoma", Font.BOLD, 15));
		jatekos_eredmeny.setHorizontalAlignment(SwingConstants.CENTER);
		jatekos_eredmeny.setText("0");
		jatekos_eredmeny.setBounds(108, 130, 86, 43);
		contentPane.add(jatekos_eredmeny);
		jatekos_eredmeny.setColumns(10);

		gep_eredmeny = new JTextField();
		gep_eredmeny.setBackground(Color.WHITE);
		gep_eredmeny.setFont(new Font("Tahoma", Font.BOLD, 15));
		gep_eredmeny.setHorizontalAlignment(SwingConstants.CENTER);
		gep_eredmeny.setText("0");
		gep_eredmeny.setColumns(10);
		gep_eredmeny.setBounds(263, 130, 86, 43);
		contentPane.add(gep_eredmeny);
		btnK.setBackground(Color.LIGHT_GRAY);

		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				countJatek++;
				jszam.setText(String.valueOf(countJatek));
				btnK.setBackground(Color.GREEN);
				btnPapr.setBackground(Color.LIGHT_GRAY);
				btnOll.setBackground(Color.LIGHT_GRAY);
				g_tipp = (int) (Math.random() * 3);
				gepvalaszt.setText(String.valueOf(g_tipp));

				switch (g_tipp) {
				case 0:
					// döntetlen
					gepvalaszt.setText("KÕ");

					dontetlenek++;
					gep.setBackground(Color.YELLOW);
					jatekos.setBackground(Color.YELLOW);
					dont.setText(String.valueOf(dontetlenek));
					break;
				case 1:
					// gép nyer
					gepvalaszt.setText("PAPÍR");

					geredmeny++;
					gep_eredmeny.setText(String.valueOf(geredmeny));
					gep.setBackground(Color.YELLOW);
					jatekos.setBackground(Color.WHITE);
					break;
				case 2:
					// jatekos nyer
					gepvalaszt.setText("OLLÓ");

					jeredmeny++;
					jatekos_eredmeny.setText(String.valueOf(jeredmeny));
					jatekos.setBackground(Color.YELLOW);
					gep.setBackground(Color.WHITE);
					break;
				default:
				}
			}
		});
		btnK.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnK.setBounds(45, 199, 103, 60);
		contentPane.add(btnK);
		btnPapr.setBackground(Color.LIGHT_GRAY);

		btnPapr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				countJatek++;
				jszam.setText(String.valueOf(countJatek));
				btnPapr.setBackground(Color.GREEN);
				btnK.setBackground(Color.LIGHT_GRAY);
				btnOll.setBackground(Color.LIGHT_GRAY);
				g_tipp = (int) (Math.random() * 3);
				gepvalaszt.setText(String.valueOf(g_tipp));

				switch (g_tipp) {
				case 0:
					// jatekosnyer
					gepvalaszt.setText("KÕ");

					jeredmeny++;
					jatekos_eredmeny.setText(String.valueOf(jeredmeny));
					jatekos.setBackground(Color.YELLOW);
					gep.setBackground(Color.WHITE);
					break;
				case 1:
					// döntetlen
					gepvalaszt.setText("PAPÍR");

					dontetlenek++;
					gep.setBackground(Color.YELLOW);
					jatekos.setBackground(Color.YELLOW);
					dont.setText(String.valueOf(dontetlenek));
					break;
				case 2:
					// gepnyer
					gepvalaszt.setText("OLLÓ");

					geredmeny++;
					gep_eredmeny.setText(String.valueOf(geredmeny));
					gep.setBackground(Color.YELLOW);
					jatekos.setBackground(Color.WHITE);
					break;
				default:
				}
			}
		});
		btnPapr.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPapr.setBounds(172, 199, 123, 60);
		contentPane.add(btnPapr);
		btnOll.setBackground(Color.LIGHT_GRAY);

		btnOll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				countJatek++;
				jszam.setText(String.valueOf(countJatek));
				btnPapr.setBackground(Color.LIGHT_GRAY);
				btnK.setBackground(Color.LIGHT_GRAY);
				btnOll.setBackground(Color.GREEN);
				g_tipp = (int) (Math.random() * 3);
				gepvalaszt.setText(String.valueOf(g_tipp));

				switch (g_tipp) {
				case 0:
					// gepnyer
					gepvalaszt.setText("KÕ");

					geredmeny++;
					gep_eredmeny.setText(String.valueOf(geredmeny));
					gep.setBackground(Color.YELLOW);
					jatekos.setBackground(Color.WHITE);
					break;
				case 1:
					// jatekosnyer
					gepvalaszt.setText("PAPÍR");

					jeredmeny++;
					jatekos_eredmeny.setText(String.valueOf(jeredmeny));
					jatekos.setBackground(Color.YELLOW);
					gep.setBackground(Color.WHITE);
					break;
				case 2:
					// dontetlen
					gepvalaszt.setText("OLLÓ");

					dontetlenek++;
					gep.setBackground(Color.YELLOW);
					jatekos.setBackground(Color.YELLOW);
					dont.setText(String.valueOf(dontetlenek));
					break;
				default:
				}
			}
		});

		btnOll.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnOll.setBounds(316, 199, 123, 60);
		contentPane.add(btnOll);

		label = new JLabel("-");
		label.setFont(new Font("Tahoma", Font.BOLD, 25));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(204, 144, 46, 14);
		contentPane.add(label);

		jszam = new JTextField();
		jszam.setBackground(Color.WHITE);
		jszam.setFont(new Font("Tahoma", Font.BOLD, 15));
		jszam.setHorizontalAlignment(SwingConstants.CENTER);
		jszam.setText("0");
		jszam.setBounds(45, 52, 48, 43);
		contentPane.add(jszam);
		jszam.setColumns(10);

		lblJtkokSzma = new JLabel("J\u00E1t\u00E9kok sz\u00E1ma:");
		lblJtkokSzma.setHorizontalAlignment(SwingConstants.CENTER);
		lblJtkokSzma.setBounds(25, 27, 115, 14);
		contentPane.add(lblJtkokSzma);

		dont = new JTextField();
		dont.setBackground(Color.WHITE);
		dont.setText("0");
		dont.setHorizontalAlignment(SwingConstants.CENTER);
		dont.setFont(new Font("Tahoma", Font.BOLD, 15));
		dont.setColumns(10);
		dont.setBounds(364, 52, 48, 43);
		contentPane.add(dont);

		dszam = new JLabel("D\u00F6ntetlenek sz\u00E1ma:");
		dszam.setHorizontalAlignment(SwingConstants.CENTER);
		dszam.setBounds(316, 27, 145, 14);
		contentPane.add(dszam);

		gepvalaszt.setEditable(false);
		jatekos.setEditable(false);
		gep.setEditable(false);
		jatekos_eredmeny.setEditable(false);
		gep_eredmeny.setEditable(false);
		jszam.setEditable(false);
		dont.setEditable(false);

		repaint();
		validate();
	}
}
