package com.logo.model;

public class Safe {// Safe sınıfı Logo İşbaşı sitesinin Kasa bölümünden esinlenerek yapıldı.
	
	private String safeName;
	private String doviz;
	private double initialCapital;
	private String date;
	
	
	
	
	public Safe(String safeName, String doviz, double initialCapital, String date) {
		super();
		this.safeName = safeName;
		this.doviz = doviz;
		this.initialCapital = initialCapital;
		this.date = date;
	}
	public String getSafeName() {
		return safeName;
	}
	public void setSafeName(String safeName) {
		this.safeName = safeName;
	}
	public String getDoviz() {
		return doviz;
	}
	public void setDoviz(String doviz) {
		this.doviz = doviz;
	}
	public double getInitialCapital() {
		return initialCapital;
	}
	public void setInitialCapital(double initialCapital) {
		this.initialCapital = initialCapital;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}
