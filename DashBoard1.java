import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;


import java.awt.Image;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;


class  DashBoard1 extends JFrame implements MouseListener,ActionListener
{
	JFrame win;
	JPanel p1, p2, p3, p4;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
	JTextField t1, t2, t3;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;

	Color color, color1, color2, color3;
	Font font, font1, font2, font3;

	ImageIcon icon, icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8;
	Image  imageone, scaledImage, imageone1, scaledImage1, imageone2, scaledImage2, imageone3, scaledImage3, imageone4, scaledImage4, imageone5, scaledImage5;
	public  DashBoard1() // Constructor
	{

		win=new JFrame();
		win.setLayout(null);

		// p1=new JPanel();
		// color=new Color(0,128,128);

	   // color=new Color(0, 128,128);
		color=new Color(32, 178, 160);

        p1=new JPanel();
        p1.setBounds(0,0, 1600, 170);
        p1.setBackground(color);
        p1.setLayout(null);
        p1.setOpaque(true);
        win.add(p1);


        p2=new JPanel(); //22, 47, 190
       // color=new Color(32, 178, 170);
        color=new Color(0, 128, 128);
        p2.setBounds(0, 170, 1600, 40);
        p2.setBackground(color);
        p2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        p2.setOpaque(true);
        p2.setLayout(null);
        win.add(p2);

        l1=new JLabel("IMAGINE INSTITUTE OF SCIENCE AND TECHNOLOGY");
        l1.setBounds(70, 5, 1400, 50);
        l1.setFont(new Font("", Font.BOLD, 45));
        l1.setForeground(Color.white);
        p1.add(l1);

        l2=new JLabel("The Center of International Language & Computer Network");
        l2.setBounds(170, 70, 1200, 50);
        l2.setFont(new Font("Arial", Font.BOLD, 35));
        l2.setForeground(Color.white);
        p1.add(l2);

        l3=new JLabel("Cell No: +92340345688 E mail azan@gmail.com");
        l3.setBounds(290 ,130, 800, 30);
        l3.setFont(new Font("Arial", Font.BOLD, 30));
        l3.setForeground(Color.white);
        p1.add(l3);

        l4=new JLabel("DASHBOARD");
        l4.setBounds(480,10, 500, 30);
        l4.setFont(new Font("Arial", Font.BOLD, 40));
        l4.setForeground(Color.white);
        p2.add(l4);

        p2=new JPanel();
		p2.setBounds(0, 0, 1550, 800);
		color=new Color(32, 178, 160);
		p2.setBackground(color);
		p2.setLayout(null);
		win.add(p2);

        b1=new JButton("ADD FEES");
		b1.setBounds(200, 260, 290, 160);
		b1.setFont(new Font("Arial", Font.BOLD, 20));
		b1.setBorder(BorderFactory.createRaisedBevelBorder());
		b1.setBorder(BorderFactory.createLineBorder(Color.black,1));
		b1.setForeground(Color.black);
		b1.setFocusable(false);
		b1.setOpaque(true);
		p2.add(b1);

		icon=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\fees05.png");
		imageone=icon.getImage();
		scaledImage= imageone.getScaledInstance(100,100, Image.SCALE_SMOOTH);
		icon=new ImageIcon(scaledImage);
		b1.setIcon(icon);

		b2=new JButton("Add COURSE");
		b2.setBounds(500, 260, 290, 160);
		b2.setFont(new Font("Arial", Font.BOLD, 20));
		b2.setBorder(BorderFactory.createRaisedBevelBorder());
		b2.setBorder(BorderFactory.createLineBorder(Color.black,1));
		b2.setFocusable(false);
		b2.setForeground(Color.black);
		//b2.setForeground(Color.black);
		b2.setOpaque(true);
		p2.add(b2);

		icon1=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\edit02.png");
        imageone1=icon1.getImage();
		scaledImage1= imageone1.getScaledInstance(100,100, Image.SCALE_SMOOTH);
		icon1=new ImageIcon(scaledImage1);
		b2.setIcon(icon1);



		b3=new JButton("SEARCH RECORD");
		//b3.setContentAreaFilled(false);
		b3.setBounds(800, 260, 290, 160);
		b3.setFont(new Font("Arial", Font.BOLD, 20));
		b3.setBorder(BorderFactory.createRaisedBevelBorder());
		b3.setBorder(BorderFactory.createLineBorder(Color.black,1));
		b3.setForeground(Color.black);
		b3.setFocusable(false);
		b3.setOpaque(true);
		p2.add(b3);

		icon2=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\record006.jpg");
		imageone2=icon2.getImage();
		scaledImage2= imageone2.getScaledInstance(100,100, Image.SCALE_SMOOTH);
		icon2=new ImageIcon(scaledImage2);
		b3.setIcon(icon2);

		b4=new JButton("VIEW COURSE");
		b4.setBounds(200, 440, 290, 160);
		b4.setFont(new Font("Arial", Font.BOLD, 20));
		b4.setBorder(BorderFactory.createRaisedBevelBorder());
		b4.setBorder(BorderFactory.createLineBorder(Color.black,1));
		b4.setForeground(color.black);
		b4.setFocusable(false);
		b4.setOpaque(true);
		p2.add(b4);

		icon3=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\course03.png");
		imageone3=icon3.getImage();
		scaledImage3= imageone3.getScaledInstance(100,100, Image.SCALE_SMOOTH);
		icon3=new ImageIcon(scaledImage3);
		b4.setIcon(icon3);


		b5=new JButton("VIEW REPORT");
		b5.setBounds(500, 440, 290, 160);
		b5.setFont(new Font("Arial", Font.BOLD, 20));
		b5.setBorder(BorderFactory.createRaisedBevelBorder());
		b5.setBorder(BorderFactory.createLineBorder(Color.black,1));
		b5.setForeground(color.black);
		b5.setFocusable(false);
		b5.setOpaque(true);
		p2.add(b5);

		icon4=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\report7.png");
		imageone4=icon4.getImage();
		scaledImage4= imageone4.getScaledInstance(80,80, Image.SCALE_SMOOTH);
		icon4=new ImageIcon(scaledImage4);
		b5.setIcon(icon4);


		b6=new JButton("ALL VIEW RECORD");
		b6.setBounds(800, 440, 290, 160);
		b6.setFont(new Font("Arial", Font.BOLD, 20));
		b6.setBorder(BorderFactory.createRaisedBevelBorder());
		b6.setBorder(BorderFactory.createLineBorder(Color.black,1));
		b6.setForeground(Color.black);
		b6.setFocusable(false);
		b6.setOpaque(true);
		p2.add(b6);

		icon5=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\course03.png");
		imageone5=icon5.getImage();
		scaledImage5= imageone5.getScaledInstance(80,80, Image.SCALE_SMOOTH);
		icon5=new ImageIcon(scaledImage5);
		b6.setIcon(icon5);

		b7=new JButton("Logout");
		b7.setBounds(0, 620, 120, 50);
		color=new Color(0,128, 128);
		b7.setFont(new Font("Arila", Font.BOLD, 25));
		b7.setBorder(BorderFactory.createRaisedBevelBorder());
		b7.setBorder(BorderFactory.createLineBorder(Color.black,1));
		b7.setForeground(Color.black);
		b7.setBackground(color);
		p2.add(b7);

		b8=new JButton("About");
		b8.setBounds(1160, 620, 120, 50);
		b8.setFont(new Font("Arial", Font.BOLD, 25));
		b8.setBorder(BorderFactory.createRaisedBevelBorder());
		b7.setBorder(BorderFactory.createLineBorder(Color.black,1));
		color=new Color(0, 128, 128);
		b8.setBackground(color);
		
		b8.setOpaque(true);
		p2.add(b8);




		b1.addMouseListener(this);
		b2.addMouseListener(this);
		b3.addMouseListener(this);
		b4.addMouseListener(this);
		b5.addMouseListener(this);
		b6.addMouseListener(this);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);



