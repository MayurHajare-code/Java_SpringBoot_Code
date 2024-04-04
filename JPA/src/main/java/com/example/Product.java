package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ProductDetails")
public class Product {

	@Id
	private Integer id;
	private String name;
	private Integer price;
	private Boolean feature;
	private String category;
	private String description;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Boolean getFeature() {
		return feature;
	}
	public void setFeature(Boolean feature) {
		this.feature = feature;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Product(Integer id, String name, Integer price, Boolean feature, String category, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.feature = feature;
		this.category = category;
		this.description = description;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", feature=" + feature + ", category="
				+ category + ", description=" + description + "]";
	}
	
	


}
