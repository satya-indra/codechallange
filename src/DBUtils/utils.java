package DBUtils;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class utils 
{
	public static Properties pro;

  public static Connection getConnection () throws Exception
  {
	  pro=new Properties();
	  pro.load(new FileInputStream("config.properties"));
	  Class.forName(pro.getProperty("DRIVER"));
      return DriverManager.getConnection(pro.getProperty("URL"), pro.getProperty("USER"), pro.getProperty("PASSWORD"));	
  }
}
