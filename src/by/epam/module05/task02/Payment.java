package by.epam.module05.task02;

import java.util.ArrayList;
import java.util.Objects;

public class Payment {

	private ArrayList<Product> products;

	public Payment() {

		ArrayList<Product> products = new ArrayList<Product>();
		this.products = products;

	}

	public class Product {

		private String name;
		private double price;
		private int quantity;

		public Product(String name, double price, int quantity) {

			this.name = name;
			this.price = price;
			this.quantity = quantity;

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

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product product = (Product) obj;
			return price == product.price && quantity == product.quantity && Objects.equals(name, product.name);
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, price, quantity);
		}

		@Override
		public String toString() {
			return name + ", price: " + price + " BYN, quantity: " + quantity;
		}

	}

	public ArrayList<Product> getListOfProducts() {
		return products;
	}

	public Product getProduct(int i) {
		return products.get(i);
	}

	public void addProduct(String name, double price, int quantity) {
		products.add(new Product(name, price, quantity));

	}

	public void viewDetails() {
		for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i));
		}
		viewTotalAmountOfPayment();
	}

	public void viewTotalAmountOfPayment() {
		double sum = 0.0;
		for (int i = 0; i < products.size(); i++) {
			sum += products.get(i).getPrice() * products.get(i).getQuantity();
		}
		System.out.println("Total amount of payment: " + sum + " BYN");
	}

}
