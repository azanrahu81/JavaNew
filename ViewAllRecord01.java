import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.*;

import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

class  ViewAllRecord01 extends JFrame implements MouseListener
{
	JFrame win;
	JPanel p1, p2, p3, p4, p5, p6;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
	JTextField t1, t2, t3, t4, t5;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13;
	Color color;
	Font font;

	JComboBox cb, cb1, cb2;


    
    JTable jt, jt1;
    JScrollPane sp, sp1;

    BorderFactory border, border1;

    ImageIcon icon1, icon2, icon3, icon4, icon5, icon6, icon7;
    Image image1, scaledimage1, image2, scaledimage2, image3, scaledimage3, image4, scaledimage4, image5, scaledimage5;
     
    static Statement st=null;
	public ViewAllRecord01()
	{
		win=new JFrame("Add Course");
		win.setLayout(null);


		p3=new JPanel();
        color=new Color(255, 255, 255);
        p3.setBounds(0, 0, 1600, 800);
        p3.setBackground(color);
        p3.setOpaque(true);
        p3.setLayout(null);
        win.add(p3);

		p1=new JPanel();
		p1.setBounds(0,0, 1600, 150);
		color=new Color(0,128, 128);
		p1.setBackground(color);
		p1.setBorder(BorderFactory.createRaisedBevelBorder());
		p1.setLayout(null);
		p3.add(p1);

		p2=new JPanel();
        color=new Color(32, 178, 170);
        p2.setBounds(0, 150, 1600, 50);
        p2.setBackground(color);
        p2.setOpaque(true);
        p2.setLayout(null);
        p3.add(p2);

        
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


        l4=new JLabel("VIEW REPORT");
        l4.setBounds(460,10, 500, 30);
        l4.setFont(new Font("Arial", Font.BOLD, 40));
       // l4.setBorder(BorderFactory.createRaisedBevelBorder());
        p2.add(l4);

        // l1=new JLabel("From Date:");
        // l1.setBounds(250, 280, 200, 30);
        // l1.setFont(new Font("Arial", Font.BOLD, 20));
        // l1.setForeground(Color.black);
        // p3.add(l1);



        // l2=new JLabel("To Date:");
        // l2.setBounds(250, 320, 200, 30);
        // l2.setFont(new Font("Arial", Font.BOLD, 20));
        // l2.setForeground(Color.black);
        // p3.add(l2);

        // l3=new JLabel("Course:");
        // l3.setBounds(250, 355, 200, 30);
        // l3.setFont(new Font("Arial", Font.BOLD, 20));
        // l3.setForeground(Color.black);
        // p3.add(l3);

        // String course[]={"C", "Java", "Php", "Sql"};

        // cb=new JComboBox(course);
        // cb.setBounds(390, 355, 370, 30);
        // p3.add(cb);


	   

        String [] columnsNames={" ID", "Payment","Name", "Course", "Total Fee","Remaks"};
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(columnsNames);

        JTable table=new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);

        JScrollPane scroll=new JScrollPane(table);
        scroll.setBounds(80, 280, 730, 345);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        p3.add(scroll);


        b3=new JButton("   Home");
		b3.setBounds(960, 280, 250, 105);
		b3.setFont(new Font("Arial", Font.BOLD, 30));
		b3.setBorder(BorderFactory.createRaisedBevelBorder());
		b3.setBorder(BorderFactory.createLineBorder(Color.black,2));
		b3.setFocusable(false);
		b3.setForeground(Color.black);
		b3.setBackground(color.white);
		b3.setOpaque(true);
		p3.add(b3);

		icon2=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\h01.png");
		image2=icon2.getImage();
		scaledimage2= image2.getScaledInstance(100,100, Image.SCALE_SMOOTH);
		icon2=new ImageIcon(scaledimage2);
		b3.setIcon(icon2);

