

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.ResultSet;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.UIManager;

import java.net.*;
import java.io.*;

public  class WirelessRouter<mouseEvent> implements ActionListener
{
	public Font f0 = new Font("Verdana" , Font.BOLD , 18);
	public Font f = new Font("Times New roman" , Font.BOLD , 18);
	public Font f1 = new Font("Calibrie", Font.BOLD + Font.ITALIC,18);
	public Font f2 = new Font("Calibrie" , Font.BOLD , 18);
	public JFrame jf;
	public Container c;
	
	JMenuBar mbr;
    JMenu m,m1;
    JMenuItem mi1,mi2,mi3,mi4,mi21,mi22,mi23,mi24;
	String n1path="",n2path="",n3path="",n4path="",n5path="",n6path="",n7path="",n8path="",n9path="",n10path="",n11path="",n12path="",n13path="",n14path="",n15path="",n16path="";
	String n17path="",n18path="",n19path="",n20path="",n21path="",n22path="",n23path="",n24path="",n25path="",n26path="",n27path="",n28path="",n29path="",n30path="",n31path="",n32path="";
	String n1jam="",n2jam="",n3jam="",n4jam="",n5jam="",n6jam="",n7jam="",n8jam="",n9jam="",n10jam="",n11jam="",n12jam="",n13jam="",n14jam="",n15jam="",n16jam="";
	String n17jam="",n18jam="",n19jam="",n20jam="",n21jam="",n22jam="",n23jam="",n24jam="",n25jam="",n26jam="",n27jam="",n28jam="",n29jam="",n30jam="",n31jam="",n32jam="";
	String bound1="",bound2="",bound3="",bound4="";
	
	ImageIcon bn1 = new ImageIcon(this.getClass().getResource("bn1.png"));
	ImageIcon bn2 = new ImageIcon(this.getClass().getResource("bn2.png"));
	ImageIcon bn3 = new ImageIcon(this.getClass().getResource("bn3.png"));
	ImageIcon bn4 = new ImageIcon(this.getClass().getResource("bn4.png"));
	ImageIcon bn5 = new ImageIcon(this.getClass().getResource("bn5.png"));
	ImageIcon bn6 = new ImageIcon(this.getClass().getResource("bn6.png"));
	ImageIcon bn7 = new ImageIcon(this.getClass().getResource("bn7.png"));
	ImageIcon bn8 = new ImageIcon(this.getClass().getResource("bn8.png"));
	ImageIcon bn9 = new ImageIcon(this.getClass().getResource("bn9.png"));
	ImageIcon bn10 = new ImageIcon(this.getClass().getResource("bn10.png"));
	ImageIcon bn11 = new ImageIcon(this.getClass().getResource("bn11.png"));
	ImageIcon bn12 = new ImageIcon(this.getClass().getResource("bn12.png"));
	ImageIcon bn13 = new ImageIcon(this.getClass().getResource("bn13.png"));
	ImageIcon bn14 = new ImageIcon(this.getClass().getResource("bn14.png"));
	ImageIcon bn15 = new ImageIcon(this.getClass().getResource("bn15.png"));
	ImageIcon bn16 = new ImageIcon(this.getClass().getResource("bn16.png"));
	ImageIcon bn17 = new ImageIcon(this.getClass().getResource("bn17.png"));
	ImageIcon bn18 = new ImageIcon(this.getClass().getResource("bn18.png"));
	ImageIcon bn19 = new ImageIcon(this.getClass().getResource("bn19.png"));
	ImageIcon bn20 = new ImageIcon(this.getClass().getResource("bn20.png"));
	ImageIcon bn21 = new ImageIcon(this.getClass().getResource("bn21.png"));
	ImageIcon bn22 = new ImageIcon(this.getClass().getResource("bn22.png"));
	ImageIcon bn23 = new ImageIcon(this.getClass().getResource("bn23.png"));
	ImageIcon bn24 = new ImageIcon(this.getClass().getResource("bn24.png"));
	ImageIcon bn25 = new ImageIcon(this.getClass().getResource("bn25.png"));
	ImageIcon bn26 = new ImageIcon(this.getClass().getResource("bn26.png"));
	ImageIcon bn27 = new ImageIcon(this.getClass().getResource("bn27.png"));
	ImageIcon bn28 = new ImageIcon(this.getClass().getResource("bn28.png"));
	ImageIcon bn29 = new ImageIcon(this.getClass().getResource("bn29.png"));
	ImageIcon bn30 = new ImageIcon(this.getClass().getResource("bn30.png"));
	ImageIcon bn31 = new ImageIcon(this.getClass().getResource("bn31.png"));
	ImageIcon bn32 = new ImageIcon(this.getClass().getResource("bn32.png"));
	
