package vo;


public class RecordVo {
	
	private String userId;
	private long timestamp;
	private String className;
	private String userName;

	public RecordVo(String userId, long timestamp, String className, String userName) {
		this.userId = userId;
		this.timestamp = timestamp;
		this.className = className;
		this.userName = userName;
	}

	public RecordVo() {
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
