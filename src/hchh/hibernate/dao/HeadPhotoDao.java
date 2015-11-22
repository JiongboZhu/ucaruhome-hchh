package hchh.hibernate.dao;

import hchh.hibernate.entity.Headphoto;

import java.util.List;

public interface HeadPhotoDao {
        //保存一个上传的图片信息
	    public void saveOrUpdateHeadPhoto(Headphoto hp);
	    //通过id查询Headphoto
	    public Headphoto findByID(int photoId);
	    //通过userId，headPhotoState查询
	    public List<Headphoto> findByUseridAndHeadphotostate(int userId,int headPhotoState);
	  //通过userId查询
	    public List<Headphoto> findByUserid(int userId);
}
