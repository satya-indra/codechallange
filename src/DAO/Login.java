package DAO;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.sunbeam.functionality;

import DBUtils.utils;

public class Login implements Closeable
{
  private Connection connection;
  private PreparedStatement statement;
  
  public Login() throws Exception {
	  this.connection=utils.getConnection();
	  this.statement=this.connection.prepareStatement("select role from users where name = ? and password = ?");
  }

  public void select(String uname,String password)throws Exception
	{
	   functionality fun = new functionality();
	   String role=null;
	    this.statement.setString(1,uname );
	    this.statement.setString(2,password);
		this.statement.execute();
		try(ResultSet rs=this.statement.getResultSet())
		{
			while(rs.next()) {
		     role = rs.getString(1);
			}
			fun.setRole(role);
			fun.functions();
		}
		
	}
 
@Override
public void close() throws IOException {
  try {
	statement.close();
	connection.close();
} catch (SQLException cause) {
    throw new IOException(cause);
}
  
}
}
