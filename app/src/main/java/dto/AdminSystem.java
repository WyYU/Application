package dto;

import android.nfc.Tag;
import android.util.Log;

import java.util.List;

import dao.RecordDao;
import dao.UserDao;
import dao.impl.ImplRecordDao;
import dao.impl.ImplUserDao;
import vo.RecordVo;

public class AdminSystem implements Control{

	private RecordDao recordDao;
	private UserDao userDao;
	public AdminSystem() {
		System.out.println("zhentemashabi");
		recordDao=new ImplRecordDao();
		userDao=new ImplUserDao();
	}
	@Override
	public List<RecordVo> getRecord() {
		return recordDao.queryAllRecord();
	}

	@Override
	public boolean addRemainder(String userId, int remainder) {
		// TODO Auto-generated method stub
		return userDao.addRemainderById(userId, remainder);
	}

}
