
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
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;
	ButtonGroup bg;
	int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[25];	
        JavaProject(String s)
	{
		super(s);
		l=new JLabel();
		add(l);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");
		b2=new JButton("Bookmark");
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);add(b2);
		set();
		l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);
		jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);
		jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);
		b2.setBounds(270,240,100,30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisible(true);
		setSize(600,350);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			if(check())
				count=count+1;
			current++;
			set();	
			if(current==24)
			{
				b1.setEnabled(false);
				b2.setText("Result");
			}
		}
		if(e.getActionCommand().equals("Bookmark"))
		{
			JButton bk=new JButton("Bookmark"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);
			bk.addActionListener(this);
			m[x]=current;
			x++;
			current++;
			set();	
			if(current==24)
				b2.setText("Result");
			setVisible(false);
			setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
		if(e.getActionCommand().equals("Bookmark"+y))
		{
			if(check())
				count=count+1;
			now=current;
			current=m[y];
			set();
			((JButton)e.getSource()).setEnabled(false);
			current=now;
		}
		}
	
		if(e.getActionCommand().equals("Result"))
		{
			if(check())
				count=count+1;
			current++;
			//System.out.println("correct ans="+count);
			JOptionPane.showMessageDialog(this,"correct ans="+count);
			System.exit(0);
		}
	}
	void set()
	{
		jb[4].setSelected(true);
		if(current==0)

		{ 
			l.setText("Que1: What is the Time Zone of Bangladesh?");
			jb[0].setText("UTC + 5\\n ");jb[1].setText("UTC + 6\\n ");jb[2].setText("UTC + 4\\n");jb[3].setText("none of all\\n");	
		}
		if(current==1)
		{
			l.setText("Que2: How many kilometeres of costline does Bangladesh have?");
			jb[0].setText("1,682 km\\n");jb[1].setText("257 km\\n");jb[2].setText("2,798 km\\");jb[3].setText("580 km\\n");
		}
		if(current==2)
		{
			l.setText("Que3: What are the some natural Hazards in Bangladesh?");
			jb[0].setText("Droughts, Cyclones , and Earthquake\\n");jb[1].setText("Cyclones , Earthquakes, and Severe flooding\\n");jb[2].setText("Droughts, Cyclones , and Severe Flooding\\n");jb[3].setText("Droughts, Earthquakes, and Landslides\\n");
		}
		if(current==3)
		{
			l.setText("Que4: In Mid-July, What would the weather most likely be in Bangladesh");
			jb[0].setText("Snow , Frost , Ice\\n ");jb[1].setText("Humid , Warm , Rainy\\n");jb[2].setText("Hot & Dry\\n");jb[3].setText(" Mild\\n");
		}
		if(current==4)
		{
			l.setText("Que5:How many chapters does the glorius Quran contain? ");
			jb[0].setText("100\\n");jb[1].setText("125\\n");jb[2].setText("114\\n");jb[3].setText("90\\n");
		}
		if(current==5)
		{
			l.setText("Que6:What was Bangladesh formally known as?");
			jb[0].setText("East Pakistan\\n");jb[1].setText(" East India\\n");jb[2].setText("Wast Bangla\\n");jb[3].setText("Wast Pakistan\\n");
		}
		if(current==6)
		{
			l.setText("Que7:\"What kind of climate does Bangladesh have?  ");
			jb[0].setText("Temperate\\n");jb[1].setText("Tropical\\n");jb[2].setText("Arid\\n");jb[3].setText(" Sub-Arctic\\n");
		}
		if(current==7)
		{
			l.setText("Que8:What are the current Environmental issues in Bangladesh?");
			jb[0].setText("Water Pollution & Shortages\\n");jb[1].setText("Erosion & Deforestation\\n");jb[2].setText(" Severe Overpopulation\\n");jb[3].setText("All of Above\\n");		
		}
		if(current==8)
		{
			l.setText("Que9: When was the first Bangladeshi Taka printed?");
			jb[0].setText("4 March, 1972\\n");jb[1].setText("4 June, 1972\\n");jb[2].setText("4 April, 1972\\n");jb[3].setText("4, December, 1972\\n");
		}
		if(current==9)
		{
			l.setText("Que10:A Storm named ‘Eta’ has recently caused massive landslides in which country?");
			jb[0].setText("Guatemala");jb[1].setText("Brazil");jb[2].setText("New Zealand");jb[3].setText(" Philippines");
		}
                if(current==10)
		{
			l.setText("Que11:Which country has announced a contribution of USD 1 million to the COVID-19 ASEAN Response Fund?");
			jb[0].setText("United States");jb[1].setText("India");jb[2].setText("Singapore");jb[3].setText("China");
		}
                if(current==11)
		{
			l.setText("Que12:Which country has test fired ‘Tsirkon’ hypersonic cruise missile?");
			jb[0].setText("China");jb[1].setText("Japan");jb[2].setText("Russia");jb[3].setText("Canada");
		}
                if(current==12)
		{
			l.setText("Que13:hich country has introduced a Veto Power on any agreements entered with foreign countries?");
			jb[0].setText("Pakistan");jb[1].setText("Afghanistan");jb[2].setText("Japan");jb[3].setText("Australia");
		}
                 if(current==13)
		{
			l.setText("Que14:Which country under its ‘Data Sonification’ program, extracted the sound of important phenomena of the universe?");
			jb[0].setText("India");jb[1].setText("China");jb[2].setText("United States");jb[3].setText("Germany");
		}
                  if(current==14)
		{
			l.setText("Que15:Which country announced to restrict promotion of unhealthy food from April 2022?");
			jb[0].setText("France");jb[1].setText("UK");jb[2].setText("China");jb[3].setText("South Korea");
		}
                   if(current==15)
		{
			l.setText("Que16:Which country released a bill that would increase monitoring of civil society groups?");
			jb[0].setText("Turkey");jb[1].setText("United States");jb[2].setText("Germany");jb[3].setText("North Korea");
		}
                    if(current==16)
		{
			l.setText("Que17:Which country test-fired a nuclear-capable surface-to-surface ballistic missile named ‘Shaheen-III’?");
			jb[0].setText("Iran");jb[1].setText("Pakistan");jb[2].setText("UAE");jb[3].setText("Afganistan");
		}
                     if(current==17)
		{
			l.setText("Que18:Which county has rejoined the “Paris climate agreement” recently?");
			jb[0].setText("USA");jb[1].setText("Japan");jb[2].setText("China");jb[3].setText("Russia");
		}
                      if(current==18)
		{
			l.setText("Que19:Which country recently reported its first known human death of the rare ‘Monkey B virus’?");
			jb[0].setText("USA");jb[1].setText("China");jb[2].setText("South Korea");jb[3].setText("Singapore");
		}
                       if(current==19)
		{
			l.setText("Que20:Which country has become the first country in the world to manufacture fossil-free steel?");
			jb[0].setText("Germany");jb[1].setText("India");jb[2].setText("japan");jb[3].setText("Sweden");
		}
                       if(current==20)
		{
			l.setText("Que21:Who had established the World Series Cricket in 1970s?");
			jb[0].setText(" Kerry Packer");jb[1].setText("David Johnson");jb[2].setText("Allen Hill");jb[3].setText("Alfred Shaw");
		}
                       if(current==21)
		{
			l.setText("Que22:Which nation won the maximum number of medals in the 2018 ISSF World Shooting Championships?");
			jb[0].setText("Sweden");jb[1].setText(" Finland");jb[2].setText("United States");jb[3].setText(" China");
		}
                      
                       if(current==22)
		{
			l.setText("Que23:Who has won the 2018 UCI Cyclo-cross World Cup championship for women?");
			jb[0].setText("Sanne Cant");jb[1].setText("Sophie de Boer");jb[2].setText("Katie Compton");jb[3].setText("Hanka Kupfernagel");
		}
                      
                       if(current==23)
		{
			l.setText("Que24:What is the length of the cricket pitch?");
			jb[0].setText("20.12m");jb[1].setText("23.12m");jb[2].setText("22.12m");jb[3].setText("19.12m");
		}
                      
                       if(current==24)
		{
			l.setText("Que25:Who had designed the Olympic symbol of five rings?");
			jb[0].setText("Baron Coubertin");jb[1].setText("Henri Didon");jb[2].setText("Carl Jung");jb[3].setText("Craig Crowley");
		}
                      
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
	}
	boolean check()
	{
		if(current==0)
			return(jb[1].isSelected());
		if(current==1)
			return(jb[3].isSelected());
		if(current==2)
			return(jb[2].isSelected());
		if(current==3)
			return(jb[1].isSelected());
		if(current==4)
			return(jb[2].isSelected());
		if(current==5)
			return(jb[0].isSelected());
		if(current==6)
			return(jb[0].isSelected());
		if(current==7)
			return(jb[3].isSelected());
		if(current==8)
			return(jb[0].isSelected());
		if(current==9)
			return(jb[0].isSelected());
		if(current==10)
			return(jb[1].isSelected());
		if(current==11)
			return(jb[2].isSelected());
		if(current==12)
			return(jb[3].isSelected());
		if(current==13)
			return(jb[2].isSelected());
		if(current==14)
			return(jb[1].isSelected());
		if(current==15)
			return(jb[0].isSelected());
		if(current==16)
			return(jb[1].isSelected());
		if(current==17)
			return(jb[0].isSelected());
		if(current==18)
			return(jb[1].isSelected());
		if(current==19)
			return(jb[3].isSelected());
		if(current==20)
			return(jb[0].isSelected());
		if(current==21)
			return(jb[3].isSelected());
		if(current==22)
			return(jb[0].isSelected());
		if(current==23)
			return(jb[0].isSelected());
		if(current==24)
			return(jb[0].isSelected());
		return false;
	}
    public static void main(String[] args) {
new JavaProject("General Knowledge Quizes");   
    }
    
}
