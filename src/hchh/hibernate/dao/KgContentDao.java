package hchh.hibernate.dao;

import hchh.hibernate.entity.KgContent;

import java.util.List;

public interface KgContentDao {
    //保存一天记录
	public void saveKgContent(KgContent kgc);
	//通过labelId,photoId查询
	public List<KgContent> findByLabelIdAndPhotoId(int labelId,int photoId);
	//删除一条记录
	public void delKgContent(KgContent kgc);
	//通过id查询
	public KgContent findById(int id);
	//通过photoId查询
	public List<KgContent> findByPhotoId(int photoId);
}
