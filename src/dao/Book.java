package dao;

public class Book {
   private String id;
   private String name;
   private String author;
   private double price;
   private String info;
   
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getInfo() {
	return info;
}
public void setInfo(String info) {
	this.info = info;
}
public Book(String id, String name, String author, double price, String info) {
	this.id = id;
	this.name = name;
	this.author = author;
	this.price = price;
	this.info = info;
}
   
}
