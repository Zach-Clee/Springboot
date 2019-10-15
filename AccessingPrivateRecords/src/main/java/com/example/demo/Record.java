package com.example.demo;

public class Record {
	private int Regno;
	private String Name;
	private int Marks;
	public int getRegno() {
		return Regno;
	}
	public void setRegno(int regno) {
		Regno = regno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	
	
	public Record(int R, String N, int M) {
		Regno = R;
		Name = N;
		Marks = M;
	}
	public Record() {}
}
