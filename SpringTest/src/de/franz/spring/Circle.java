package de.franz.spring;

import org.springframework.beans.factory.annotation.Required;


public class Circle implements Shape{

	
	private Point center;
	private int radius;
	
	public Point getCenter() {
		return center;
	}

	@Required
	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString(){
		return "Center: (" + center.getX() + ", " + center.getY() + ", " + center.getZ() + ") \n" +
			   "radius: " + this.getRadius();
	}
	
	

}
