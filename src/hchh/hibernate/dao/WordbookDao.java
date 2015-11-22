package hchh.hibernate.dao;

import hchh.hibernate.entity.Wordbook;

import java.util.List;

public interface WordbookDao {
  //保存一个信息
	public void saveWordbook(Wordbook wb);
  //通过leixing,name,activityId查询
	public Wordbook findByLNA(String leixing,String name,int activityId);
  //通过activityId查询
	public List<Wordbook> findByActivityId(int activityId,String leixing);
}
