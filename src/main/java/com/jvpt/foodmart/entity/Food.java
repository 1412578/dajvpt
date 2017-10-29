package com.jvpt.foodmart.entity;

public class Food {
	private int id;
	private String name;
	private double price;
	private double price_promotion;
	private String image;
	private String description;
	
	public Food() {
		
	}
	
	public Food(int id, String name, double price, double price_promotion, String image, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.price_promotion = price_promotion;
		this.image = image;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice_promotion() {
		return price_promotion;
	}
	public void setPrice_promotion(double price_promotion) {
		this.price_promotion = price_promotion;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
