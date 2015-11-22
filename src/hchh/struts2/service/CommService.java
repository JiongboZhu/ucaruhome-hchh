package hchh.struts2.service;
/**
 * 公共的逻辑处理类
 */
import hchh.hibernate.dao.InformationflowRecordDao;
import hchh.hibernate.dao.UserRecordDao;
import hchh.hibernate.entity.Informationflow;
import hchh.hibernate.entity.InformationflowRecord;
import hchh.hibernate.entity.User;
import hchh.hibernate.entity.UserRecord;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class CommService {
	@Resource InformationflowRecordDao iffDao;
	@Resource UserRecordDao urDao;
	//保存一个对信息流的操作记录
	public boolean saveInformationflowRecord(String content,String  userId,Informationflow informationflow){
		boolean ok=false;
		InformationflowRecord ifr=new InformationflowRecord();
		ifr.setContent(content);
		ifr.setInformationflow(informationflow);
		ifr.setUserName(userId);
		ifr.setMaketime(new Date());
		iffDao.saveInformationflowRecord(ifr);
		ok=true;
		return ok;
	}
	//添加一条用户操作记录
	//保存一个对信息流的操作记录
	public boolean saveUserRecord(String content,String  userName,User user){
		boolean ok=false;
		UserRecord ur=new UserRecord();
		ur.setUserId(user.getId());
		ur.setUserNameCz(userName);
		ur.setTime(new Date());
		ur.setContentCz(content);
		urDao.saveUserRecord(ur);
		ok=true;
		return ok;
	}
}
