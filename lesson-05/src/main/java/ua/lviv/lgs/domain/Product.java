package ua.lviv.lgs.domain;

public class Product {

	private int id;
	private String name;
	private String descrioption;
	private double price;

	public Product(int id, String name, String descrioption, double price) {
		super();
		this.id = id;
		this.name = name;
		this.descrioption = descrioption;
		this.price = price;
	}

	public Product(String name, String descrioption, double price) {
		super();
		this.name = name;
		this.descrioption = descrioption;
		this.price = price;
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

	public String getDescrioption() {
		return descrioption;
	}

	public void setDescrioption(String descrioption) {
		this.descrioption = descrioption;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descrioption == null) ? 0 : descrioption.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
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
		if (descrioption == null) {
			if (other.descrioption != null)
				return false;
		} else if (!descrioption.equals(other.descrioption))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", descrioption=" + descrioption + ", price=" + price + "]";
	}

}
