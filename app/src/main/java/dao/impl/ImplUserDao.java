package dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import dao.UserDao;
import util.DataBase;

public class ImplUserDao implements UserDao {

	@Override
	public boolean addRemainderById(String userId, int remainder) {
		Connection connection=DataBase.getConnection();
		if(connection==null)
			return false;
		try {
			Statement stmt=connection.createStatement();
			String sql="update user set remainder=remainder+"+remainder+" where userId='"+userId+"';";
			boolean res=stmt.executeUpdate(sql)>0;
			stmt.close();
			connection.close();
			return res;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return false;
	}

}
