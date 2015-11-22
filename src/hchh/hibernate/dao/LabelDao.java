package hchh.hibernate.dao;

import hchh.hibernate.entity.Label;

import java.util.List;

public interface LabelDao {
     //根据type类型读取所有的label
	public List<Label> findByType(int type);
	//根据等级查询相关list
	public List<Label> findByGrade(int grade,int type);
	//根据父节点查询list
	public List<Label> findByParentId(int parentId,int type);
	//通过type查询并通过treeCode排序
	public List<Label> findByTypeAndTreeCodeAsc(int type);
	//通过type查询并通过treeCode排序 可购标签除外
	public List<Label> findByTypeAndTreeCodeAsc1(int type);
	//通过type查询并通过treeCode排序 只查询可购标签
	public List<Label> findByTypeAndTreeCodeAsc2(int type);
	//通过id查询一个标签信息
	public Label findByID(int id);
	//保存更新一个Label
	public void saveLabel(Label label);
	//对自定义标签进行模糊查询
	public List<Label> findBySouSuo(String sousuo,int type);
	//删除一个系统标签
	public void deleteLabel(Label label);
	//通过parentId查询
	public List<Label> findByParentId(int parentId);
	//通过type,parentId,grade查询
	public Label findByTPG(int type,int parentId,int grade);
}
