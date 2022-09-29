package com.masai.bean;

public class Admin {
	private int busid;
	private String busname;
	private String busroute;
	private String bustype;
	private int seatAvail;
	private int seatCapacity;
	private String departTime;
	private String ariveTime;
	private String adminId;
	private String adminPw;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(int busid, String busname, String busroute, String bustype, int seatAvail, int seatCapacity,
			String departTime, String ariveTime, String adminId, String adminPw) {
		super();
		this.busid = busid;
		this.busname = busname;
		this.busroute = busroute;
		this.bustype = bustype;
		this.seatAvail = seatAvail;
		this.seatCapacity = seatCapacity;
		this.departTime = departTime;
		this.ariveTime = ariveTime;
		this.adminId = adminId;
		this.adminPw = adminPw;
	}

	public int getBusid() {
		return busid;
	}

	public void setBusid(int busid) {
		this.busid = busid;
	}

	public String getBusname() {
		return busname;
	}

	public void setBusname(String busname) {
		this.busname = busname;
	}

	public String getBusroute() {
		return busroute;
	}

	public void setBusroute(String busroute) {
		this.busroute = busroute;
	}

	public String getBustype() {
		return bustype;
	}

	public void setBustype(String bustype) {
		this.bustype = bustype;
	}

	public int getSeatAvail() {
		return seatAvail;
	}

	public void setSeatAvail(int seatAvail) {
		this.seatAvail = seatAvail;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public String getDepartTime() {
		return departTime;
	}

	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}

	public String getAriveTime() {
		return ariveTime;
	}

	public void setAriveTime(String ariveTime) {
		this.ariveTime = ariveTime;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPw() {
		return adminPw;
	}

	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}

	@Override
	public String toString() {
		return "Admin [busid=" + busid + ", busname=" + busname + ", busroute=" + busroute + ", bustype=" + bustype
				+ ", seatAvail=" + seatAvail + ", seatCapacity=" + seatCapacity + ", departTime=" + departTime
				+ ", ariveTime=" + ariveTime + ", adminId=" + adminId + ", adminPw=" + adminPw + "]";
	}

	
	
	
	
}
