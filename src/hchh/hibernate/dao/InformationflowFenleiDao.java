package hchh.hibernate.dao;

import hchh.hibernate.entity.InformationflowFenlei;

import java.util.List;

public interface InformationflowFenleiDao {

	//通过information查询
	public List<InformationflowFenlei> findByInformationflowId(int informationflowId);
	//通过informationflowId,fenleiId查询InformationflowFenlei
	public List<InformationflowFenlei> findByinformationflowIdAndfenleiId(int informationflowId,int fenleiId);
	//保存更新一条InformationflowFenlei信息
	public void saveInformationflowFenlei(InformationflowFenlei ff);
	//通过informtionFlowId，fenleiId删除
	public void delInformationflowFenlei(InformationflowFenlei ff);
	
}
