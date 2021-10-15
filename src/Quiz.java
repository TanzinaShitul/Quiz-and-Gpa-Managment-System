package javaproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class JavaProject extends JFrame implements ActionListener {

	JLabel l;
	JRadioButton jb[] = new JRadioButton[5];
	JButton b1, b2;
	ButtonGroup bg;
	int count = 0, current = 0, x = 1, y = 1, now = 0;
	int m[] = new int[50];

	JavaProject(String s) {
		super(s);
		l = new JLabel();
		add(l);
		bg = new ButtonGroup();
		for (int i = 0; i < 5; i++) {
			jb[i] = new JRadioButton();
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1 = new JButton("Next");
		b2 = new JButton("Bookmark");
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);
		add(b2);
		set();
		l.setBounds(30, 40, 450, 20);
		jb[0].setBounds(50, 80, 100, 20);
		jb[1].setBounds(50, 110, 100, 20);
		jb[2].setBounds(50, 140, 100, 20);
		jb[3].setBounds(50, 170, 100, 20);
		b1.setBounds(100, 240, 100, 30);
		b2.setBounds(270, 240, 100, 30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250, 100);
		setVisible(true);
		setSize(600, 350);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			if (check())
				count = count + 1;
			current++;
			set();
			if (current == 49) {
				b1.setEnabled(false);
				b2.setText("Result");
			}
		}
		if (e.getActionCommand().equals("Bookmark")) {
			JButton bk = new JButton("Bookmark" + x);
			bk.setBounds(480, 20 + 30 * x, 100, 30);
			add(bk);
			bk.addActionListener(this);
			m[x] = current;
			x++;
			current++;
			set();
			if (current == 49)
				b2.setText("Result");
			setVisible(false);
			setVisible(true);
		}
		for (int i = 0, y = 1; i < x; i++, y++) {
			if (e.getActionCommand().equals("Bookmark" + y)) {
				if (check())
					count = count + 1;
				now = current;
				current = m[y];
				set();
				((JButton) e.getSource()).setEnabled(false);
				current = now;
			}
		}

		if (e.getActionCommand().equals("Result")) {
			if (check())
				count = count + 1;
			current++;
			// System.out.println("correct ans="+count);
			JOptionPane.showMessageDialog(this, "correct ans=" + count);
			System.exit(0);
		}
	}

	void set() {
		jb[4].setSelected(true);
		if (current == 0) {
			l.setText("Que1:What is hardware?\n");
			jb[0].setText("(a)virtual machine\n");
			jb[1].setText("(b)the physical machine\n");
			jb[2].setText("(c)applications such as browsers\n");
			jb[3].setText("(d)part of the processor\n");
		}
		if (current == 1) {
			l.setText("Que2:What does counter++; do?\n");
			jb[0].setText("(b)Adds 1 to counter\n");
			jb[1].setText("(b)Adds 2 to counter\n");
			jb[2].setText("(c)Gets the sum\n");
			jb[3].setText("(d)Multiplies the numbers\n");
		}
		if (current == 2) {
			l.setText("Que3:What is a loop that never stops?\n");
			jb[0].setText("(a)For Loop 1\n");
			jb[1].setText("(b)Infinite Loop\n ");
			jb[2].setText("(c)Do-While Loop\n");
			jb[3].setText("(d)Full Loop\n");
		}
		if (current == 3) {
			l.setText("Que4:In a while loop, if the boolean expression is true, what will the loop do?\n");
			jb[0].setText("(a)Break\n");
			jb[1].setText("(b)Program will exit\n");
			jb[2].setText("(c)Repeat\n");
			jb[3].setText("(d)Continue through program\n");
		}
		if (current == 4) {
			l.setText("Que5:What special value is designated for controlling a loop?\n");
			jb[0].setText("(a)Control value\n");
			jb[1].setText("(b)Mutator Method\n ");
			jb[2].setText("(c)Accessor Method\n");
			jb[3].setText("(d)Sentinel Value\n");
		}
		if (current == 5) {
			l.setText("Que6:What is a method?\n");
			jb[0].setText("(a)A collection of statements grouped together to perform an operation\n");
			jb[1].setText("(b)A value returned from a method using the return statement\n");
			jb[2].setText("(c)The portion of the program where the variable can be accessed.\n");
			jb[3].setText("(d)The combination of the name of a method and the list of its parameters\n");

		}
		if (current == 6) {
			l.setText("Que7:What is an object?\n");
			jb[0].setText("(a)Representation of an entity in the real world that can be distinctly identified\n");
			jb[1].setText("(b)A static method can be called without creating an instance of the class\n");
			jb[2].setText("n(c)Instance variable/instance mthod\n");
			jb[3].setText(
					"(d)A template, blueprint or contract that defines what an object's data fields and methods will be.\n");
		}
		if (current == 7) {
			l.setText("Que8:What is an array?\n");
			jb[0].setText("(a)Numbers of items ArrayList can store without increasing its size\n");
			jb[1].setText("(b)Number used as an index to pinpoint a specfic element within an array\n");
			jb[2].setText("(c)Object that can store a group of values, all of the same type\n");
			jb[3].setText("(d)Method of locating a specific item in a larger collection of data\n");

		}
		if (current == 8) {
			l.setText("Que9:You use this statement to throw an exception manually.\n");
			jb[0].setText("(a)Throw\n");
			jb[1].setText("(b)call stack\n");
			jb[2].setText("(c)try block\n");
			jb[3].setText("(d)thrown\n");
		}
		if (current == 9) {
			l.setText("Que10:When an exception is generated, it is said to have been what?\n");
			jb[0].setText("(a)Created\n");
			jb[1].setText("(b)Called\n");
			jb[2].setText("(c)Thrown\n");
			jb[3].setText("(d)Generated\n");

		}
		if (current == 10) {
			l.setText("Que11:Package in Java is a mechanism to encapsulate a ____________.\n");
			jb[0].setText("(a)Classes\n");
			jb[1].setText("(b)Sub Packages\n");
			jb[2].setText("(c)Interfaces\n");
			jb[3].setText("(d)All of the above\n");
		}
		if (current == 11) {
			l.setText("Que12:Which of these keywords is used to define packages in Java?\n");
			jb[0].setText("(a)pkg\n");
			jb[1].setText("(b)Pkg\n");
			jb[2].setText("(c)package\n");
			jb[3].setText("(d)Package\n");

		}
		if (current == 12) {
			l.setText("Que13:Package names and directory structure are closely related.\n");
			jb[0].setText("(a)TRUE\n");
			jb[1].setText("(b)FALSE\n");
			jb[2].setText("(c)can be true or false\n");
			jb[3].setText("(d)can not say\n");
		}
		if (current == 13) {
			l.setText(
					"Que14:An _____________ statement can be used to access the classes and interface of a different package from the current package.\n");
			jb[0].setText("(a)instanceOf\n");
			jb[1].setText("(b)import\n");
			jb[2].setText("(c)extends\n");
			jb[3].setText("(d)implement\n");
		}
		if (current == 25) {
			l.setText("Que26: What is the Time Zone of Bangladesh?");
			jb[0].setText("UTC + 5\\n ");
			jb[1].setText("UTC + 6\\n ");
			jb[2].setText("UTC + 4\\n");
			jb[3].setText("none of all\\n");
		}
		if (current == 26) {
			l.setText("Que27: How many kilometeres of costline does Bangladesh have?");
			jb[0].setText("1,682 km\\n");
			jb[1].setText("257 km\\n");
			jb[2].setText("2,798 km\\");
			jb[3].setText("580 km\\n");
		}
		if (current == 27) {
			l.setText("Que28: What are the some natural Hazards in Bangladesh?");
			jb[0].setText("Droughts, Cyclones , and Earthquake\\n");
			jb[1].setText("Cyclones , Earthquakes, and Severe flooding\\n");
			jb[2].setText("Droughts, Cyclones , and Severe Flooding\\n");
			jb[3].setText("Droughts, Earthquakes, and Landslides\\n");
		}
		if (current == 28) {
			l.setText("Que29: In Mid-July, What would the weather most likely be in Bangladesh");
			jb[0].setText("Snow , Frost , Ice\\n ");
			jb[1].setText("Humid , Warm , Rainy\\n");
			jb[2].setText("Hot & Dry\\n");
			jb[3].setText(" Mild\\n");
		}
		if (current == 29) {
			l.setText("Que30:How many chapters does the glorius Quran contain? ");
			jb[0].setText("100\\n");
			jb[1].setText("125\\n");
			jb[2].setText("114\\n");
			jb[3].setText("90\\n");
		}
		if (current == 30) {
			l.setText("Que31:What was Bangladesh formally known as?");
			jb[0].setText("East Pakistan\\n");
			jb[1].setText(" East India\\n");
			jb[2].setText("Wast Bangla\\n");
			jb[3].setText("Wast Pakistan\\n");
		}
		if (current == 31) {
			l.setText("Que32:\"What kind of climate does Bangladesh have?  ");
			jb[0].setText("Temperate\\n");
			jb[1].setText("Tropical\\n");
			jb[2].setText("Arid\\n");
			jb[3].setText(" Sub-Arctic\\n");
		}
		if (current == 32) {
			l.setText("Que33:What are the current Environmental issues in Bangladesh?");
			jb[0].setText("Water Pollution & Shortages\\n");
			jb[1].setText("Erosion & Deforestation\\n");
			jb[2].setText(" Severe Overpopulation\\n");
			jb[3].setText("All of Above\\n");
		}
		if (current == 33) {
			l.setText("Que34: When was the first Bangladeshi Taka printed?");
			jb[0].setText("4 March, 1972\\n");
			jb[1].setText("4 June, 1972\\n");
			jb[2].setText("4 April, 1972\\n");
			jb[3].setText("4, December, 1972\\n");
		}
		if (current == 34) {
			l.setText("Que35:A Storm named ‘Eta’ has recently caused massive landslides in which country?");
			jb[0].setText("Guatemala");
			jb[1].setText("Brazil");
			jb[2].setText("New Zealand");
			jb[3].setText(" Philippines");
		}
		if (current == 35) {
			l.setText(
					"Que36:Which country has announced a contribution of USD 1 million to the COVID-19 ASEAN Response Fund?");
			jb[0].setText("United States");
			jb[1].setText("India");
			jb[2].setText("Singapore");
			jb[3].setText("China");
		}
		if (current == 36) {
			l.setText("Que37:Which country has test fired ‘Tsirkon’ hypersonic cruise missile?");
			jb[0].setText("China");
			jb[1].setText("Japan");
			jb[2].setText("Russia");
			jb[3].setText("Canada");
		}
		if (current == 37) {
			l.setText(
					"Que38:hich country has introduced a Veto Power on any agreements entered with foreign countries?");
			jb[0].setText("Pakistan");
			jb[1].setText("Afghanistan");
			jb[2].setText("Japan");
			jb[3].setText("Australia");
		}
		if (current == 38) {
			l.setText(
					"Que39:Which country under its ‘Data Sonification’ program, extracted the sound of important phenomena of the universe?");
			jb[0].setText("India");
			jb[1].setText("China");
			jb[2].setText("United States");
			jb[3].setText("Germany");
		}
		if (current == 39) {
			l.setText("Que40:Which country announced to restrict promotion of unhealthy food from April 2022?");
			jb[0].setText("France");
			jb[1].setText("UK");
			jb[2].setText("China");
			jb[3].setText("South Korea");
		}
		if (current == 40) {
			l.setText("Que41:Which country released a bill that would increase monitoring of civil society groups?");
			jb[0].setText("Turkey");
			jb[1].setText("United States");
			jb[2].setText("Germany");
			jb[3].setText("North Korea");
		}
		if (current == 41) {
			l.setText(
					"Que42:Which country test-fired a nuclear-capable surface-to-surface ballistic missile named ‘Shaheen-III’?");
			jb[0].setText("Iran");
			jb[1].setText("Pakistan");
			jb[2].setText("UAE");
			jb[3].setText("Afganistan");
		}
		if (current == 42) {
			l.setText("Que43:Which county has rejoined the “Paris climate agreement” recently?");
			jb[0].setText("USA");
			jb[1].setText("Japan");
			jb[2].setText("China");
			jb[3].setText("Russia");
		}
		if (current == 43) {
			l.setText(
					"Que44:Which country recently reported its first known human death of the rare ‘Monkey B virus’?");
			jb[0].setText("USA");
			jb[1].setText("China");
			jb[2].setText("South Korea");
			jb[3].setText("Singapore");
		}
		if (current == 44) {
			l.setText(
					"Que45:Which country has become the first country in the world to manufacture fossil-free steel?");
			jb[0].setText("Germany");
			jb[1].setText("India");
			jb[2].setText("japan");
			jb[3].setText("Sweden");
		}
		if (current == 45) {
			l.setText("Que46:Who had established the World Series Cricket in 1970s?");
			jb[0].setText(" Kerry Packer");
			jb[1].setText("David Johnson");
			jb[2].setText("Allen Hill");
			jb[3].setText("Alfred Shaw");
		}
		if (current == 46) {
			l.setText(
					"Que47:Which nation won the maximum number of medals in the 2018 ISSF World Shooting Championships?");
			jb[0].setText("Sweden");
			jb[1].setText(" Finland");
			jb[2].setText("United States");
			jb[3].setText(" China");
		}

		if (current == 47) {
			l.setText("Que48:Who has won the 2018 UCI Cyclo-cross World Cup championship for women?");
			jb[0].setText("Sanne Cant");
			jb[1].setText("Sophie de Boer");
			jb[2].setText("Katie Compton");
			jb[3].setText("Hanka Kupfernagel");
		}

		if (current == 48) {
			l.setText("Que49:What is the length of the cricket pitch?");
			jb[0].setText("20.12m");
			jb[1].setText("23.12m");
			jb[2].setText("22.12m");
			jb[3].setText("19.12m");
		}

		if (current == 49) {
			l.setText("Que50:Who had designed the Olympic symbol of five rings?");
			jb[0].setText("Baron Coubertin");
			jb[1].setText("Henri Didon");
			jb[2].setText("Carl Jung");
			jb[3].setText("Craig Crowley");
		}

		l.setBounds(30, 40, 450, 20);
		for (int i = 0, j = 0; i <= 90; i += 30, j++)
			jb[j].setBounds(50, 80 + i, 200, 20);
	}

	boolean check() {
		if (current == 0)
			return (jb[1].isSelected());
		if (current == 1)
			return (jb[0].isSelected());
		if (current == 2)
			return (jb[1].isSelected());
		if (current == 3)
			return (jb[2].isSelected());
		if (current == 4)
			return (jb[3].isSelected());
		if (current == 5)
			return (jb[0].isSelected());
		if (current == 6)
			return (jb[0].isSelected());
		if (current == 7)
			return (jb[2].isSelected());
		if (current == 8)
			return (jb[0].isSelected());
		if (current == 9)
			return (jb[2].isSelected());
		if (current == 10)
			return (jb[3].isSelected());
		if (current == 11)
			return (jb[2].isSelected());
		if (current == 12)
			return (jb[0].isSelected());
		if (current == 13)
			return (jb[1].isSelected());

		if (current == 25)
			return (jb[1].isSelected());
		if (current == 26)
			return (jb[3].isSelected());
		if (current == 27)
			return (jb[2].isSelected());
		if (current == 28)
			return (jb[1].isSelected());
		if (current == 29)
			return (jb[2].isSelected());
		if (current == 30)
			return (jb[0].isSelected());
		if (current == 31)
			return (jb[1].isSelected());
		if (current == 32)
			return (jb[0].isSelected());
		if (current == 33)
			return (jb[0].isSelected());
		if (current == 34)
			return (jb[0].isSelected());
		if (current == 35)
			return (jb[1].isSelected());
		if (current == 36)
			return (jb[2].isSelected());
		if (current == 37)
			return (jb[3].isSelected());
		if (current == 38)
			return (jb[2].isSelected());
		if (current == 39)
			return (jb[1].isSelected());
		if (current == 40)
			return (jb[0].isSelected());
		if (current == 41)
			return (jb[1].isSelected());
		if (current == 42)
			return (jb[0].isSelected());
		if (current == 43)
			return (jb[1].isSelected());
		if (current == 44)
			return (jb[3].isSelected());
		if (current == 45)
			return (jb[0].isSelected());
		if (current == 46)
			return (jb[3].isSelected());
		if (current == 47)
			return (jb[0].isSelected());
		if (current == 48)
			return (jb[0].isSelected());
		if (current == 49)
			return (jb[0].isSelected());
		return false;
	}

	public static void main(String[] args) {
		new JavaProject("General Knowledge Quizes");
	}

}
