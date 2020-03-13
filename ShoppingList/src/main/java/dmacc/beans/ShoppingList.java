package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShoppingList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String store;
	private String items;
	private String name;

	public ShoppingList() {
		super();
		this.store = "Target";
		// TODO Auto-generated constructor stub
	}
	public ShoppingList(long id, String store, String items, String name) {
		super();
		this.id = id;
		this.store = store;
		this.items = items;
		this.name = name;
	}
	
	public ShoppingList(String store, String items, String name) {
		super();
		this.store = store;
		this.items = items;
		this.name = name;
	}
	public ShoppingList(String name) {
		super();
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ShoppingList [id=" + id + ", store=" + store + ", items=" + items + ", name=" + name + "]";
	}
	
}

