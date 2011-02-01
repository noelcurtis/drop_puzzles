package com.challenge.packing;

public class DifferenceRectangle extends Rectangle 
{
	/**
	 * Use to initialize Rectangle with length and width
	 * @param length length as an integer
	 * @param width width as an integer
	 * @throws Exception 
	 */
	public DifferenceRectangle(int length, int width) throws Exception
	{
		if(length<0 || width <0)
		{
			throw new Exception("Rectangle needs to have both Length and Width >= 0");
		}
		this.length = length;
		this.width = width;
		this.isRotatedNinetyDegrees = false;
	}
}
