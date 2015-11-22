package hchh.hibernate.dao;

import hchh.hibernate.entity.Distributor;

import java.util.List;

public interface DistributorDao {
   //保存一天设计师记录
	public void saveDistributor(Distributor distributor);
   //查询设计师里除了取消认证以外的该用户下的所有设计师认证state!=4
	public List<Distributor> findByUserIdYQX(int userId);
   //根据用户id和状态查询
	public List<Distributor> findByUserIdAndState(int userId,int state);
	//通过userId查询
	public Distributor findByUserId(int userId);
}
