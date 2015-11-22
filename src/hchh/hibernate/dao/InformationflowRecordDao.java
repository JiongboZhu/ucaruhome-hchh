package hchh.hibernate.dao;

import hchh.hibernate.entity.InformationflowRecord;

import java.util.List;

public interface InformationflowRecordDao {
 //保存一条操作记录
	public void saveInformationflowRecord(InformationflowRecord ifr);
 //根据信息流的id查询
	public List<InformationflowRecord> findByInformationflowId(int informationflowId);
 //删除
	public void delInformationflowRecord(InformationflowRecord ifr);
}
