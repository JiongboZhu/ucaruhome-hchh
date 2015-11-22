package hchh.hibernate.dao;

import hchh.hibernate.entity.Supplier;

import java.util.List;

public interface SupplierDao {
   //保存一天供应商记录
	public void saveSupplier(Supplier supplier);
   //查询供应商里除了取消认证以外的该用户下的所有供应商认证state!=4
	public List<Supplier> findByUserIdYQX(int userId);
   //根据用户id和状态查询
	public List<Supplier> findByUserIdAndState(int userId,int state);
	//通过userId查询
	public Supplier findByUserId(int userId);
}