	ImageIcon gn1 = new ImageIcon(this.getClass().getResource("gn1.png"));
	ImageIcon gn2 = new ImageIcon(this.getClass().getResource("gn2.png"));
	ImageIcon gn3 = new ImageIcon(this.getClass().getResource("gn3.png"));
	ImageIcon gn4 = new ImageIcon(this.getClass().getResource("gn4.png"));
	ImageIcon gn5 = new ImageIcon(this.getClass().getResource("gn5.png"));
	ImageIcon gn6 = new ImageIcon(this.getClass().getResource("gn6.png"));
	ImageIcon gn7 = new ImageIcon(this.getClass().getResource("gn7.png"));
	ImageIcon gn8 = new ImageIcon(this.getClass().getResource("gn8.png"));
	ImageIcon gn9 = new ImageIcon(this.getClass().getResource("gn9.png"));
	ImageIcon gn10 = new ImageIcon(this.getClass().getResource("gn10.png"));
	ImageIcon gn11 = new ImageIcon(this.getClass().getResource("gn11.png"));
	ImageIcon gn12 = new ImageIcon(this.getClass().getResource("gn12.png"));
	ImageIcon gn13 = new ImageIcon(this.getClass().getResource("gn13.png"));
	ImageIcon gn14 = new ImageIcon(this.getClass().getResource("gn14.png"));
	ImageIcon gn15 = new ImageIcon(this.getClass().getResource("gn15.png"));
	ImageIcon gn16 = new ImageIcon(this.getClass().getResource("gn16.png"));
	ImageIcon gn17 = new ImageIcon(this.getClass().getResource("gn17.png"));
	ImageIcon gn18 = new ImageIcon(this.getClass().getResource("gn18.png"));
	ImageIcon gn19 = new ImageIcon(this.getClass().getResource("gn19.png"));
	ImageIcon gn20 = new ImageIcon(this.getClass().getResource("gn20.png"));
	ImageIcon gn21 = new ImageIcon(this.getClass().getResource("gn21.png"));
	ImageIcon gn22 = new ImageIcon(this.getClass().getResource("gn22.png"));
	ImageIcon gn23 = new ImageIcon(this.getClass().getResource("gn23.png"));
	ImageIcon gn24 = new ImageIcon(this.getClass().getResource("gn24.png"));
	ImageIcon gn25 = new ImageIcon(this.getClass().getResource("gn25.png"));
	ImageIcon gn26 = new ImageIcon(this.getClass().getResource("gn26.png"));
	ImageIcon gn27 = new ImageIcon(this.getClass().getResource("gn27.png"));
	ImageIcon gn28 = new ImageIcon(this.getClass().getResource("gn28.png"));
	ImageIcon gn29 = new ImageIcon(this.getClass().getResource("gn29.png"));
	ImageIcon gn30 = new ImageIcon(this.getClass().getResource("gn30.png"));
	ImageIcon gn31 = new ImageIcon(this.getClass().getResource("gn31.png"));
	ImageIcon gn32 = new ImageIcon(this.getClass().getResource("gn32.png"));
	
	ImageIcon bs1 = new ImageIcon(this.getClass().getResource("bs1.png"));
	ImageIcon gs1 = new ImageIcon(this.getClass().getResource("gs1.png"));
	
	ImageIcon bd1 = new ImageIcon(this.getClass().getResource("bd1.png"));
	ImageIcon gd1 = new ImageIcon(this.getClass().getResource("gd1.png"));
	
	ImageIcon jam = new ImageIcon(this.getClass().getResource("jam.png"));
	
	
	JLabel lgn1,lgn2,lgn3,lgn4,lgn5,lgn6,lgn7,lgn8,lgn9,lgn10,lgn11,lgn12,lgn13,lgn14,lgn15,lgn16,lgn17, 
	 lgn18,lgn19,lgn20,lgn21,lgn22,lgn23,lgn24,lgn25,lgn26,lgn27,lgn28,lgn29,lgn30,lgn31,lgn32; 
	
	JLabel lbn1,lbn2,lbn3,lbn4,lbn5,lbn6,lbn7,lbn8,lbn9,lbn10,lbn11,lbn12,lbn13,lbn14,lbn15,lbn16,lbn17, 
	 lbn18,lbn19,lbn20,lbn21,lbn22,lbn23,lbn24,lbn25,lbn26,lbn27,lbn28,lbn29,lbn30,lbn31,lbn32; 

