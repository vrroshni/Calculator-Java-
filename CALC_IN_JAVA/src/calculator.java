import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class calculator implements ActionListener {
	JFrame jf;
	Font fo;
	Cursor curs;
	JButton sevenbutton;
	JLabel displayfield;
	JButton eightbutton;
	JButton ninebutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton zerobutton;
	JButton dotbutton;
	JButton equalbutton;
	JButton divbutton;
	JButton multibutton;
	JButton plusbutton;
	JButton subbutton;
	JButton clearbutton;
	boolean isoperatorclicked = false;
	String oldvalue;
	String newvalue;
	Integer set;

	public calculator() {

		fo = new Font("ARIAL", Font.BOLD, 30);
		curs = new Cursor(Cursor.HAND_CURSOR);

		jf = new JFrame("calculator");
		jf.setLayout(null);
		jf.setSize(650, 650);
		jf.setLocation(500, 150);
		Container c = jf.getContentPane();
		c.setBackground(Color.WHITE);

		displayfield = new JLabel("");
		displayfield.setBounds(30, 50, 450, 50);
		displayfield.setBackground(Color.BLACK);
		displayfield.setOpaque(true);
		displayfield.setHorizontalAlignment(SwingConstants.RIGHT);
		displayfield.setForeground(Color.WHITE);
		displayfield.setFont(fo);
		jf.add(displayfield);

		sevenbutton = new JButton("7");
		sevenbutton.setBounds(30, 130, 80, 80);
		sevenbutton.setFont(fo);
		sevenbutton.setForeground(Color.WHITE);
		sevenbutton.setBackground(Color.black);
		sevenbutton.setCursor(curs);
		sevenbutton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		jf.add(sevenbutton);
		sevenbutton.addActionListener(this);

		eightbutton = new JButton("8");
		eightbutton.setBounds(160, 130, 80, 80);
		eightbutton.setFont(fo);
		eightbutton.setForeground(Color.WHITE);
		eightbutton.setBackground(Color.black);
		eightbutton.setCursor(curs);
		eightbutton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		jf.add(eightbutton);
		eightbutton.addActionListener(this);

		ninebutton = new JButton("9");
		ninebutton.setBounds(280, 130, 80, 80);
		ninebutton.setFont(fo);
		ninebutton.setBackground(Color.black);
		ninebutton.setForeground(Color.WHITE);
		ninebutton.setCursor(curs);
		ninebutton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		jf.add(ninebutton);
		ninebutton.addActionListener(this);

		fourbutton = new JButton("4");
		fourbutton.setBounds(30, 230, 80, 80);
		fourbutton.setFont(fo);
		fourbutton.setForeground(Color.WHITE);
		fourbutton.setBackground(Color.black);
		fourbutton.setCursor(curs);
		fourbutton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		jf.add(fourbutton);
		fourbutton.addActionListener(this);

		fivebutton = new JButton("5");
		fivebutton.setBounds(160, 230, 80, 80);
		fivebutton.setFont(fo);
		fivebutton.setForeground(Color.WHITE);
		fivebutton.setBackground(Color.black);
		fivebutton.setCursor(curs);
		fivebutton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		jf.add(fivebutton);
		fivebutton.addActionListener(this);

		sixbutton = new JButton("6");
		sixbutton.setBounds(280, 230, 80, 80);
		sixbutton.setFont(fo);
		sixbutton.setForeground(Color.WHITE);
		sixbutton.setBackground(Color.black);
		sixbutton.setCursor(curs);
		sixbutton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		jf.add(sixbutton);
		sixbutton.addActionListener(this);

		onebutton = new JButton("1");
		onebutton.setBounds(30, 330, 80, 80);
		onebutton.setFont(fo);
		onebutton.setForeground(Color.WHITE);
		onebutton.setBackground(Color.black);
		onebutton.setCursor(curs);
		onebutton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		jf.add(onebutton);
		onebutton.addActionListener(this);

		twobutton = new JButton("2");
		twobutton.setBounds(160, 330, 80, 80);
		twobutton.setFont(fo);
		twobutton.setForeground(Color.WHITE);
		twobutton.setBackground(Color.black);
		twobutton.setCursor(curs);
		twobutton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		jf.add(twobutton);
		twobutton.addActionListener(this);

		threebutton = new JButton("3");
		threebutton.setBounds(280, 330, 80, 80);
		threebutton.setFont(fo);
		threebutton.setForeground(Color.WHITE);
		threebutton.setBackground(Color.black);
		threebutton.setCursor(curs);
		threebutton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		jf.add(threebutton);
		threebutton.addActionListener(this);

		dotbutton = new JButton(".");
		dotbutton.setBounds(30, 430, 80, 80);
		dotbutton.setFont(fo);
		dotbutton.setForeground(Color.WHITE);
		dotbutton.setBackground(Color.black);
		dotbutton.setCursor(curs);
		dotbutton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		jf.add(dotbutton);
		dotbutton.addActionListener(this);

		zerobutton = new JButton("0");
		zerobutton.setBounds(160, 430, 80, 80);
		zerobutton.setFont(fo);
		zerobutton.setForeground(Color.WHITE);
		zerobutton.setBackground(Color.black);
		zerobutton.setCursor(curs);
		zerobutton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		jf.add(zerobutton);
		zerobutton.addActionListener(this);

		equalbutton = new JButton("=");
		equalbutton.setBounds(280, 430, 80, 80);
		equalbutton.setFont(fo);
		equalbutton.setForeground(Color.WHITE);
		equalbutton.setBackground(Color.black);
		equalbutton.setCursor(curs);
		equalbutton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		jf.add(equalbutton);
		equalbutton.addActionListener(this);

		divbutton = new JButton("/");
		divbutton.setBounds(400, 130, 80, 80);
		divbutton.setFont(fo);
		divbutton.setForeground(Color.WHITE);
		divbutton.setBackground(Color.black);
		divbutton.setCursor(curs);
		divbutton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		jf.add(divbutton);
		divbutton.addActionListener(this);

		multibutton = new JButton("*");
		multibutton.setBounds(400, 230, 80, 80);
		multibutton.setFont(fo);
		multibutton.setForeground(Color.WHITE);
		multibutton.setBackground(Color.black);
		multibutton.setCursor(curs);
		multibutton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		jf.add(multibutton);
		multibutton.addActionListener(this);

		plusbutton = new JButton("+");
		plusbutton.setBounds(400, 330, 80, 80);
		plusbutton.setFont(fo);
		plusbutton.setForeground(Color.WHITE);
		plusbutton.setBackground(Color.black);
		plusbutton.setCursor(curs);
		plusbutton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		jf.add(plusbutton);
		plusbutton.addActionListener(this);

		subbutton = new JButton("-");
		subbutton.setBounds(400, 430, 80, 80);
		subbutton.setFont(fo);
		subbutton.setForeground(Color.WHITE);
		subbutton.setBackground(Color.black);
		subbutton.setCursor(curs);
		subbutton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		jf.add(subbutton);
		subbutton.addActionListener(this);

		clearbutton = new JButton("clear");
		clearbutton.setBounds(30, 530, 450, 50);
		clearbutton.setFont(fo);
		clearbutton.setForeground(Color.WHITE);
		clearbutton.setBackground(Color.black);
		clearbutton.setCursor(curs);
		clearbutton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		jf.add(clearbutton);
		clearbutton.addActionListener(this);

		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		calculator c = new calculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == sevenbutton) {
			if (isoperatorclicked) {
				displayfield.setText("7");
				isoperatorclicked = false;
			} else {
				displayfield.setText(displayfield.getText() + "7");

			}

		} else if (e.getSource() == eightbutton) {
			if (isoperatorclicked) {
				displayfield.setText("8");
				isoperatorclicked = false;
			} else {
				displayfield.setText(displayfield.getText() + "8");

			}
		} else if (e.getSource() == ninebutton) {
			if (isoperatorclicked) {
				displayfield.setText("9");
				isoperatorclicked = false;
			} else {
				displayfield.setText(displayfield.getText() + "9");

			}
		} else if (e.getSource() == fourbutton) {
			if (isoperatorclicked) {
				displayfield.setText("4");
				isoperatorclicked = false;
			} else {
				displayfield.setText(displayfield.getText() + "4");

			}
		} else if (e.getSource() == fivebutton) {
			if (isoperatorclicked) {
				displayfield.setText("5");
				isoperatorclicked = false;
			} else {
				displayfield.setText(displayfield.getText() + "5");

			}

		} else if (e.getSource() == sixbutton) {
			if (isoperatorclicked) {
				displayfield.setText("6");
				isoperatorclicked = false;
			} else {
				displayfield.setText(displayfield.getText() + "6");

			}
		} else if (e.getSource() == threebutton) {
			if (isoperatorclicked) {
				displayfield.setText("3");
				isoperatorclicked = false;
			} else {
				displayfield.setText(displayfield.getText() + "3");

			}
		} else if (e.getSource() == twobutton) {
			if (isoperatorclicked) {
				displayfield.setText("2");
				isoperatorclicked = false;
			} else {
				displayfield.setText(displayfield.getText() + "2");

			}
		} else if (e.getSource() == onebutton) {
			if (isoperatorclicked) {
				displayfield.setText("1");
				isoperatorclicked = false;
			} else {
				displayfield.setText(displayfield.getText() + "1");

			}
		} else if (e.getSource() == zerobutton) {
			if (isoperatorclicked) {
				displayfield.setText("0");
				isoperatorclicked = false;
			} else {
				displayfield.setText(displayfield.getText() + "0");

			}
		} else if (e.getSource() == dotbutton) {
			displayfield.setText(displayfield.getText() + ".");
		} else if (e.getSource() == clearbutton) {
			displayfield.setText("");

		} else if (e.getSource() == plusbutton) {
			isoperatorclicked = true;
			oldvalue = displayfield.getText();
			set = 1;

		} else if (e.getSource() == subbutton) {
			isoperatorclicked = true;
			oldvalue = displayfield.getText();
			set = 2;
		} else if (e.getSource() == divbutton) {
			isoperatorclicked = true;
			oldvalue = displayfield.getText();
			set = 3;
		} else if (e.getSource() == multibutton) {
			isoperatorclicked = true;
			oldvalue = displayfield.getText();
			set = 4;
		} else if (e.getSource() == equalbutton) {

			newvalue = displayfield.getText();
			Float oldvaluef = Float.parseFloat(oldvalue);
			Float newvaluef = Float.parseFloat(newvalue);
			switch (set) {
			case 1: {
				Float result = oldvaluef + newvaluef;
				displayfield.setText(result + "");

				break;
			}
			case 2: {
				Float result = oldvaluef - newvaluef;
				displayfield.setText(result + "");

				break;
			}
			case 3: {
				Float result = oldvaluef / newvaluef;
				displayfield.setText(result + "");

				break;
			}
			case 4: {
				Float result = oldvaluef * newvaluef;
				displayfield.setText(result + "");

				break;
			}
			default: {
				displayfield.setText("syntaxerror");
			}

			}

		}

	}

}