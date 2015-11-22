package hchh.hibernate.dao;

import hchh.hibernate.entity.Group;

import java.util.List;


public interface GroupDao {
	    //获取所有的角色信息
	    public List<Group> findGroups();
	    //通过id查询Group
	    public Group findByID(int id);
	    //通过name查询
	    public Group findByGroupName(String groupName);
}