	JLabel lbs1,lgs1,lbd1,lgd1,ljam;
	
	
	
	
	
	
	
	
	
	
	WirelessRouter()
	{

                 
		
                                           
		jf = new JFrame("WIRELESS ROUTER");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(1000,720);
	
		jf.setResizable(false); 
		//c.setBackground(new Color(100,115,10));
       // c.setBackground(new Color(255, 65, 100));
		
		
		  mbr = new JMenuBar();
		  jf.setJMenuBar(mbr);

			m = new JMenu("Assign Energy");
			mi1 = new JMenuItem("Assign Energy for NW1");
			mi2 = new JMenuItem("Assign Energy for NW2");
			mi3 = new JMenuItem("Assign Energy for NW3 ");
			mi4 = new JMenuItem("Assign Energy for NW4");

			m.add(mi1);
			m.add(mi2);
		    m.add(mi3);
	        m.add(mi4);
	        
	        m1 = new JMenu("View Energy");
	        mi21 = new JMenuItem("View NW1 Energy");
			mi22 = new JMenuItem("View NW2 Energy");
			mi23 = new JMenuItem("View NW3 Energy ");
			mi24 = new JMenuItem("View NW4 Energy");

			m1.add(mi21);
			m1.add(mi22);
		    m1.add(mi23);
	        m1.add(mi24);
	        
		  mbr.add(m);
		  mbr.add(m1);
		
		mi1.addActionListener(this);
		mi2.addActionListener(this);  
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		
		mi21.addActionListener(this);
		mi22.addActionListener(this);  
		mi23.addActionListener(this);
		mi24.addActionListener(this);
	
		jf.show();
		

		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent win) {
				System.exit(0);
			}
		});
		

		lbs1=new JLabel();
		lbs1.setIcon(bs1);
		lbs1.setBounds(-15, -50, 200, 200);
		c.add(lbs1);
		
		lbn1=new JLabel();
		lbn1.setIcon(bn1);
		lbn1.setBounds(100,-20, 200, 200);
		c.add(lbn1);
		
		lbn2=new JLabel();
		lbn2.setIcon(bn2);
		lbn2.setBounds(100,50, 200, 200);
		c.add(lbn2);
		
		lbn3=new JLabel();
		lbn3.setIcon(bn3);
		lbn3.setBounds(170,-70, 200, 200);
		c.add(lbn3);
		
		lbn4=new JLabel();
		lbn4.setIcon(bn4);
		lbn4.setBounds(170,100, 200, 200);
		c.add(lbn4);
		
		lbn5=new JLabel();
		lbn5.setIcon(bn5);
		lbn5.setBounds(240,-70, 200, 200);
		c.add(lbn5);
		
		lbn6=new JLabel();
		lbn6.setIcon(bn6);
		lbn6.setBounds(240,100, 200, 200);
		c.add(lbn6);
		
		lbn7=new JLabel();
		lbn7.setIcon(bn7);
		lbn7.setBounds(300,-20, 200, 200);
		c.add(lbn7);
		
		lbn8=new JLabel();
		lbn8.setIcon(bn8);
		lbn8.setBounds(300,50, 200, 200);
		c.add(lbn8);
		
		lbn9=new JLabel();
		lbn9.setIcon(bn9);
		lbn9.setBounds(220,210, 200, 200);
		c.add(lbn9);
		
		lbn10=new JLabel();
		lbn10.setIcon(bn10);
		lbn10.setBounds(220,280, 200, 200);
		c.add(lbn10);
		
		lbn11=new JLabel();
		lbn11.setIcon(bn11);
		lbn11.setBounds(290,160, 200, 200);
		c.add(lbn11);
		
		lbn12=new JLabel();
		lbn12.setIcon(bn12);
		lbn12.setBounds(290,320, 200, 200);
		c.add(lbn12);
		
		lbn13=new JLabel();
		lbn13.setIcon(bn13);
		lbn13.setBounds(370,160, 200, 200);
		c.add(lbn13);
		
		lbn14=new JLabel();
		lbn14.setIcon(bn14);
		lbn14.setBounds(370,320, 200, 200);
		c.add(lbn14);
		
		lbn15=new JLabel();
		lbn15.setIcon(bn15);
		lbn15.setBounds(430,210, 200, 200);
		c.add(lbn15);
		
		lbn16=new JLabel();
		lbn16.setIcon(bn16);
		lbn16.setBounds(430,280, 200, 200);
		c.add(lbn16);
		
		lbn17=new JLabel();
		lbn17.setIcon(bn17);
		lbn17.setBounds(480,20, 200, 200);
		c.add(lbn17);
		
		lbn18=new JLabel();
		lbn18.setIcon(bn18);
		lbn18.setBounds(480,90, 200, 200);
		c.add(lbn18);
		
		lbn19=new JLabel();
		lbn19.setIcon(bn19);
		lbn19.setBounds(540,-30, 200, 200);
		c.add(lbn19);
		
		lbn20=new JLabel();
		lbn20.setIcon(bn20);
		lbn20.setBounds(540,140, 200, 200);
		c.add(lbn20);
		
		lbn21=new JLabel();
		lbn21.setIcon(bn21);
		lbn21.setBounds(620,-30, 200, 200);
		c.add(lbn21);
		
		lbn22=new JLabel();
		lbn22.setIcon(bn22);
		lbn22.setBounds(620,140, 200, 200);
		c.add(lbn22);
		
		lbn23=new JLabel();
		lbn23.setIcon(bn23);
		lbn23.setBounds(690,20, 200, 200);
		c.add(lbn23);
		
		lbn24=new JLabel();
		lbn24.setIcon(bn24);
		lbn24.setBounds(690,90, 200, 200);
		c.add(lbn24);

		lbn25=new JLabel();
		lbn25.setIcon(bn25);
		lbn25.setBounds(540,380, 200, 200);
		c.add(lbn25);
		
		lbn26=new JLabel();
		lbn26.setIcon(bn26);
		lbn26.setBounds(540,460, 200, 200);
		c.add(lbn26);
		
		lbn27=new JLabel();
		lbn27.setIcon(bn27);
		lbn27.setBounds(600,320, 200, 200);
		c.add(lbn27);
		
		lbn28=new JLabel();
		lbn28.setIcon(bn28);
		lbn28.setBounds(600,510, 200, 200);
		c.add(lbn28);
		
		lbn29=new JLabel();
		lbn29.setIcon(bn29);
		lbn29.setBounds(680,320, 200, 200);
		c.add(lbn29);
		
		lbn30=new JLabel();
		lbn30.setIcon(bn30);
		lbn30.setBounds(680,510, 200, 200);
		c.add(lbn30);
		
		lbn31=new JLabel();
		lbn31.setIcon(bn31);
		lbn31.setBounds(750,380, 200, 200);
		c.add(lbn31);
		
		lbn32=new JLabel();
		lbn32.setIcon(bn32);
		lbn32.setBounds(750,460, 200, 200);
		c.add(lbn32);
		
		lbd1=new JLabel();
		lbd1.setIcon(bd1);
		lbd1.setBounds(850,450, 200, 200);
		c.add(lbd1);
		
		
		int[] ports = new int[] { 4000,2011,2012,2013,2014};

		for (int i = 0; i < 5; i++) {

			Thread t = new Thread(new PortListener(ports[i]));
			t.setName("Listener-" + ports[i]);
			t.start();
		}

	}

	public static void main(String args[])
	{
		//new WirelessRouter();
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new WirelessRouter();
			}
		});

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==mi1)
		{
			try {
				UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new AssignNW1();
				}
			});
		}
		if(e.getSource()==mi2)
		{
			try {
				UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new AssignNW2();
				}
			});
		}
		if(e.getSource()==mi3)
		{
			try {
				UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new AssignNW3();
				}
			});
		}
		if(e.getSource()==mi4)
		{
			try {
				UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new AssignNW4();
				}
			});
		}
		if(e.getSource()==mi21)
		{
			try {
				UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new ViewNW1();
				}
			});
		}
		if(e.getSource()==mi22)
		{
			try {
				UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new ViewNW2();
				}
			});
		}
		if(e.getSource()==mi23)
		{
			try {
				UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new ViewNW3();
				}
			});
		}
		if(e.getSource()==mi24)
		{
			try {
				UIManager
						.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new ViewNW4();
				}
			});
		}


		
	}

	class PortListener implements Runnable
	{
		//TempControlRouter ip1;
		int length=0;
		Timer timer=new Timer(100, null);
		
		
		int Abw,bbw,cbw,dbw,ebw,fbw,gbw,hbw,ibw,jbw,kbw,lbw,mbw,nbw,obw,Pbw;
		int ae,be,ce,de,ee,fe,ge,he,ie,je,ke,le,me,ne,oe,pe;
		int blw,clw,dlw,elw,flw,glw,hlw,ilw,jlw,klw,llw,mlw,nlw,olw,Plw;
		
		int enr1,enr2,enr3,enr4,enr5,enr6,enr7,enr8,enr9,enr10,enr11,enr12,enr13,enr14,enr15,enr16,enr17,enr18,enr19,enr20,enr21,enr22,enr23,enr24,enr25,enr26,enr27,enr28,enr29,enr30,enr31,enr32;
		int dist1,dist2,dist3,dist4,dist5,dist6,dist7,dist8,dist9,dist10,dist11,dist12,dist13,dist14,dist15,dist16,dist17,dist18,dist19,dist20,dist21,dist22,dist23,dist24,dist25,dist26,dist27,dist28,dist29,dist30,dist31,dist32;

		
		int port;

		public PortListener(int port) {
			this.port = port;
		}
		public void run() {
			
			
			
			
			if(this.port==4000)
			{
                    System.out.println("inside of 4000");
				try { 

					ServerSocket sc = new ServerSocket(4000);
					while(true)
					{
						Socket s = sc.accept();
						DataInputStream din = new DataInputStream(s.getInputStream());
						String content = din.readUTF();
						String len = din.readUTF();
						length=Integer.parseInt(len);
						String dest = din.readUTF();
						
	
						DBCon db = new DBCon();
						Connection con = db.getConnection();
						Statement st=con.createStatement();
						String sql="select * from NW1";
						ResultSet rs=st.executeQuery(sql);
						
			while(rs.next()==true)
			{
			 String nname=rs.getString("nodename");
			 
			 if(nname.equals("N1"))
			 {
				 enr1=rs.getInt("energy");
				 dist1=rs.getInt("distance");
				
			 }
			 if(nname.equals("N2"))
			 {
				 enr2=rs.getInt("energy");
				 dist2=rs.getInt("distance");
				
			 }
			 if(nname.equals("N3"))
			 {
				 enr3=rs.getInt("energy");
				 dist3=rs.getInt("distance");
				
			 }
			 if(nname.equals("N4"))
			 {
				 enr4=rs.getInt("energy");
				 dist4=rs.getInt("distance");
				
			 }
			 if(nname.equals("N5"))
			 {
				 enr5=rs.getInt("energy");
				 dist5=rs.getInt("distance");
				
			 }
			 if(nname.equals("N6"))
			 {
				 enr6=rs.getInt("energy");
				 dist6=rs.getInt("distance");
				
			 }
			 if(nname.equals("N7"))
			 {
				 enr7=rs.getInt("energy");
				 dist7=rs.getInt("distance");
				
			 }
			 if(nname.equals("N8"))
			 {
				 enr8=rs.getInt("energy");
				 dist8=rs.getInt("distance");
				
			 }
			 
			 
			}
			Statement st1=con.createStatement();
			String sql1="select * from NW2";
			ResultSet rs1=st1.executeQuery(sql1);
			
while(rs1.next()==true)
{
 String nname=rs1.getString("nodename");
 if(nname.equals("N9"))
 {
	 enr9=rs1.getInt("energy");
	 dist9=rs1.getInt("distance");
	
 }
 if(nname.equals("N10"))
 {
	 enr10=rs1.getInt("energy");
	 dist10=rs1.getInt("distance");
	
 }
 if(nname.equals("N11"))
 {
	 enr11=rs1.getInt("energy");
	 dist11=rs1.getInt("distance");
	
 }
 if(nname.equals("N12"))
 {
	 enr12=rs1.getInt("energy");
	 dist12=rs1.getInt("distance");
	
 }
 if(nname.equals("N13"))
 {
	 enr13=rs1.getInt("energy");
	 dist13=rs1.getInt("distance");
	
 }
 if(nname.equals("N14"))
 {
	 enr14=rs1.getInt("energy");
	 dist14=rs1.getInt("distance");
	
 }
 if(nname.equals("N15"))
 {
	 enr15=rs1.getInt("energy");
	 dist15=rs1.getInt("distance");
	
 }
 if(nname.equals("N16"))
 {
	 enr16=rs1.getInt("energy");
	 dist16=rs1.getInt("distance");
	
 }
 
 
}
			
Statement st2=con.createStatement();
String sql2="select * from NW3";
ResultSet rs2=st2.executeQuery(sql2);

while(rs2.next()==true)
{
String nname=rs2.getString("nodename");
if(nname.equals("N17"))
{
enr17=rs2.getInt("energy");
dist17=rs2.getInt("distance");

}
if(nname.equals("N18"))
{
enr18=rs2.getInt("energy");
dist18=rs2.getInt("distance");

}
if(nname.equals("N19"))
{
enr19=rs2.getInt("energy");
dist19=rs2.getInt("distance");

}
if(nname.equals("N20"))
{
enr20=rs2.getInt("energy");
dist20=rs2.getInt("distance");

}
if(nname.equals("N21"))
{
enr21=rs2.getInt("energy");
dist21=rs2.getInt("distance");

}
if(nname.equals("N22"))
{
enr22=rs2.getInt("energy");
dist22=rs2.getInt("distance");

}
if(nname.equals("N23"))
{
enr23=rs2.getInt("energy");
dist23=rs2.getInt("distance");

}
if(nname.equals("N24"))
{
enr24=rs2.getInt("energy");
dist24=rs2.getInt("distance");

}


}			
			
Statement st3=con.createStatement();
String sql3="select * from NW4";
ResultSet rs3=st3.executeQuery(sql3);

while(rs3.next()==true)
{
String nname=rs3.getString("nodename");
if(nname.equals("N25"))
{
enr25=rs3.getInt("energy");
dist25=rs3.getInt("distance");

}
if(nname.equals("N26"))
{
enr26=rs3.getInt("energy");
dist26=rs3.getInt("distance");

}
if(nname.equals("N27"))
{
enr27=rs3.getInt("energy");
dist27=rs3.getInt("distance");

}
if(nname.equals("N28"))
{
enr28=rs3.getInt("energy");
dist28=rs3.getInt("distance");

}
if(nname.equals("N29"))
{
enr29=rs3.getInt("energy");
dist29=rs3.getInt("distance");

}
if(nname.equals("N30"))
{
enr30=rs3.getInt("energy");
dist30=rs3.getInt("distance");

}
if(nname.equals("N31"))
{
enr31=rs3.getInt("energy");
dist31=rs3.getInt("distance");

}
if(nname.equals("N32"))
{
enr32=rs3.getInt("energy");
dist32=rs3.getInt("distance");

}


}					
			
			long stime=System.currentTimeMillis();
			timer.start();
			Thread.sleep(3000);
			
			
			
		
			if(dist1<dist2)
			{
				if(length<enr1)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n1path="Node1->";
					int len1=enr1-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW1 set energy= '"+len1+"' where nodename='N1' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr1)
				{
					n1jam="Node1->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N1");	
			}
			if(dist1>dist2)
			{
				if(length<enr2)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n2path="Node2->";
					int len1=enr2-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW1 set energy= '"+len1+"' where nodename='N2' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr2)
				{
					n2jam="Node2->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N2");	
			}
			
			
			if(dist3<dist4)
			{
				if(length<enr3)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n3path="Node3->";
					int len1=enr3-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW1 set energy= '"+len1+"' where nodename='N3' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr3)
				{
					n3jam="Node3->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N3");	
			}
			if(dist3>dist4)
			{
				if(length<enr4)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n4path="Node4->";
					int len1=enr4-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW1 set energy= '"+len1+"' where nodename='N4' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr4)
				{
					n4jam="Node4->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N4");	
			}
			
			if(dist5<dist6)
			{
				if(length<enr5)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n5path="Node5->";
					int len1=enr5-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW1 set energy= '"+len1+"' where nodename='N5' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr5)
				{
					n5jam="Node5->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N5");	
			}
			if(dist5>dist6)
			{
				if(length<enr6)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n6path="Node6->";
					int len1=enr6-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW1 set energy= '"+len1+"' where nodename='N6' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr6)
				{
					n6jam="Node6->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N6");	
			}
			
			if(dist7<dist8)
			{
				if(length<enr7)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n7path="Node7->";
					int len1=enr7-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW1 set energy= '"+len1+"' where nodename='N7' ";
					st4.executeUpdate(sql4);
					bound1="Node7->";
					}
			
				if(length>enr7)
				{
					n7jam="Node7->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N7");	
			}
			if(dist7>dist8)
			{
				if(length<enr8)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n8path="Node8->";
					int len1=enr8-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW1 set energy= '"+len1+"' where nodename='N8' ";
					st4.executeUpdate(sql4);
					bound1="Node8->";
					}
			
				if(length>enr8)
				{
					n8jam="Node8->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N8");	
			}
			
			
			if(dist9<dist10)
			{
				if(length<enr9)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n9path="Node9->";
					int len1=enr9-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW2 set energy= '"+len1+"' where nodename='N9' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr9)
				{
					n9jam="Node9->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N9");	
			}
			if(dist9>dist10)
			{
				if(length<enr10)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n10path="Node10->";
					int len1=enr10-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW2 set energy= '"+len1+"' where nodename='N10' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr10)
				{
					n10jam="Node10->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N10");	
			}
			
			if(dist11<dist12)
			{
				if(length<enr11)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n11path="Node11->";
					int len1=enr11-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW2 set energy= '"+len1+"' where nodename='N11' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr11)
				{
					n11jam="Node11->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N11");	
			}
			if(dist11>dist12)
			{
				if(length<enr12)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n12path="Node12->";
					int len1=enr12-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW2 set energy= '"+len1+"' where nodename='N12' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr12)
				{
					n12jam="Node12->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N12");	
			}
			
			if(dist13<dist14)
			{
				if(length<enr13)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n13path="Node13->";
					int len1=enr13-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW2 set energy= '"+len1+"' where nodename='N13' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr13)
				{
					n13jam="Node13->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N13");	
			}
			if(dist13>dist14)
			{
				if(length<enr14)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n14path="Node14->";
					int len1=enr14-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW2 set energy= '"+len1+"' where nodename='N14' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr14)
				{
					n14jam="Node14->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N14");	
			}
			
			if(dist15<dist16)
			{
				if(length<enr15)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n15path="Node15->";
					int len1=enr15-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW2 set energy= '"+len1+"' where nodename='N15' ";
					st4.executeUpdate(sql4);
					bound2="Node15->";
					}
			
				if(length>enr15)
				{
					n15jam="Node15->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N15");	
			}
			if(dist15>dist16)
			{
				if(length<enr16)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n16path="Node16->";
					int len1=enr16-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW2 set energy= '"+len1+"' where nodename='N16' ";
					st4.executeUpdate(sql4);
					bound2="Node16->";
					
					}
			
				if(length>enr16)
				{
					n16jam="Node16->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N16");	
			}
			
			
			if(dist17<dist18)
			{
				if(length<enr17)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n17path="Node17->";
					int len1=enr17-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW3 set energy= '"+len1+"' where nodename='N17' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr17)
				{
					n17jam="Node17->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N17");	
			}
			if(dist17>dist18)
			{
				if(length<enr18)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n18path="Node18->";
					int len1=enr18-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW3 set energy= '"+len1+"' where nodename='N18' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr18)
				{
					n18jam="Node18->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N18");	
			}
			
			if(dist19<dist20)
			{
				if(length<enr19)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n19path="Node19->";
					int len1=enr19-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW3 set energy= '"+len1+"' where nodename='N19' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr19)
				{
					n19jam="Node19->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N19");	
			}
			if(dist19>dist20)
			{
				if(length<enr20)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n20path="Node20->";
					int len1=enr20-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW3 set energy= '"+len1+"' where nodename='N20' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr20)
				{
					n20jam="Node20->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N20");	
			}
			
			if(dist21<dist22)
			{
				if(length<enr21)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n21path="Node21->";
					int len1=enr21-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW3 set energy= '"+len1+"' where nodename='N21' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr21)
				{
					n21jam="Node21->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N21");	
			}
			if(dist21>dist22)
			{
				if(length<enr22)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n22path="Node22->";
					int len1=enr22-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW3 set energy= '"+len1+"' where nodename='N22' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr22)
				{
					n22jam="Node22->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N22");	
			}
			if(dist23<dist24)
			{
				if(length<enr23)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n23path="Node23->";
					int len1=enr23-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW3 set energy= '"+len1+"' where nodename='N23' ";
					st4.executeUpdate(sql4);
					bound3="Node23->";
					
					}
			
				if(length>enr23)
				{
					n23jam="Node23->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N23");	
			}
			if(dist23>dist24)
			{
				if(length<enr24)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n24path="Node24->";
					int len1=enr24-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW3 set energy= '"+len1+"' where nodename='N24' ";
					st4.executeUpdate(sql4);
					bound3="Node24->";
					}
			
				if(length>enr24)
				{
					n24jam="Node24->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N24");	
			}
			
			if(dist25<dist26)
			{
				if(length<enr25)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n25path="Node25->";
					int len1=enr25-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW4 set energy= '"+len1+"' where nodename='N25' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr25)
				{
					n25jam="Node25->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N25");	
			}
			if(dist25>dist26)
			{
				if(length<enr26)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n26path="Node26->";
					int len1=enr26-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW4 set energy= '"+len1+"' where nodename='N26' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr26)
				{
					n26jam="Node26->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N26");	
			}
			
			if(dist27<dist28)
			{
				if(length<enr27)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n27path="Node27->";
					int len1=enr27-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW4 set energy= '"+len1+"' where nodename='N27' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr27)
				{
					n27jam="Node27->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N27");	
			}
			if(dist27>dist28)
			{
				if(length<enr28)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n28path="Node28->";
					int len1=enr28-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW4 set energy= '"+len1+"' where nodename='N28' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr28)
				{
					n28jam="Node28->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N28");	
			}
			
			if(dist29<dist30)
			{
				if(length<enr29)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n29path="Node29->";
					int len1=enr29-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW4 set energy= '"+len1+"' where nodename='N29' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr29)
				{
					n29jam="Node29->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N29");	
			}
			if(dist29>dist30)
			{
				if(length<enr30)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n30path="Node30->";
					int len1=enr30-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW4 set energy= '"+len1+"' where nodename='N30' ";
					st4.executeUpdate(sql4);
					
					}
			
				if(length>enr30)
				{
					n30jam="Node30->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N30");	
			}
			
			if(dist31<dist32)
			{
				if(length<enr31)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n31path="Node31->";
					int len1=enr31-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW4 set energy= '"+len1+"' where nodename='N31' ";
					st4.executeUpdate(sql4);
					bound4="Node31->";
					}
			
				if(length>enr31)
				{
					n31jam="Node31->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N31");	
			}
			if(dist31>dist32)
			{
				if(length<enr32)
				{
					
					
					Thread.sleep(3000);
					image2.setIcon(bgreen);
					image2.setBounds(340,115,120,100);  
					
					n32path="Node32->";
					int len1=enr32-length;
					
					System.out.println("The Current Energy="+len1);
					Statement st4=con.createStatement();
					String sql4="update NW4 set energy= '"+len1+"' where nodename='N32' ";
					st4.executeUpdate(sql4);
					bound4="Node32->";
					}
			
				if(length>enr32)
				{
					n32jam="Node32->";
					Thread.sleep(3000);
					image2.setIcon(bred);
					image2.setBounds(340,115,120,100);  
			
				}
				
				
			System.out.println("Select N32");	
			}
			
			
			
			Thread.sleep(3000);
			ImageIcon dgreen=new ImageIcon(this.getClass().getResource("Green.png"));
			image16.setIcon(dgreen);
			image16.setBounds(780,580,120,100); 
			
			
			
			 
             
            long etime=System.currentTimeMillis();      
            long ttime=etime-stime;      
         /*   Statement st1=con.createStatement();
              	
              	st1.executeUpdate("insert into TTime values('"+ttime+"')");*/
                  
                  
                  String tpath=n1path+n2path+n3path+n4path+n5path+n6path+n7path+n8path+n9path+n10path+n11path+n12path+n13path+n14path+n15path+n16path+
                			n17path+n18path+n19path+n20path+n21path+n22path+n23path+n24path+n25path+n26path+n27path+n28path+n29path+n30path+n31path+n32path;
                  
                  String jpath=n1jam+n2jam+n3jam+n4jam+n5jam+n6jam+n7jam+n8jam+n9jam+n10jam+n11jam+n12jam+n13jam+n14jam+n15jam+n16jam+
                			 n17jam+n18jam+n19jam+n20jam+n21jam+n22jam+n23jam+n24jam+n25jam+n26jam+n27jam+n28jam+n29jam+n30jam+n31jam+n32jam;
                  
                  String bpath=bound1+bound2+bound3+bound4;
                  
                 
                      
                      
                  if(dest.equalsIgnoreCase("A"))   
                  {
                	  Socket s3=new Socket("localhost",101);
                      DataOutputStream dout=new DataOutputStream(s3.getOutputStream());
                          dout.writeUTF(content);
                          dout.writeUTF("Routing Path"+tpath);
                          DataInputStream dis = new DataInputStream(s3.getInputStream());
  						String message = dis.readUTF();
  						 DataOutputStream dout1=new DataOutputStream(s.getOutputStream());
                         dout1.writeUTF(message+"By A");
                  }
                  if(dest.equalsIgnoreCase("B"))   
                  {
                	  Socket s3=new Socket("localhost",102);
                      DataOutputStream dout=new DataOutputStream(s3.getOutputStream());
                          dout.writeUTF(content);
                          dout.writeUTF("Routing Path"+tpath);
                          DataInputStream dis = new DataInputStream(s3.getInputStream());
  						String message = dis.readUTF();
  						 DataOutputStream dout1=new DataOutputStream(s.getOutputStream());
                         dout1.writeUTF(message+"By B");
                  }
                  if(dest.equalsIgnoreCase("C"))   
                  {
                	  Socket s3=new Socket("localhost",103);
                      DataOutputStream dout=new DataOutputStream(s3.getOutputStream());
                          dout.writeUTF(content);
                          dout.writeUTF("Routing Path"+tpath);
                          DataInputStream dis = new DataInputStream(s3.getInputStream());
  						String message = dis.readUTF();
  						 DataOutputStream dout1=new DataOutputStream(s.getOutputStream());
                         dout1.writeUTF(message+"By C");
                  }
                  if(dest.equalsIgnoreCase("D"))   
                  {
                	  Socket s3=new Socket("localhost",104);
                      DataOutputStream dout=new DataOutputStream(s3.getOutputStream());
                          dout.writeUTF(content);
                          dout.writeUTF("Routing Path"+tpath);
                          DataInputStream dis = new DataInputStream(s3.getInputStream());
  						String message = dis.readUTF();
  						 DataOutputStream dout1=new DataOutputStream(s.getOutputStream());
                         dout1.writeUTF(message+"By D");
                  }
                  if(dest.equalsIgnoreCase("E"))   
                  {
                	  Socket s3=new Socket("localhost",105);
                      DataOutputStream dout=new DataOutputStream(s3.getOutputStream());
                          dout.writeUTF(content);
                          dout.writeUTF("Routing Path"+tpath);
                          DataInputStream dis = new DataInputStream(s3.getInputStream());
  						String message = dis.readUTF();
  						 DataOutputStream dout1=new DataOutputStream(s.getOutputStream());
                         dout1.writeUTF(message+"By E");
                  }
                  if(dest.equalsIgnoreCase("F"))   
                  {
                	  Socket s3=new Socket("localhost",106);
                      DataOutputStream dout=new DataOutputStream(s3.getOutputStream());
                          dout.writeUTF(content);
                          dout.writeUTF("Routing Path"+tpath);
                          DataInputStream dis = new DataInputStream(s3.getInputStream());
  						String message = dis.readUTF();
  						 DataOutputStream dout1=new DataOutputStream(s.getOutputStream());
                         dout1.writeUTF(message+"By F");
                  }
                      
                  
                  JOptionPane.showMessageDialog(null, "Selected Neighbour Sensor Nodes ="+tpath);
                  JOptionPane.showMessageDialog(null, "Selected Jammed Sensor Nodes ="+jpath);
                  JOptionPane.showMessageDialog(null, "Selected Boundary Sensor Nodes ="+bpath);
                  JOptionPane.showMessageDialog(null, "Total Time Delay="+ttime);
                  
                  
              
                                             
					}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		
		
         
	}
	
			if(this.port==2011)
			{
				try
				{
					
					ServerSocket sc = new ServerSocket(2011);
					
					while(true)
					{
						Socket s = sc.accept();
						DataInputStream din = new DataInputStream(s.getInputStream());
						
						String energy = din.readUTF();
						String dist = din.readUTF();
						String ntype = din.readUTF();
					
						DBCon db = new DBCon();
						 Connection con = db.getConnection();
						 Statement stmt = con.createStatement();
						 String sql1 = "update NW1 set energy='"+energy+"',distance='"+dist+"' where nodename='"+ntype+"'";
						 stmt.executeUpdate(sql1);
						
						
						DataOutputStream don = new DataOutputStream(s.getOutputStream());
						 don.writeUTF("SUCCESS");
						
						
					}
					
				}catch(Exception es ){System.out.println(es);}
			}
			
			if(this.port==2012)
			{
				try
				{
					
					ServerSocket sc = new ServerSocket(2012);
					
					while(true)
					{
						Socket s = sc.accept();
						DataInputStream din = new DataInputStream(s.getInputStream());
						
						String energy = din.readUTF();
						String dist = din.readUTF();
						String ntype = din.readUTF();
					
						DBCon db = new DBCon();
						 Connection con = db.getConnection();
						 Statement stmt = con.createStatement();
						 String sql1 = "update NW2 set energy='"+energy+"',distance='"+dist+"' where nodename='"+ntype+"'";
						 stmt.executeUpdate(sql1);
						
						
						DataOutputStream don = new DataOutputStream(s.getOutputStream());
						 don.writeUTF("SUCCESS");
						
						
					}
					
				}catch(Exception es ){System.out.println(es);}
			}
			if(this.port==2013)
			{
				try
				{
					
					ServerSocket sc = new ServerSocket(2013);
					
					while(true)
					{
						Socket s = sc.accept();
						DataInputStream din = new DataInputStream(s.getInputStream());
						
						String energy = din.readUTF();
						String dist = din.readUTF();
						String ntype = din.readUTF();
					
						DBCon db = new DBCon();
						 Connection con = db.getConnection();
						 Statement stmt = con.createStatement();
						 String sql1 = "update NW3 set energy='"+energy+"',distance='"+dist+"' where nodename='"+ntype+"'";
						 stmt.executeUpdate(sql1);
						
						
						DataOutputStream don = new DataOutputStream(s.getOutputStream());
						 don.writeUTF("SUCCESS");
						
						
					}
					
				}catch(Exception es ){System.out.println(es);}
			}
			if(this.port==2014)
			{
				try
				{
					
					ServerSocket sc = new ServerSocket(2014);
					
					while(true)
					{
						Socket s = sc.accept();
						DataInputStream din = new DataInputStream(s.getInputStream());
						
						String energy = din.readUTF();
						String dist = din.readUTF();
						String ntype = din.readUTF();
					
						DBCon db = new DBCon();
						 Connection con = db.getConnection();
						 Statement stmt = con.createStatement();
						 String sql1 = "update NW4 set energy='"+energy+"',distance='"+dist+"' where nodename='"+ntype+"'";
						 stmt.executeUpdate(sql1);
						
						
						DataOutputStream don = new DataOutputStream(s.getOutputStream());
						 don.writeUTF("SUCCESS");
						
						
					}
					
				}catch(Exception es ){System.out.println(es);}
			}	
		
		
		
		
	}

}

}

	