		 b4=new JButton("     Save");
		b4.setBounds(960, 400, 250, 105);
		b4.setFont(new Font("Arial", Font.BOLD, 30));
		b4.setBorder(BorderFactory.createRaisedBevelBorder());
		b4.setBorder(BorderFactory.createLineBorder(Color.black,2));
		b4.setFocusable(false);
		b4.setForeground(Color.black);
		b4.setBackground(color.white);
		b4.setOpaque(true);
		p3.add(b4);

		icon3=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\saveblue01.png");
		//icon3=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\save3.png");
		image3=icon3.getImage();
		scaledimage3= image3.getScaledInstance(100,100, Image.SCALE_SMOOTH);

		icon3=new ImageIcon(scaledimage3);
		b4.setIcon(icon3);  


		b6=new JButton("  Logout");
		b6.setBounds(960, 520, 250, 105);
		b6.setFont(new Font("Arial", Font.BOLD, 30));
		b6.setBorder(BorderFactory.createRaisedBevelBorder());
		b6.setBorder(BorderFactory.createLineBorder(Color.black,2));
		b6.setFocusable(false);
		b6.setBackground(color.white);
		b6.setForeground(Color.black);
		b6.setOpaque(true);
		p3.add(b6);

		icon5=new ImageIcon("C:\\Users\\hp\\Desktop\\wallpapers\\logout01.png");
		image5=icon5.getImage();
		scaledimage5= image5.getScaledInstance(100,100, Image.SCALE_SMOOTH);
		icon5=new ImageIcon(scaledimage5);
		b6.setIcon(icon5); 
  
        // t1=new JTextField();
        // t1.setBounds(390,  280, 270, 32);
        // p3.add(t1);

        // b1=new JButton("SEARCH");
        // b1.setBounds(660, 280, 100, 30);
        // b1.setFont(new Font("Arial", Font.BOLD, 20));
        // b1.setBorder(BorderFactory.createRaisedBevelBorder());
        // b1.setBorder(BorderFactory.createLineBorder(color.black,1));
        // b1.setBackground(color.white);
        // b1.setForeground(color.black);

        // b1.setFocusable(false);
        // b1.setOpaque(true);
        // p3.add(b1);

        // t2=new JTextField();
        // t2.setBounds(390,  320, 370, 30);
        // p3.add(t2);

       // b1.addMouseListener(this);
        b3.addMouseListener(this);
        b4.addMouseListener(this);
        b6.addMouseListener(this);


        try
					{
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/search","root","");
						Statement st=conn.createStatement();
						ResultSet result=st.executeQuery("select * from search1  ");

						while(result.next())
						{
							//String aa=result.getString(1);
							String aa=result.getString(1);
							String b=result.getString(2);
							String c=result.getString(3);
							String d=result.getString(4);
							String e=result.getString(5);
							// String f=t7.getText(6);
							// String h=t9.getText(8);
							 String i=result.getString(10);


							String [] z={aa, b, c,d,e,i};

							model.addRow(z);

						}

					}
					catch(Exception e)
					{
						System.out.print(e);
					}
				
			
	

			
			

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
			color=new Color(32, 178, 170);
			b1.setBackground(color);
			b1.setOpaque(true);


		}

		if(b4==ae.getSource())
		{
			color=new Color(32, 178, 170);
			b4.setBackground(color);
			b4.setBackground(Color.white);
			b4.setOpaque(true);


		}

	}
	public void mouseExited(MouseEvent ae)
	{
		if(b5==ae.getSource())
		{
			color=new Color(32, 178, 170);
			b5.setBackground(color);
			b5.setOpaque(true);



		}

	}
	public void mousePressed(MouseEvent ae)
	{
		if(b6==ae.getSource())
		{
			color=new Color(32, 178, 170);
			b6.setBackground(color);
			b6.setOpaque(true);


		}

	}
	public void mouseReleased(MouseEvent ae){}
	public void mouseEntered(MouseEvent ae){}


	public static void main(String[] args) 
	{
		new ViewAllRecord01();
		
	}
	
}