package Genericlibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DatabaseLibrary {
Driver driverRef;
Connection conn;

/**
 * 
 * @throws SQLException
 */
public void connectionToDB() throws SQLException {
	driverRef=new Driver();
	DriverManager.registerDriver(driverRef);
	conn=DriverManager.getConnection(IConstant.dbURL,IConstant.dbUserName,IConstant.dbPassword);
	
}
/**
 * 
 * @throws SQLException
 */
public void closeDB() throws SQLException {
	conn.close();
}
/**
 * 
 * @param query
 * @param columIndex
 * @param expData
 * @return
 * @throws SQLException
 */
public String  readDataFromDBAndValidate(String query,int columIndex,String expData) throws SQLException {
	boolean flag=false;
	ResultSet result = conn.createStatement().executeQuery(query);
	while(result.next()) {
		if(result.getString(columIndex).equalsIgnoreCase(expData)) {
			flag=true;
			break;
		}
	}
	if(flag) {
		System.out.println("data verified");
		return expData;
	}
	else
	{
		System.out.println("data not verified");
		return "";
	}
}
}

