package com.saloni.test;

import java.util.Objects;

public class Product {
		int id;
		String name;
		Double price;
		int qunatity;
	
	 	
	
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

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public int getQunatity() {
			return qunatity;
		}

		public void setQunatity(int qunatity) {
			this.qunatity = qunatity;
		}

		
	public Product(int id, String name, Double price, int qunatity) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
			this.qunatity = qunatity;
		}
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
 
}
