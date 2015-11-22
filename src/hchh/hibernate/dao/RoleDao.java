package hchh.hibernate.dao;

import hchh.hibernate.entity.Role;

import java.util.List;


public interface RoleDao {
        //通过用户的名称查询角色信息
	    public Role findRole(String  roleName);
	    //获取所有的角色信息
	    public List<Role> findRoles();
	    //通过id查询角色
	    public Role findByID(int roleId);
}
