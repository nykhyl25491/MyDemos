package com.app.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="BOOK")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="BOOKID")
	private Integer bookId;
	@Column(name="BNAME")
	private String name;
	@Column(name="BDESC")
	private String desc;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="BOOK_AUTHOR",joinColumns = @JoinColumn(name= "B_ID"),inverseJoinColumns = @JoinColumn(name="A_ID"))
	List<Author> authors;
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	
	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", desc=" + desc + ", authors=" + authors + "]";
	}

	
	

}
