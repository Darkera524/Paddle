package com.paddle.model;


import java.io.Serializable;

public class Test implements Serializable{
	/**
	 * 
	 */
	private int id;
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
