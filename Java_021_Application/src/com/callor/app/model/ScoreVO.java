package com.callor.app.model;

public class ScoreVO {

	private String strNum ;
	private Integer intKor ;
	private Integer intEng;
	private Integer intMath ;
	
	private Integer avg ;
	private Integer total ;
	
	
	public ScoreVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ScoreVO(String strNum, Integer intKor, Integer intEng, Integer intMath, Integer avg, Integer total) {
		super();
		this.strNum = strNum;
		this.intKor = intKor;
		this.intEng = intEng;
		this.intMath = intMath;
		this.avg = avg;
		this.total = total;
	}





	@Override
	public String toString() {
		return "ScoreVO [strNum=" + strNum + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
				+ ", avg=" + avg + ", total=" + total + "]";
	}
	
	
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public Integer getIntKor() {
		return intKor;
	}
	public void setIntKor(Integer intKor) {
		this.intKor = intKor;
	}
	public Integer getIntEng() {
		return intEng;
	}
	public void setIntEng(Integer intEng) {
		this.intEng = intEng;
	}
	public Integer getIntMath() {
		return intMath;
	}
	public void setIntMath(Integer intMath) {
		this.intMath = intMath;
	}
	public Integer getAvg() {
		return avg;
	}
	public void setAvg(Integer avg) {
		this.avg = avg;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	
	
}
