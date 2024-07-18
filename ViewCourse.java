import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Dimension;



import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

class ViewCourse extends JFrame implements MouseListener
{
	JFrame win;
	JPanel p1, p2, p3, p4, p5, p6, p7;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14;
	JTextField t1, t2, t3, t4, t5, t6, t7;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19;

	JTextArea textArea;
	JScrollPane scroll1;

	Color color;
	Font font;

	ImageIcon  icon,icon1, icon2, icon3,  icon4, icon5, icon6, icon7, icon8, icon9, icon10, icon11;
	Image  image, scaledimage, image1, image2, image3, image4, image5, image6, image7,
	 image8, image9 , image10, image11, image12,
	scaledimage1, scaledimage2, scaledimage3, scaledimage4, scaledimage5,scaledimage6,scaledimage7,
	scaledimage8, scaledimage9, scaledimage10, scaledimage11, scaledimage12;

	public ViewCourse()
	{
		win=new JFrame("ViewCourse");
		win.setLayout(null);

        //color=new Color(112, 112, 255);
        color=new Color(0, 128,128);
         //color=new Color(32, 178, 170);
        p1=new JPanel();
        p1.setBounds(0,0, 1600, 150);
        p1.setBackground(color);
        p1.setLayout(null);
        p1.setOpaque(true);
        win.add(p1);


        p2=new JPanel();
       // color=new Color(191, 191, 191);
        color=new Color(32, 178, 170);
        p2.setBounds(0, 150, 1600, 60);
        p2.setBackground(color);
       // p2.setForeground(Color.black);
        p2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        p2.setOpaque(true);
        p2.setLayout(null);
        win.add(p2);

         p3=new JPanel();
       // color=new Color(191, 191, 191);
        color=new Color(32, 178, 170);
        p3.setBounds(0, 0, 1600, 800);
        p3.setBackground(color);
       // p2.setForeground(Color.black);
        p3.setBorder(BorderFactory.createLineBorder(Color.black,1));
       // Dimension preferred = frame.getPreferredSize();
        p3.setPreferredSize(new Dimension(1000, 2000));
        p3.setOpaque(true);
        p3.setLayout(null);
        win.add(p3);







        l1=new JLabel("IMAGINE INSTITUTE OF SCIENCE AND TECHNOLOGY");
		l1.setBounds(120, 10, 1500, 40);
		l1.setFont(new Font("Arial", Font.BOLD, 40));
		l1.setFocusable(false);
		p1.add(l1);

		l2=new JLabel("The Center of International Language & Computer Network");
		l2.setBounds(200, 65, 1500, 30);
		l2.setFont(new Font("Arial", Font.BOLD, 30));
		l2.setFocusable(false);
		p1.add(l2);

		l3=new JLabel("Cell No:+923402486381: hussainirfanalijoyo@gmail.com");
		l3.setBounds(340, 110, 1500, 20);
		l3.setFont(new Font("Arial", Font.BOLD, 20));
		l3.setFocusable(false);
		p1.add(l3);

        // l1=new JLabel("IMAGINE INSTITUTE OF SCIENCE AND TECHNOLOGY");
        // l1.setBounds(115, 5, 1400, 40);
        // l1.setFont(new Font("", Font.BOLD, 50));
        // l1.setForeground(Color.black);
        // p1.add(l1);

        // l2=new JLabel("The Center of International Language & Computer Network");
        // l2.setBounds(220, 70, 1200, 50);
        // l2.setFont(new Font("Arial", Font.BOLD, 40));
        // l2.setForeground(Color.black);
        // p1.add(l2);

        // l3=new JLabel("Cell No: +92340345688 E mail azan@gmail.com");
        // l3.setBounds(340 ,130, 800, 30);
        // l3.setFont(new Font("Arial", Font.BOLD, 30));
        // l3.setForeground(Color.black);
        // p1.add(l3);

         // textArea = new JTextArea(); 
       // textArea.setBounds(100, 400, 100, 300) ;
         
        scroll1 = new JScrollPane(p3);
       // scroll1.setBounds(0, 177, 1280, 480); 
       scroll1.setBounds(0,200, 1280, 480); 
  
        scroll1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scroll1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        win.add(scroll1);




        // JScrollPane scroll=new JScrollPane(table);
        // scroll.setBounds(255, 400, 505, 200);
        // scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        // scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        // .add(scroll); 
     

        l4=new JLabel("VIEW COURSE");
        l4.setBounds(480,10, 500, 30);
        l4.setFont(new Font("Arial", Font.BOLD, 40));
        l4.setForeground(Color.black);
        p2.add(l4);
        

        b1=new JButton(" MS Office");
		b1.setBounds(330, 80, 310, 180);
		//l2.setBackground(Color.BLUE);
		b1.setFont(new Font("Arial", Font.BOLD, 30));
		b1.setBorder(BorderFactory.createRaisedBevelBorder());
		b1.setFocusable(false);
		b1.setForeground(Color.black);
		b1.setOpaque(true);
		p3.add(b1);

		icon=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\ms01.png");
		image=icon.getImage();
		scaledimage= image.getScaledInstance(130,130, Image.SCALE_SMOOTH);
		icon=new ImageIcon(scaledimage);
		b1.setIcon(icon);

		b2=new JButton("     CIT");
		b2.setBounds(645, 80, 310, 180);
		b2.setFont(new Font("Arial", Font.BOLD, 30));
		b2.setBorder(BorderFactory.createRaisedBevelBorder());
		b2.setForeground(Color.black);
		b2.setFocusable(false);
		b2.setOpaque(true);
		p3.add(b2);

		icon1=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\cit06.png");
		image1=icon1.getImage();
		scaledimage1=image1.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
		icon1=new ImageIcon(scaledimage1);
		b2.setIcon(icon1);

		b3=new JButton("      C++");
		b3.setBounds(330, 270, 310, 180);
		b3.setFont(new Font("Arial", Font.BOLD, 30));
		b3.setBorder(BorderFactory.createRaisedBevelBorder());
		b3.setForeground(Color.black);
		b3.setFocusable(false);
		b3.setOpaque(true);
		p3.add(b3);

		icon2=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\c10.png");
		image2=icon2.getImage();
		scaledimage2=image2.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
		icon2=new ImageIcon(scaledimage2);
		b3.setIcon(icon2);


		b4=new JButton("     Java");
		b4.setBounds(645, 270, 310, 180);
		b4.setFont(new Font("Arial", Font.BOLD, 30));
		b4.setBorder(BorderFactory.createRaisedBevelBorder());
		b4.setForeground(Color.black);
		b4.setFocusable(false);
		b4.setOpaque(true);
		p3.add(b4);

		icon3=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\java06.png");
		image3=icon3.getImage();
		scaledimage3=image3.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
		icon3=new ImageIcon(scaledimage3);
		b4.setIcon(icon3);

		


		b6=new JButton("   HTML");
		b6.setBounds(330, 460, 310, 180);
		b6.setFont(new Font("Arial", Font.BOLD, 30));
		b6.setBorder(BorderFactory.createRaisedBevelBorder());
		b6.setForeground(Color.black);
		b6.setFocusable(false);
		b6.setOpaque(true);
		p3.add(b6);

		icon4=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\html3.png");
		image4=icon4.getImage();
		scaledimage4=image4.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
		icon4=new ImageIcon(scaledimage4);
		b6.setIcon(icon4);


		


		b5=new JButton("   CSS");
		b5.setBounds(645, 460, 310, 180);
		b5.setFont(new Font("Arial", Font.BOLD, 30));
		b5.setBorder(BorderFactory.createRaisedBevelBorder());
		b5.setForeground(Color.black);
		b5.setFocusable(false);
		b5.setOpaque(true);
		p3.add(b5);


		icon5=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\css02.png");
		image5=icon5.getImage();
		scaledimage5=image5.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
		icon5=new ImageIcon(scaledimage5);
		b5.setIcon(icon5);


		b7=new JButton("   PYTHON");
		b7.setBounds(330, 650, 310, 180);
		b7.setFont(new Font("Arial", Font.BOLD, 30));
		b7.setBorder(BorderFactory.createRaisedBevelBorder());
		b7.setForeground(Color.black);
		b7.setFocusable(false);
		b7.setOpaque(true);
		p3.add(b7);


		icon6=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\python03.png");
		image6=icon6.getImage();
		scaledimage6=image6.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
		icon6=new ImageIcon(scaledimage6);
		b7.setIcon(icon6);


		b8=new JButton("   AMAZON");
		b8.setBounds(645, 650, 310, 180);
		b8.setFont(new Font("Arial", Font.BOLD, 30));
		b8.setBorder(BorderFactory.createRaisedBevelBorder());
		b8.setForeground(Color.black);
		b8.setFocusable(false);
		b8.setOpaque(true);
		p3.add(b8);


		icon7=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\amazon4.png");
		image7=icon7.getImage();
		scaledimage7=image7.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
		icon7=new ImageIcon(scaledimage7);
		b8.setIcon(icon7);


		b9=new JButton("  C");
		b9.setBounds(330, 850, 310, 180);
		b9.setFont(new Font("Arial", Font.BOLD, 30));
		b9.setBorder(BorderFactory.createRaisedBevelBorder());
		b9.setForeground(Color.black);
		b9.setFocusable(false);
		b9.setOpaque(true);
		p3.add(b9);


		icon8=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\cc02.png");
		image8=icon8.getImage();
		scaledimage8=image8.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
		icon8=new ImageIcon(scaledimage8);
		b9.setIcon(icon8);


		b10=new JButton("  C#");
		b10.setBounds(645, 850, 310, 180);
		b10.setFont(new Font("Arial", Font.BOLD, 30));
		b10.setBorder(BorderFactory.createRaisedBevelBorder());
		b10.setForeground(Color.black);
		b10.setFocusable(false);
		b10.setOpaque(true);
		p3.add(b10);


		icon9=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\c#2.png");
		image9=icon9.getImage();
		scaledimage9=image9.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
		icon9=new ImageIcon(scaledimage9);
		b10.setIcon(icon9);



		b11=new JButton("  SQL");
		b11.setBounds(645, 1050, 310, 180);
		b11.setFont(new Font("Arial", Font.BOLD, 30));
		b11.setBorder(BorderFactory.createRaisedBevelBorder());
		b11.setForeground(Color.black);
		b11.setFocusable(false);
		b11.setOpaque(true);
		p3.add(b11);


		icon10=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\sql6.png");
		image10=icon10.getImage();
		scaledimage10=image10.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
		icon10=new ImageIcon(scaledimage10);
		b11.setIcon(icon10);



		b12=new JButton("  SQL");
		b12.setBounds(330, 1050, 310, 180);
		b12.setFont(new Font("Arial", Font.BOLD, 30));
		b12.setBorder(BorderFactory.createRaisedBevelBorder());
		b12.setForeground(Color.black);
		b12.setFocusable(false);
		b12.setOpaque(true);
		p3.add(b12);


		icon11=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\visualbasic02.png");
		image11=icon11.getImage();
		scaledimage11=image11.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		icon11=new ImageIcon(scaledimage11);
		b12.setIcon(icon11);




		











		b1.addMouseListener(this);
		b2.addMouseListener(this);
		b3.addMouseListener(this);
		b4.addMouseListener(this);
		b5.addMouseListener(this);
		b6.addMouseListener(this);
		b7.addMouseListener(this);
		b8.addMouseListener(this);
		b9.addMouseListener(this);
		b10.addMouseListener(this);
		b11.addMouseListener(this);
		b12.addMouseListener(this);







		win.setSize(1600, 800);
		win.setLocationRelativeTo(null);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setExtendedState(JFrame.MAXIMIZED_BOTH);
		win.setVisible(true);



	}
	public void mouseClicked(MouseEvent ae)
	{
		if(b1==ae.getSource())
		{
			color=new Color(0,128, 128);
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
		if(b5==ae.getSource())
		{
			
			color=new Color(32, 178, 170);
			b5.setBackground(color);
			b5.setOpaque(true);


		}
		if(b6==ae.getSource())
		{
			color=new Color(32, 178, 170);
			b6.setBackground(color);
			b6.setOpaque(true);

		}
		if(b7==ae.getSource())
		{
			color=new Color(32, 178, 170);
			b7.setBackground(color);
			b7.setOpaque(true);

		}
		if(b8==ae.getSource())
		{
			color=new Color(32, 178, 170);
			b8.setBackground(color);
			b8.setOpaque(true);


		}
		if(b9==ae.getSource())
		{
			color=new Color(32, 178, 170);
			b9.setBackground(color);
			b9.setOpaque(true);


		}

		if(b10==ae.getSource())
		{
			color=new Color(32, 178, 170);
			b10.setBackground(color);
			b10.setOpaque(true);


		}
		if(b11==ae.getSource())
		{
			color=new Color(32, 178, 170);
			b11.setBackground(color);
			b11.setOpaque(true);


		}
		if(b12==ae.getSource())
		{
			color=new Color(32, 178, 170);
			b12.setBackground(color);
			b12.setOpaque(true);


		}

	}
	public void mouseEntered(MouseEvent ae){}
	public void actionPerformed(ActionEvent ae)
	{

	}
	public static void main(String[] args) 
	{
		new ViewCourse();
		
	}
}