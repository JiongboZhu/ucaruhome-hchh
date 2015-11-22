package hchh.hibernate.dao;

import hchh.hibernate.entity.Quanwudingzhi;

import java.util.List;

public interface QuanwudingzhiDao {
  //分页查询
	public int findQuanwudingzhiAllCount();
	public List<Quanwudingzhi> findQuanwudingzhiAll(int count,int nowPage,int maxPage,int maxPageCount);
}
