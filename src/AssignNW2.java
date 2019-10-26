import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class AssignNW2 implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JLabel b1,b2,b3,b4,b5;
	JButton submit,reset;
	JTextField t1,t2,t4,t5;
	JPasswordField t3;
	JLabel lab1;
	JComboBox cb;
	
	public AssignNW2() 
	{
		frame = new JFrame("Energy Assigning for NW2");
		panel = new JPanel();
		panel.setLayout(null);
		
		b1 = new JLabel("Enter the Energy");
		b1.setBounds(50, 12, 100, 100);
		b2 = new JLabel("Enter the Distance");
		b2.setBounds(50, 70, 120, 120);
		b3 = new JLabel("Select the Node");
		b3.setBounds(50, 150, 100, 100);
	
		
		t1 = new JTextField();
		t1.setBounds(180, 50, 150, 30);
		t2 = new JTextField();
		t2.setBounds(180, 120, 150, 30);
	
		submit = new JButton("Assign");
		submit.setBounds(50, 270, 100, 30);
		
		reset = new JButton("Reset");
		reset.setBounds(220, 270, 80, 30);
		
		submit.addActionListener(this);
		reset.addActionListener(this);
	
		cb=new JComboBox();
		
		
		cb.addItem("N9");
		cb.addItem("N10");
		cb.addItem("N11");
		cb.addItem("N12");
		cb.addItem("N13");
		cb.addItem("N14");
		cb.addItem("N15");
		cb.addItem("N16");
		
		cb.setBounds(180, 190, 150, 30);
		cb.addActionListener(this);
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		
		panel.add(t1);
		panel.add(t2);
	
		panel.add(submit);
		panel.add(reset);
	
		panel.add(cb);
		panel.setBackground(Color.white);
		frame.add(panel);
		
		frame.setSize(380, 350);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	public static void main(String[] args) 
		{
			new AssignNW2();
		}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
		if(e.getSource()==submit)
		{
			String energy = t1.getText();
			String dist = t2.getText();
			
			String ntype = (String)cb.getSelectedItem();
			System.out.println("NType= "+ntype);
			
			try{
				Socket skt = new Socket("localhost",2012);
	
				 DataOutputStream dos = new DataOutputStream(skt.getOutputStream());
				 dos.writeUTF(energy);
				 dos.writeUTF(dist);
				 dos.writeUTF(ntype);
				 
				
				 
				 DataInputStream dis=new DataInputStream(skt.getInputStream());
				 String status=dis.readUTF();
				 
				 if(status.equals("SUCCESS"))
				 {
					 JOptionPane.showMessageDialog(null, "Assigning Energy Successfull for "+ntype);
					 frame.dispose();
				 }
				 
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			
			 t1.setText("");
			 t2.setText("");
			
			
		}
		if(e.getSource()==reset)
		{
			t1.setText("");
			t2.setText("");
			
		}
	}
	
}
