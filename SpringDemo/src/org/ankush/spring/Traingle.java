package org.ankush.spring;

public class Traingle {

	private String type;
	private int height;
	private Points pointA;
	private Points pointB;
	
	public Points getPointA() {
		return pointA;
	}

	public void setPointA(Points pointA) {
		this.pointA = pointA;
	}

	public Points getPointB() {
		return pointB;
	}

	public void setPointB(Points pointB) {
		this.pointB = pointB;
	}

	public int getHeight() {
		return height;
	}

	public Traingle(String type){
		this.type = type;
	}
	
	public Traingle(String type,int height){
		this.type = type;
		this.height= height;
	}
	
	public String getType() {
		return type;
	}
	public void draw(){
		System.out.println(getType()+getHeight());
		System.out.println(getPointA().getX());
	}
}
