package hchh.hibernate.dao;

import hchh.hibernate.entity.ReportInformation;

import java.util.List;

public interface ReportInformationDao {
    //分页
	public int findReportInformationAllCount();
	public List<ReportInformation> findReportInformationAll(int count,int nowPage,int maxPage,int maxPageCount);
	//删除
	public void delReportInformationflow(ReportInformation rif);
	//通过id查询
	public ReportInformation findById(int id);
	//保存
	public void saveReportInformation(ReportInformation rif);
}
