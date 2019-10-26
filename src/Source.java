import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class Source implements ActionListener
{		
	byte[] b;
	String dd;
	String txtstr=null;
    
	String filename;
	String content,path1;
	public Font f = new Font("Verdana" , Font.BOLD , 22);	
	public Font f1 = new Font("Times new roman", Font.BOLD , 15);
	public Font f2 = new Font("Arial", Font.BOLD , 12);
	public Font f3 = new Font("Times new roman", Font.BOLD , 16);
	public JLabel T0= new JLabel();

	public JLabel confirm=new JLabel();
	
	public JLabel T2= new JLabel("File's Path");
	
	public JLabel T4= new JLabel();
	
	
	public JButton btn = new JButton("Send");
	public JTextArea tf = new JTextArea();
	public JScrollPane pane = new JScrollPane();
	public JButton btn1 = new JButton("Open");
	
 	
	public JTextField txt=new JTextField();
	public JTextField txt1=new JTextField();
	public JTextField txt2=new JTextField();
	 
		public JLabel  leftButton;
		
		JLabel back= new JLabel();
	public JFrame jf;
	public Container c;
	String event;

	String send,event1,event2;
	
	ImageIcon greengr = new ImageIcon(this.getClass().getResource("ServiceProvider.png"));
	Source()
	{	
		
		jf = new JFrame("Source::Energy Efficient Link-Delay Aware Routingz in Wireless Sensor Networks");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(900,600);
		jf.setResizable(false);  
		c.setBackground(Color.WHITE);
		Border b11=BorderFactory.createLineBorder(Color.RED,5);
		TitledBorder b22=new TitledBorder(b11);
		b22.setTitle("File Transfering");
		b22.setTitleColor(Color.blue);
		b22.setTitleFont(f2);
		JLabel bord =new JLabel();
		bord.setBorder(b22);
		bord.setBackground(Color.black);
		bord.setBounds(10,140,500,350);
		c.add(bord);
		
		ImageIcon banner = new ImageIcon(this.getClass().getResource("spbanner.png"));
		 JLabel title = new JLabel();
		 title.setIcon(banner);
		 title.setBounds(520, 150, 500,350);
		 
		
		
		T0.setBounds(10,0,900,120);
	    T0.setIcon(greengr);
	   
	    T0.setForeground(Color.CYAN);
		T2.setBounds(20, 190, 250,45);
		T2.setFont(f2);
		T2.setForeground(Color.blue);
		
		
		txt1.setBounds(105, 200, 300,25);
		txt1.setForeground(Color.MAGENTA);
	    txt1.setFont(f1);

		T4.setBounds(225, 540, 250,45);
		T4.setFont(f2);
		T4.setForeground(Color.RED);
		
		
		txt2.setBounds(220, 595, 250,30);
		txt2.setForeground(Color.BLUE);
	    txt2.setFont(f1);
	   confirm.setBounds(445, 520, 250,45);
	    
	    confirm.setForeground(new Color(255,0,0));

		btn.setBounds(180,430,120,30);
	//	btn.setFont(f3);
		
		btn1.setBounds(420,198,70,25);
		
		txt.setBounds(260,150,180,25);
		txt.setForeground(Color.BLUE);
		txt.setFont(f3);
		
		pane.setBounds(105, 250, 300, 150);
		
		tf.setColumns(20);
		
		tf.setForeground(Color.MAGENTA);
		tf.setFont(f1);
		tf.setRows(10);
		tf.setName("tf");
		pane.setName("pane");
		pane.setViewportView(tf);
		
		btn1.addActionListener(this);
		btn.addActionListener(this);
		
		
		 txt2.setEnabled(false);
		
		jf.show();
	 	
	 	c.add(txt1);
	 
		c.add(btn);
		
		c.add(confirm);
		c.add(T2);
		//c.add(T3);
		c.add(T4);
		//c.add(T5);
		c.add(pane, BorderLayout.CENTER);
		c.add(btn1);
		c.add(T0);
		c.add(title);
		
		
		
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent win) {
				System.exit(0);
			}
		});
		
	
		
	}		
	
	

	

		public void actionPerformed(ActionEvent e)
		 {		
		    	DataInputStream input;

		    	BufferedInputStream bis;
		    	BufferedOutputStream bos = null;
		    	BufferedWriter writer = null;
		    	int in;
		    	String str="MobileTerminal,Foriegn Agent  A,Gateway FA  A";
		    	byte[] byteArray=str.getBytes();
		    	StringBuffer buffer = new StringBuffer();
		    			    			 
			    String strLine = null;
			    String newline = "\n";
			    
			    
			    
			    if (e.getSource() == btn1) {

					

					JFileChooser chooser = new JFileChooser();

					try {

						File f = new File(new File("filename.txt").getCanonicalPath());

						chooser.setSelectedFile(f);
					} catch (IOException e1) {
					}

					chooser.showOpenDialog(btn1);
					int retval = chooser.showOpenDialog(btn1);
					if (retval == JFileChooser.APPROVE_OPTION) {
						File field = chooser.getSelectedFile();
						 path1=field.getAbsolutePath();
						 txt1.setText(path1);
						 filename = field.getName();
					}
					File curFile = chooser.getSelectedFile();

					try {
						
						FileInputStream fstream = new FileInputStream(curFile);
						b = new byte[fstream.available()];
						fstream.read(b);
						 content = new String(b);
						tf.setText(content);
						System.out.println(content);
					
						
							PrintStream p = new PrintStream(new FileOutputStream("Source/"+filename));
							p.print(new String(content));
							
				
						

					} catch (Exception e1) {
						System.err.println("Error: " + e1.getMessage());
					}

				}
			    
			 if(e.getSource()== btn)
			 {
				 				
			
				    
					try {
						
						String[] dsname = { "Select Destination", "A", "B", "C", "D", "E", "F" };
						
						String dataname = (String) JOptionPane.showInputDialog(null,
								"Select Destination", "Destination Name",
								JOptionPane.QUESTION_MESSAGE, null,  dsname,  dsname[0]);
					 
						String ip = JOptionPane.showInputDialog(null,
								"Please Enter the IP Address Of Router");

                             
                             Socket sc1 = new Socket(ip,4000);
            				 DataOutputStream dout1 = new DataOutputStream(sc1.getOutputStream());
            				 dout1.writeUTF(content);
            				 dout1.writeUTF(Integer.toString(content.length()));
            				 dout1.writeUTF(dataname);
            				 dout1.writeUTF(filename);
            				 DataInputStream din1 = new DataInputStream(sc1.getInputStream());
            				 String msg1 = din1.readUTF();
            				
            					 JOptionPane.showMessageDialog(null, msg1);
            					 
            				 

					} catch (UnknownHostException e1) {
						
						e1.printStackTrace();
					} catch (Exception e1) {}
						
					finally {
						
					}
			 
				 	
			 }
	
			 
			 }
		
	public static void main(String args[])
	{
		//new ServiceProvider();
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Source();
			}
		});
	}
}
	
	
	

		


