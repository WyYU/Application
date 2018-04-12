package dao.impl;

import android.util.Log;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import dao.RecordDao;
import util.DataBase;
import vo.RecordVo;

public class ImplRecordDao implements RecordDao {

	@Override
	public List<RecordVo> queryAllRecord() {
		Connection connection=DataBase.getConnection();
		Log.d("jiba", String.valueOf(connection==null));
		if(connection==null)
			return null;
		try {
			Statement stmt=connection.createStatement();
			String sql="SELECT `user`.userId,`user`.name,`user`.group,record.time from user,record where `user`.userId=record.userId;";
			ResultSet res=stmt.executeQuery(sql);
			List<RecordVo> record=toList(res);
			Log.d("wangyuanyujiba", String.valueOf(record==null));
			stmt.close();
			connection.close();
			return record;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private List<RecordVo> toList(ResultSet res) {

		List<RecordVo> list=new LinkedList<RecordVo>();
		try {
			while(res.next()){
				RecordVo pa=new RecordVo();
				pa.setClassName(res.getString("group"));
				pa.setUserId(res.getString("userId"));
				pa.setUserName(res.getString("name"));
				pa.setTimestamp(res.getTimestamp("time").getTime());
				list.add(pa);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
