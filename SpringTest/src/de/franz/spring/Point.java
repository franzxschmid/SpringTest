package de.franz.spring;

import org.springframework.beans.factory.annotation.Required;

public class Point {

	private int x;
	private int y;
	private int z;
	
	public int getX() {
		return x;
	}
	
	@Required
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	@Required
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	@Required
	public void setZ(int z) {
		this.z = z;
	}
	
}