        win.setSize(1600, 800);
		win.setLocationRelativeTo(null);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setExtendedState(JFrame.MAXIMIZED_BOTH);
		win.setVisible(true);
	}
	public void mouseClicked(MouseEvent ae){}
	// public void mouseAdapter(MouseEvent ae){}
	public void mouseExit(MouseEvent ae)
	{
		if(b1==ae.getSource())
		{
			color=new Color(32, 178, 170);
			b1.setBackground(color);
			b1.setOpaque(true);
		}
	}
	public void mouseExited(MouseEvent ae)
	{
		if(b2==ae.getSource())
		{
            color=new Color(32, 178, 170);
			b2.setBackground(color);
			b2.setOpaque(true);
	    }
	}
	public void mousePressed(MouseEvent ae)
	{
		if(b3==ae.getSource())
		{
			color=new Color(32, 178, 170);
			b3.setBackground(color);
			b3.setOpaque(true);
		}
	}
	public void mouseReleased(MouseEvent ae)
	{
		if(b4==ae.getSource())
		{
			color=new Color(32, 178, 170);
			b4.setBackground(color);
			b3.setOpaque(true);
		}

	}
	public void mouseEntered(MouseEvent ae)
	{

		if(b5==ae.getSource())
		{
			color=new Color(32, 178, 170);
			b5.setBackground(color);
			b5.setOpaque(true);
		}
	}
    public void mouseAdapter(MouseEvent ae)
    {
			if(b6==ae.getSource())
		   {
			   color=new Color(32, 178, 170);
			   b6.setBackground(color);
			   b6.setOpaque(true);
		    }
		
	}

	public void actionPerformed(ActionEvent e)
	{
		if(b1==e.getSource())
		{
			new AddFees();
		}
		if(b2==e.getSource())
		{
			new AddCourse();

		}
		if(b3==e.getSource())
		{
			new AddRecord01();
		}
		if(b4==e.getSource())
		{
			new ViewCourse();
		}
		if(b5==e.getSource())
		{
			new ViewReport01();
		}
		if(b6==e.getSource())
		{
			new ViewAllRecord01();

		}
	}
		
	

		public static void main(String[] args)
		{
			new DashBoard1();
			
		}

}