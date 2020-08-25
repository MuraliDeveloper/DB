package com.mnp.sharan;
import java.sql.Blob;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	@Id
	@GeneratedValue
	@Column(name = "User_ID")
	private int userId;

	@Column(name = "Name")
	private String name;

	@Column(name = "content")
	@Lob
	private Blob content;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Blob getContent() {
		return content;
	}

	public void setContent(Blob content) {
		this.content = content;
	}

	public void setCreateDate(Calendar instance) {
		// TODO Auto-generated method stub

	}
}
