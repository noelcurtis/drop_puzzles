package com.challenge.packing;

public class Rectangle {
	
	protected int length;
	protected int width;
	protected Boolean isRotatedNinetyDegrees;
	
	public void setLength(int length) throws Exception 
	{
		if(length<=0)
		{
			throw new Exception("Rectangle needs to have both Length and Width >= 0");
		}
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setWidth(int width) throws Exception 
	{
		if(width<=0)
		{
			throw new Exception("Rectangle needs to have both Length and Width >= 0");
		}
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	
	
	
	/**
	 * Use to rotate rectangle by 90 degrees
	 */
	public void rotateNinetyDegrees()
	{
		int temp = this.length;
		this.length = this.width;
		this.width = temp;
		if(this.isRotatedNinetyDegrees)
			this.isRotatedNinetyDegrees = false;
		else
			this.isRotatedNinetyDegrees = true;
	}

	/**
	 * Use to calculate are of this rectangle
	 * @return Area as integer
	 */
	public int getArea()
	{
		return this.length*this.width;
	}
	
	public int getSumOfSides()
	{
		return this.length+this.width;
	}
	
	public void printAreaToConsole()
	{
		System.out.println(this.getArea());
	}
	
	public void printDetailsToConsole()
	{
		System.out.printf("Length: %d \r\n", this.length);
		System.out.printf("Width: %d \r\n", this.width);
		System.out.printf("Area: %d \r\n", this.getArea());
	}
	
	/**
	 * Use to initialize Rectangle with length and width
	 * @param length length as an integer
	 * @param width width as an integer
	 * @throws Exception 
	 */
	public Rectangle(int length, int width) throws Exception
	{
		if(length<=0 || width <=0)
		{
			throw new Exception("Rectangle needs to have both Length and Width >= 0");
		}
		this.length = length;
		this.width = width;
		this.isRotatedNinetyDegrees = false;
	}
	
	public Rectangle()
	{
		this.isRotatedNinetyDegrees = false;
	}
	public void setIsRotatedNinetyDegrees(Boolean isRotatedNinetyDegrees) {
		this.isRotatedNinetyDegrees = isRotatedNinetyDegrees;
	}
	public Boolean getIsRotatedNinetyDegrees() {
		return isRotatedNinetyDegrees;
	}
}
