package hchh.hibernate.dao;

import hchh.hibernate.entity.Comment;

import java.util.List;

public interface CommentDao {
   //查询所有的comment并分页
	public int findCommentAllCount();
	public List<Comment> findCommentAll(int count,int nowPage,int maxPage,int maxPageCount);
   //删除一条记录
	public void delComment(Comment comment);
   //通过id查询
	public Comment findById(int commentId);
	
}
