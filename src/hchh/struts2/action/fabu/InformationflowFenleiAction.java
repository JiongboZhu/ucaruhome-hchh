package hchh.struts2.action.fabu;

import hchh.hibernate.dao.FenLeiDao;
import hchh.hibernate.dao.InformationflowDao;
import hchh.hibernate.dao.InformationflowFenleiDao;
import hchh.hibernate.entity.FenLei;
import hchh.hibernate.entity.Informationflow;
import hchh.hibernate.entity.InformationflowFenlei;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

@Controller
public class InformationflowFenleiAction {
    @Resource InformationflowFenleiDao informationflowFenleiDao;
    @Resource FenLeiDao fenleiDao;
    @Resource InformationflowDao informationflowDao;
    //input
	private int informtionFlowId;
	private int fenleiId;
	//output
	private boolean ok=false;
	
	public String okInformationflowFenlei(){
		//InformationflowFenlei是否已经存在  存在时ok=false;不存在时ok=true;
		List<InformationflowFenlei> list=informationflowFenleiDao.findByinformationflowIdAndfenleiId(informtionFlowId, fenleiId);
		if(list.size()!=0){
			ok=false;
		}else{
			ok=true;
		}
		return "success";
	}
	
	public String addInformationflowFenlei(){
		try {
			FenLei fl=fenleiDao.findById(fenleiId);
			Informationflow inf=informationflowDao.findById(informtionFlowId);
			InformationflowFenlei inffenlei=new InformationflowFenlei();
			inffenlei.setFenLei(fl);
			inffenlei.setInformationflow(inf);
			informationflowFenleiDao.saveInformationflowFenlei(inffenlei);
			ok=true;
		} catch (Exception e) {
			e.printStackTrace();
			ok=false;
		}
		
		return "success";
	}
	
	//删除
	public String delInformationflowFenlei(){
		//通过informtionFlowId，fenleiId删除
		List<InformationflowFenlei> iffs=informationflowFenleiDao.findByinformationflowIdAndfenleiId(informtionFlowId, fenleiId);
		for(InformationflowFenlei iff:iffs){
			informationflowFenleiDao.delInformationflowFenlei(iff);
		}
		ok=true;
		return "success";
	}
	public int getInformtionFlowId() {
		return informtionFlowId;
	}
	public void setInformtionFlowId(int informtionFlowId) {
		this.informtionFlowId = informtionFlowId;
	}
	public int getFenleiId() {
		return fenleiId;
	}
	public void setFenleiId(int fenleiId) {
		this.fenleiId = fenleiId;
	}
	public boolean isOk() {
		return ok;
	}
	public void setOk(boolean ok) {
		this.ok = ok;
	}
	
}
