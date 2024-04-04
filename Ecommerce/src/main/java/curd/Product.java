package curd;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	private int id;
	private String name;
	private String price;
	private boolean feature;
	private String category;
	private String description;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public boolean isFeature() {
		return feature;
	}
	public void setFeature(boolean feature) {
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
	public Product(int id, String name, String price, boolean feature, String category, String description) {
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
