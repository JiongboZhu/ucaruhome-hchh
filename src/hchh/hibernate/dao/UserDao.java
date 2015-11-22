package hchh.hibernate.dao;

import hchh.hibernate.entity.User;

import java.util.List;

public interface UserDao {
       //通过用户名和密码查询用户
	public User findUser(String userName,String password,String password1);
	//查询所有的管理员用户的条数
	public int findUsersCount(int roleId);
	   //查询所有的管理员用户
	public List<User> findUsers(int roleId,int count,int nowPage,int maxPage,int maxPageCount);
	
	//保存一个user
	public void savaOrUpdateUser(User user);
	//通过userId查询user
	public User findById(int userId);
	//删除一个user
	public void delUser(User user);
	//查询所有待认证的用户
	public int findUsersAllCount(int headPhotoRZ);
	public List<User> findUsersAll(int headPhotoRZ,int count,int nowPage,int maxPage,int maxPageCount);
	//通过用户名查询
	public List<User>  findByUserName(String userName);
	//通过designer查询
	public int findUserAllCountByDesigner(int designer);
	public List<User> findUsersAllByDesigner(int designer,int count,int nowPage,int maxPage,int maxPageCount);
	
	//审核有结果的designer
	public int findUserAllCountByDesignerOver();
	public List<User> findUsersAllByDesignerOver(int count,int nowPage,int maxPage,int maxPageCount);
	
	//通过supplier查询
	public int findUserAllCountBySupplier(int supplier);
	public List<User> findUsersAllBySupplier(int supplier,int count,int nowPage,int maxPage,int maxPageCount);
	
	//审核有结果的supplier
	public int findUserAllCountBySupplierOver();
	public List<User> findUsersAllBySupplierOver(int count,int nowPage,int maxPage,int maxPageCount);
	//通过手机号码查询用户
	public List<User> findByPhone(String phone);
	//通过手机号码和密码查询
	public User findUserByPhoneAndPassword(String phone,String password,String password1);
}
