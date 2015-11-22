package hchh.hibernate.dao;

import hchh.hibernate.entity.Activity;

public interface ActivityDao {
  //保存一个活动信息信息
	public void saveActivity(Activity activity);
  //通过id查询
	public Activity findById(int activityId);
  //通过designerId查询
	public Activity findByDesignerId(int DesignerId);
  //通过supplierId查询
	public Activity findBySupplierId(int SupplierId);
  //通过DistributorId查询
	public Activity findByDistributorId(int DistributorId);
  
}
