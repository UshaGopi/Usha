package com.training.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.training.bean.DBBean;

public class GetConnection {
	static Connection connection; 
	public PreparedStatement ps1, ps2,ps3,ps4,ps5,ps6,ps7; 
	public ResultSet rs1, rs2,rs3,rs4,rs5,rs6,rs7; 
	
	public static Connection getMySqlConnection(DBBean dbBean) {
		
		try {
			// load 
			Class.forName(dbBean.getDriver());
			connection = DriverManager.getConnection(dbBean.getUrl(),
					dbBean.getUserName(), dbBean.getPassword());
			
			return connection; 
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
		return null;
	}
	
	public static Connection getOracleConnection(DBBean dbBean) {
		return null;
	}
}
