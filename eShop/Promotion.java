package eShop;

import java.sql.Date;

public class Promotion {
	 private double discountPercent;
	    private Date startDate;
	    private Date endDate;
	 public Promotion(double discountPercent, Date startDate, Date endDate) {
	        this.discountPercent = discountPercent;
	        this.startDate = startDate;
	        this.endDate = endDate;
	    }
	public double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	 @Override
	    public String toString() {
	        return "Discount: " + discountPercent + "% | Valid from " + startDate + " to " + endDate;
	    }
}
