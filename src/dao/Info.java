package dao;

//import java.sql.Date;

public class Info {
	private String uname;
	private String type;
	private String id;
	private String name;
	private String lenddate;
	private String huanqi;
	private String cq;
	private String info;
	private String appoint;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLenddate() {
		return lenddate;
	}
	public void setLenddate(String lenddate) {
		this.lenddate = lenddate;
	}
	public String getHuanqi() {
		return huanqi;
	}
	public void setHuanqi(String huanqi) {
		this.huanqi = huanqi;
	}
	public String getCq() {
		return cq;
	}
	public void setCq(String cq) {
		this.cq = cq;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	public String getAppoint() {
		return appoint;
	}
	public void setAppoint(String appoint) {
		this.appoint = appoint;
	}
	public Info(String id,String name,String uname, String type, String lenddate, String huanqi, String cq,
			String info, String appoint) {
		super();
		this.uname = uname;
		this.type = type;
		this.id = id;
		this.name = name;
		this.lenddate = lenddate;
		this.huanqi = huanqi;
		this.cq = cq;
		this.info = info;
		this.appoint = appoint;
	}
	
	

    	

}
