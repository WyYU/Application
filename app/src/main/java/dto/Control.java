package dto;

import java.util.List;

import vo.RecordVo;

public interface Control {
	
	public List<RecordVo> getRecord();
	
	public boolean addRemainder(String userId, int remainder);

}
