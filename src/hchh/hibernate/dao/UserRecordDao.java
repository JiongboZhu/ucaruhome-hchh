package hchh.hibernate.dao;

import hchh.hibernate.entity.UserRecord;

public interface UserRecordDao {
 //保存一条记录
	public void saveUserRecord(UserRecord ur);
 //删除一条记录
	public void delUserRecord(UserRecord ur);
}
