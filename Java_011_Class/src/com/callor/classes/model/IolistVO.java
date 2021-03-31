package com.callor.classes.model;

public class IolistVO {

	private String prodName;
	private String comName;
	private String dDate;

	private Boolean priceDivision;

	private Integer prodNum;
	private Integer buyPrice;
	private Integer salesPrice;

	
	
	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	
	
	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	
	
	public String getdDate() {

		return dDate;
	}

	public void setdDate(String dDate) {
		this.dDate = dDate;
	}

	
	
	public Boolean getPriceDivision() {
		return priceDivision;
	}

	public void setPriceDivision(int priceDivision) {

		if (priceDivision == 1) {          // 1을 입력하면 매입
			this.priceDivision = true;
		} else if (priceDivision == 0) {   // 0을 입력하면 매출
			this.priceDivision = false;
		} else {
			this.priceDivision = null;
		}
	}

	
	
	public Integer getProdNum() {
		return prodNum;
	}

	public void setProdNum(Integer prodNum) {
		if (prodNum < 0) {
			this.prodNum = null;
		}
		this.prodNum = prodNum;
	}

	
	
	public Integer getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Integer buyPrice) {
		if (buyPrice < 0) {
			this.prodNum = null;
		}
		this.buyPrice = buyPrice;
	}

	
	
	public Integer getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Integer salesPrice) {
		if (salesPrice < 0) {
			this.prodNum = null;
		}
		this.salesPrice = salesPrice;
	}

}
