package com.test.spring;

public class Office {
	private String officeNo = "001";
	
	@Override
	public String toString(){
		return "officeNo" + officeNo;
	}

	public String getOfficeNo() {
		return officeNo;
	}

	public void setOfficeNo(String officeNo) {
		this.officeNo = officeNo;
	}
}
