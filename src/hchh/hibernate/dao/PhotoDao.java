package hchh.hibernate.dao;

import hchh.hibernate.entity.Photo;

import java.util.List;

public interface PhotoDao {
  //保存一个图片信息
	public void savePhoto(Photo photo);
  //通过信息流Id查询所有图片
	public List<Photo> findByInformationId(int informationId);
  //删除一个照片信息
	public void delPhoto(Photo photo);
  //通过id查询Photo
	public Photo findById(int photoId);
}
