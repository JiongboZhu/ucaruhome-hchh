package hchh.hibernate.dao;

import hchh.hibernate.entity.LabelPhoto;

import java.util.List;

public interface LabelPhotoDao {
	 //通过图片id,标签类型来查询标签
	public List<LabelPhoto> findByIdAndTypet(int photoId,int labelTypet);
	//通过图片id，标签类型来查询--一个图片的所有普通标签labelTypet=0
	public List<LabelPhoto> findByIdAndTypet1(int photoId,int labelTypet);
	//保存
	public void saveLabelPhoto(LabelPhoto lp);
	//根据photoId,labelId查询
	public List<LabelPhoto> findByPhotoIdAndLabelId(int photoId,int labelId);
	//通过id查询
	public LabelPhoto findById(int id);
	//删除
	public void delLabelPhoto(LabelPhoto lp);
	//通过photoId查询
	public List<LabelPhoto> findByPhotoId(int photoId);
	//通过标签查询所有的photo个数
	public int findPhotosCountByLabelId(int labelId);
	//通过标签对photo分页查询
	public List<LabelPhoto> findPhotosByLabelId(int labelId,int count,int nowPage,int maxPage,int maxPageCount);
	
}
