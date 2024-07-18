import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;


class  AddFees extends JFrame implements MouseListener
{
	JFrame win;
	JPanel p1, p2, p3, p4;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18;
	JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;

	Color color;
	Font font;

	BorderFactory border, border1, border2;

	

	JComboBox cb, cb1, cb2, cb3, cb4, cb5, cb6;

     String aa, a, b, c, d, e, f, g,h, i,j,k;
	ImageIcon icon, icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8;
	Image image ,image1, image2, image3, image4,image5, image6, scaledimage, scaledimage1, scaledimage2, scaledimage3, scaledimage4,scaledimage5, scaledimage6;
	public AddFees()
	{
		win=new JFrame();
		win.setLayout(null);

		
		p1=new JPanel();
		p1.setBounds(0,0, 1600, 800);
		color=new Color(255, 255, 255);
		p1.setBackground(color);
		p1.setLayout(null);
		win.add(p1);

		p2=new JPanel();
		p2.setBounds(0,0, 1600, 135);
		color=new Color(0,128, 128);
		p2.setBackground(color);
		p2.setLayout(null);
		p1.setBorder(BorderFactory.createLineBorder(Color.black,1));
		p1.add(p2);

		p3=new JPanel();
		p3.setBounds(0,135, 1600, 50);
		color=new Color(32, 178, 160);
		p3.setBackground(color);
		p3.setBorder(BorderFactory.createLineBorder(Color.black,1));
		p3.setLayout(null);
		p1.add(p3);

        // l4=new JLabel("SEARCH RECORD");
		// l4.setBounds(520, 15, 1600, 30);
		// l4.setFont(new Font("Arial", Font.BOLD, 40));
		// l4.setForeground(Color.black);
		// l4.setFocusable(false);
		// p3.add(l4);
		

		l1=new JLabel("IMAGINE INSTITUTE OF SCIENCE AND TECHNOLOGY");
		l1.setBounds(95, 10, 1500, 40);
		l1.setFont(new Font("Arial", Font.BOLD, 40));
		l1.setFocusable(false);
		p2.add(l1);

		l2=new JLabel("The Center of International Language & Computer Network");
		l2.setBounds(310, 65, 1500, 30);
		l2.setFont(new Font("Arial", Font.BOLD, 30));
		l2.setFocusable(false);
		p2.add(l2);

		l3=new JLabel("Cell No:+923402486381: hussainirfanalijoyo@gmail.com");
		l3.setBounds(450, 110, 1500, 20);
		l3.setFont(new Font("Arial", Font.BOLD, 20));
		l3.setFocusable(false);
		p2.add(l3);


		l4=new JLabel("ADD FEES");
		l4.setBounds(520, 15, 1600, 30);
		l4.setFont(new Font("Arial", Font.BOLD, 40));
		l4.setForeground(Color.black);
		l4.setFocusable(false);
		p3.add(l4);

		
		l5=new JLabel("ID/Receipt No:");
		l5.setBounds(250, 200, 180, 20);
		l5.setFont(new Font("Serif", Font.BOLD, 20));
		l5.setForeground(Color.black);
		p1.add(l5);

	    l6=new JLabel("Payment Method");
		l6.setBounds(250, 240, 180, 20);
		l6.setFont(new Font("Serif", Font.BOLD, 20));
		l6.setForeground(Color.black);
		p1.add(l6);

		l7=new JLabel("Account Name:");
		l7.setBounds(250, 280, 180, 20);
		l7.setFont(new Font("Serif", Font.BOLD, 20));
		l7.setForeground(Color.black);
		p1.add(l7);

		l8=new JLabel("Course:");
		l8.setBounds(250, 320, 180, 20);
		l8.setFont(new Font("Serif", Font.BOLD, 20));
		l8.setForeground(Color.black);
		p1.add(l8);

		l9=new JLabel("Total Fee:");
		l9.setBounds(250, 360, 180, 20);
		l9.setFont(new Font("Serif", Font.BOLD, 20));
		l9.setForeground(Color.black);
		p1.add(l9);

		l10=new JLabel("Total Fee");
		l10.setBounds(250, 400, 180, 20);
		l10.setFont(new Font("Serif", Font.BOLD, 20));
		l10.setForeground(Color.black);
		p1.add(l10);

		l11=new JLabel("Due");
		l11.setBounds(250, 440, 180, 20);
		l11.setFont(new Font("Serif", Font.BOLD, 20));
		l11.setForeground(Color.black);
		p1.add(l11);

		l12=new JLabel("Sumission Date");
		l12.setBounds(250, 480, 180, 20);
		l12.setFont(new Font("Serif", Font.BOLD, 20));
		l12.setForeground(Color.black);
		p1.add(l12);

		l13=new JLabel("Month:");
		l13.setBounds(250, 520, 180, 20);
		l13.setFont(new Font("Serif", Font.BOLD, 20));
		l13.setForeground(Color.black);
		p1.add(l13);

		l14=new JLabel("Remarks:");
		l14.setBounds(250, 560, 180, 20);
		l14.setFont(new Font("Serif", Font.BOLD, 20));
		l14.setForeground(Color.black);
		p1.add(l14);


        String payment[]={"Select Payment Method","jazcash","withdraw", "easiy paisa"};
        cb=new JComboBox(payment);
		cb.setBounds(430, 240, 400, 30);
		cb.setFont(new Font("Arial", Font.BOLD, 15));
		p1.add(cb);

		

		String course[]={"Select Course","C++", "Java", "C","Servelet", "Spring", "AI"};
		cb2=new JComboBox(course);
		cb2.setBounds(430, 320, 400, 30);
		cb2.setFont(new Font("Arial", Font.BOLD, 15));
		p1.add(cb2);

		

		
		String month[]={"Month","January", "February", "March", "April", "May", "June", "July", "August", "Novemeber", "Otober"};
		cb3=new JComboBox(month);
		cb3.setBounds(535, 480, 150, 30);
		cb3.setFont(new Font("Arial", Font.BOLD, 15));
		p1.add(cb3);

		String date[]={"Date","1", "2", "3","4", "5", "6", "7","8", "9","10"};
		cb4=new JComboBox(date);
		cb4.setBounds(430, 480, 100, 30);
		cb4.setFont(new Font("Arial", Font.BOLD, 15));
		p1.add(cb4);

		String year[]={"Year","2000", "2001","2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010"};
		cb6=new JComboBox(year);
		cb6.setBounds(690, 480, 137, 30);
		cb6.setFont(new Font("Arial", Font.BOLD, 15));
		p1.add(cb6);

		t1=new JTextField();
		t1.setBounds(430, 200, 400, 30);
		p1.add(t1);

		t3=new JTextField();
		t3.setBounds(430, 280, 400, 30);
		p1.add(t3);

		
        t5=new JTextField();
		t5.setBounds(430, 360, 400,30);
		p1.add(t5);

		t6=new JTextField();
		t6.setBounds(430, 400, 400, 30);
		p1.add(t6);

		t7=new JTextField();
		t7.setBounds(430, 440, 400, 30);
		p1.add(t7);


		
		t9=new JTextField();
		t9.setBounds(430, 520, 400, 30);
		p1.add(t9);

		t10=new JTextField();
		t10.setBounds(430, 560, 400, 60);
		p1.add(t10);

		// b2=new JButton("search");
		// b2.setBounds(730, 200, 100, 30);
		// b2.setFont(new Font("Arial", Font.BOLD, 20));
		// b2.setBorder(BorderFactory.createRaisedBevelBorder());
		// b2.setBorder(BorderFactory.createLineBorder(Color.black,2));
		// b2.setForeground(Color.black);
		// b2.setFocusable(false);
		// p1.add(b2);

		b3=new JButton("   Home");
		b3.setBounds(960, 200, 250, 105);
		b3.setFont(new Font("Arial", Font.BOLD, 30));
		b3.setBorder(BorderFactory.createRaisedBevelBorder());
		b3.setBorder(BorderFactory.createLineBorder(Color.black,2));
		b3.setFocusable(false);
		b3.setForeground(Color.black);
		b3.setOpaque(true);
		p1.add(b3);

		icon2=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\h01.png");
		image2=icon2.getImage();
		scaledimage2= image2.getScaledInstance(100,100, Image.SCALE_SMOOTH);
		icon2=new ImageIcon(scaledimage2);
		b3.setIcon(icon2);  

   
        b4=new JButton("     Save");
		b4.setBounds(960, 315, 250, 105);
		b4.setFont(new Font("Arial", Font.BOLD, 30));
		b4.setBorder(BorderFactory.createRaisedBevelBorder());
		b4.setBorder(BorderFactory.createLineBorder(Color.black,2));
		b4.setFocusable(false);
		b4.setForeground(Color.black);
		b4.setOpaque(true);
		p1.add(b4);

		icon3=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\saveblue01.png");
		image3=icon3.getImage();
		scaledimage3= image3.getScaledInstance(100,100, Image.SCALE_SMOOTH);
		icon3=new ImageIcon(scaledimage3);
		b4.setIcon(icon3);  


		b5=new JButton("Preview");
		b5.setBounds(960, 430, 250, 105);
		b5.setFont(new Font("Arial", Font.BOLD, 30));
		b5.setBorder(BorderFactory.createRaisedBevelBorder());
		b5.setBorder(BorderFactory.createLineBorder(Color.black,2));
		b5.setFocusable(false);
		b5.setForeground(Color.black);
		b5.setContentAreaFilled(false);
		b5.setOpaque(true);
		p1.add(b5);

		icon4=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\preview09.png");
		image4=icon4.getImage();
		scaledimage4= image4.getScaledInstance(100,100, Image.SCALE_SMOOTH);
		icon4=new ImageIcon(scaledimage4);
		b5.setIcon(icon4);  

		b6=new JButton("  Logout");
		b6.setBounds(960, 540, 250, 105);
		b6.setFont(new Font("Arial", Font.BOLD, 30));
		b6.setBorder(BorderFactory.createRaisedBevelBorder());
		b6.setBorder(BorderFactory.createLineBorder(Color.black,2));
		b6.setFocusable(false);
		b6.setForeground(Color.black);
		b6.setOpaque(true);
		p1.add(b6);

		icon5=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\logout01.png");
		image5=icon5.getImage();
		scaledimage5= image5.getScaledInstance(100,100, Image.SCALE_SMOOTH);
		icon5=new ImageIcon(scaledimage5);
		b6.setIcon(icon5); 

		//b1.addMouseListener(this);
		//b2.addMouseListener(this);
		b3.addMouseListener(this);
		b4.addMouseListener(this);
		b5.addMouseListener(this);
		b6.addMouseListener(this);



		

        win.setSize(1600, 800);
		win.setLocationRelativeTo(null);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setExtendedState(JFrame.MAXIMIZED_BOTH);
		win.setVisible(true);

        //Add Save  Button--------------------------------------------------------------------------------
		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
					//new Login1();


					// save use for data.......................................................................

					String  a=t1.getText();
					//String a=t2.getText();
					String aa=cb.getSelectedItem().toString();
					String b=t3.getText();
					//String c=t4.getText();
					String c=cb2.getSelectedItem().toString();
					String d=t5.getText();
					String e=t6.getText();
					String f=t7.getText();
					
					String g=cb3.getSelectedItem().toString();
					
					String h=t9.getText();
					String i=t10.getText();
					String j=cb4.getSelectedItem().toString();
					String k=cb6.getSelectedItem().toString();
					String date = g +"-"+j+"-"+k;

					try
					{
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/search","root","");
						Statement st=conn.createStatement();
						String query="INSERT into search1 (Payment, AccountName, Course, Total, Paid, Due, Submission, Month, Remarks) Values('"+aa+"', '"+b+"', '"+c+"','"+d+"','"+e+"', '"+f+"', '"+date+"','"+h+"','"+i+"')";
						st.executeUpdate(query);
						System.out.print("......................save.........................");
						System.out.println("Save is Successfully Good");

					}
				    catch(Exception ee)
					{
						System.out.print(ee);
						//showdata();

					}
				}
			
		});
	}
	

			
			

	


	
	     
	public void mouseClicked(MouseEvent ae)
	{
		if(b1==ae.getSource())
		{
			color=new Color(32, 178, 170);
			b1.setBackground(color);
			b1.setOpaque(true);
		}
	}
	// public void mouseExited(MouseEvent ae)
	// {
	// 	if(b2==ae.getSource())
	// 	{
	// 		color=new Color(32, 178, 170);
	// 		//b2.setBackground(Color.blue);
	// 		b2.setBackground(color);
	// 		b2.setOpaque(true);
	// 	}
	// }
	public void mouseReleased(MouseEvent ae)
	{
		if(b3==ae.getSource())
		{
			color=new Color(32, 178, 170);
			b3.setBackground(color);
			b3.setOpaque(true);
		}

	}
	public void mousePressed(MouseEvent ae)
	{
		if(b4==ae.getSource())
		{
			color=new Color(32, 178, 170);
			b4.setBackground(color);
			b4.setOpaque(true);
		}

		if(b5==ae.getSource())
		{
			color=new Color(32, 178, 170);
			b5.setBackground(color);
			b5.setOpaque(true);
		}

	}
	public void mouseExited(MouseEvent ae){}
	public void mouseEntered(MouseEvent ae)
	{
		if(b6==ae.getSource())
		{
			color=new Color(32, 178, 170);
			b6.setBackground(color);
			b6.setOpaque(true);
		}
	}
	
	public static void main(String[] args) 
	{
		new AddFees();
		
	}
	
}
