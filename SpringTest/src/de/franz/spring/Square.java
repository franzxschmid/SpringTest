package de.franz.spring;

import org.springframework.beans.factory.annotation.Required;

public class Square implements Shape{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	

    public Point getPointA() {
		return pointA;
	}

    @Required
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	@Required
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	@Required
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Point getPointD() {
		return pointD;
	}

	@Required
	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}

	@Override
	public String toString(){
		return "Point A: (" + pointA.getX() + ", " + pointA.getY() + ", " + pointA.getZ() + ") \n" +
			   "Point B: (" + pointB.getX() + ", " + pointB.getY() + ", " + pointB.getZ() + ") \n" +
			   "Point C: (" + pointC.getX() + ", " + pointC.getY() + ", " + pointC.getZ() + ") \n" +
			   "Point D: (" + pointD.getX() + ", " + pointD.getY() + ", " + pointD.getZ() + ")";
	}
	

}
