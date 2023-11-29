package com.springbootproject.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="writer_book")
public class BookEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="book_id")
	private int id;
	private String name;
	private String title;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Authors authors;
	
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public BookEntity(int id, String name, String title) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
	}
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", name=" + name + ", title=" + title + "]";
	}

}
