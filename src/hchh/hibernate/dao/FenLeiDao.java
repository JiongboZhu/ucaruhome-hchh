package hchh.hibernate.dao;

import hchh.hibernate.entity.FenLei;

import java.util.List;

public interface FenLeiDao {

	//读取大的分类list
	public List<FenLei> findAll();
	//通过id查询
	public FenLei findById(int id);
}
