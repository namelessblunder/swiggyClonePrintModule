package com.training;

public class PrintBill {

	private String service;
	private long amt;
	public PrintBill(String service, long amt) {
		super();
		this.service = service;
		this.amt = amt;
	}
	public PrintBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public long getAmt() {
		return amt;
	}
	public void setAmt(long amt) {
		this.amt = amt;
	}
	@Override
	public String toString() {
		return "Service=" + service + ", amt=" + amt + "]";
	}
	
	
}
