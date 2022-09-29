package com.masai.bean;

public class Customer {

	private int cid;
	private String cname;
	private String cgend;
	private String csrc;
	private String cdest;
	private String cuid;
	private String cpw;
	private int ticketno;
	
	public Customer() {
		
		
	}
	
	public Customer(int cid, String cname, String cgend, String csrc, String cdest, String cuid, String cpw,
			int ticketno) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cgend = cgend;
		this.csrc = csrc;
		this.cdest = cdest;
		this.cuid = cuid;
		this.cpw = cpw;
		this.ticketno = ticketno;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public String getCgend() {
		return cgend;
	}


	public void setCgend(String cgend) {
		this.cgend = cgend;
	}


	public String getCsrc() {
		return csrc;
	}


	public void setCsrc(String csrc) {
		this.csrc = csrc;
	}


	public String getCdest() {
		return cdest;
	}


	public void setCdest(String cdest) {
		this.cdest = cdest;
	}


	public String getCuid() {
		return cuid;
	}


	public void setCuid(String cuid) {
		this.cuid = cuid;
	}


	public String getCpw() {
		return cpw;
	}


	public void setCpw(String cpw) {
		this.cpw = cpw;
	}


	public int getTicketno() {
		return ticketno;
	}


	public void setTicketno(int ticketno) {
		this.ticketno = ticketno;
	}


	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cgend=" + cgend + ", csrc=" + csrc + ", cdest=" + cdest
				+ ", cuid=" + cuid + ", cpw=" + cpw + ", ticketno=" + ticketno + "]";
	}
	
	
	
	
	
}
