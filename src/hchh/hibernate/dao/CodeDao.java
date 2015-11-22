package hchh.hibernate.dao;

import hchh.hibernate.entity.Code;

public interface CodeDao {
  //保存一个Code
	public void saveCode(Code code);
  //删除一个Code
	public void delCode(Code code);
  //通过userKey查询
	public Code findByUserKey(String userKey);
}
