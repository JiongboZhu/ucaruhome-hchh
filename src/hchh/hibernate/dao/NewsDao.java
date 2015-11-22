package hchh.hibernate.dao;

import hchh.hibernate.entity.News;

import java.util.List;

public interface NewsDao {
    //查询所有的news
	public List<News> findNewsAll();
	//保存更新一个news信息
	public void saveNews(News news);
	//删除一个news信息
	public void delNews(News news);
	//通过id查询
	public News findById(int id);
	//分页查询
	public int findAllCount();
	public List<News> findAll(int count,int nowPage,int maxPage,int maxPageCount);
 }
