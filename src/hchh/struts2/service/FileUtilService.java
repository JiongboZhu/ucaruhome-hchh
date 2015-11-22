package hchh.struts2.service;

import hchh.hibernate.entity.Label;
import hchh.hibernate.entity.News;
import hchh.hibernate.entity.Photo;
import hchh.hibernate.entity.User;

import java.io.File;
import java.util.Date;

public interface FileUtilService {
	//手机上传用户头像文件返回url和一个删除标记
	public String[] uploadHeadPhoto(User user,String file,String photoType);
	//后台用户头像的上传
	public String[] uploadHeadPhotoAdmin(User user,File f,String fileName);
	//上传图片
	public String[] uploadPhoto(User user,File f,String fileName,Date date);
	//删除图片
	public void delPhoto(Photo photo);
	//标签封面的上传
	public String[] uploadLabelPhoto(File f,String fileName);
	//删除标签封面
	public void delLabelPhoto(Label label);
	//上传消息发布页面的封面图片
	public String[] uploadNewsFenMianPhoto(File f,String fileName);
	//删除消息的封面图片
	public void delNewsFenMianPhoto(News news);

}
