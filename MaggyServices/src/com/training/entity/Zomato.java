package com.training.entity;

public class Zomato {
	
	private long id;
	private String tagline;
	private double revenue;
	
	public Zomato(long id, String tagline, double revenue) {
		super();
		this.id = id;
		this.tagline = tagline;
		this.revenue = revenue;
	}
	
	@Override
	public String toString() {
		return "Zomato [id=" + id + ", tagline=" + tagline + ", revenue=" + revenue + "]";
	}
	
	
}
