
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import java.sql.*;
 
public class Time_Delay_Results {
    public static void main(String[] args) {
        
  int count=0;
  int count1=0;
  double c1=0.0;
  double c2=0.0;
  double c3=0.0;
  double c4=0.0;
  double c5=0.0;
  double c6=0.0;
  double c7=0.0;
  double c8=0.0;
  
  String fname=null,fname1=null,fname2=null,fname3=null,fname4=null,fname5=null,fname6=null,fname7=null;
  
    	try
    	{
    		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        	Connection con = DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};Dbq=src\\Database.mdb");
    		Statement st=con.createStatement();
    		ResultSet rs=st.executeQuery("select * from Results");
    		
    		while(rs.next()==true)
    		{
    			count++;
    			if(count==1)
    			{
    				fname=rs.getString("fname");
    				c1=Double.valueOf(rs.getString("tdelay"));
    				
    			}
    			
    			if(count==2)
    			{
    				fname1=rs.getString("fname");
    				c2=Double.valueOf(rs.getString("tdelay"));
    			}
    			if(count==3)
    			{
    				
    				fname2=rs.getString("fname");
    				c3=Double.valueOf(rs.getString("tdelay"));
    			}
    			if(count==4)
    			{
    				fname3=rs.getString("fname");
    				c4=Double.valueOf(rs.getString("tdelay"));
    			}
    			if(count==5)
    			{
    				fname4=rs.getString("fname");
    				c5=Double.valueOf(rs.getString("tdelay"));
    			}
    			if(count==6)
    			{
    				fname5=rs.getString("fname");
    				c6=Double.valueOf(rs.getString("tdelay"));
    			}
    			if(count==7)
    			{
    				fname6=rs.getString("fname");
    				c7=Double.valueOf(rs.getString("tdelay"));
    			}
    			if(count==8)
    			{	fname7=rs.getString("fname");
    				c8=Double.valueOf(rs.getString("tdelay"));
    			}	
    		}
    		    DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
    	        dataSet.setValue(c1, "TD1", String.valueOf(fname));
    	        dataSet.setValue(c2, "TD2", String.valueOf(fname1));
    	        dataSet.setValue(c3, "TD3", String.valueOf(fname2));
    	        dataSet.setValue(c4, "TD4", String.valueOf(fname3));
    	        dataSet.setValue(c5, "TD5", String.valueOf(fname4));
    	        dataSet.setValue(c6, "TD6", String.valueOf(fname5));
    	        dataSet.setValue(c7, "TD7", String.valueOf(fname6));
    	        dataSet.setValue(c8, "TD8", String.valueOf(fname7));
    	 
    	        JFreeChart chart = ChartFactory.createBarChart3D("Energy Efficient Link-Delay Aware Routingz in Wireless Sensor Networks", "Time Dealy(Kbps) ", "Total Time Dealy (Kbps)",
    	                dataSet, PlotOrientation.VERTICAL, true, true, true);
    	        ChartFrame chartFrame=new ChartFrame("Different Transaction Upload Time Delay Details",chart);
    	        chartFrame.setVisible(true);
    	        chartFrame.setSize(1000,500);
    	}
    	catch(Exception ex)
    	{
    	System.out.println(ex);	
    		
    	}
    
}
}