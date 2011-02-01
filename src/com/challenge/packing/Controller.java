package com.challenge.packing;

import java.util.ArrayList;

public class Controller 
{
	public ArrayList<Rectangle> boxes;
	
	public Controller(ArrayList<Rectangle> boxes)
	{
		this.boxes = boxes;
	}
	
	public Rectangle findSmallestDropBox()
	{
		Rectangle smallestDropbox = null;
		smallestDropbox = this.findClosestDropboxMatch();
		return smallestDropbox;
	}
	
	/**
	 * Use to find total sq area for all the boxes
	 * @return Total area as an integer
	 */
	private int findTotalArea()
	{
		int totalArea = 0;
		for(Rectangle box:this.boxes)
		{
			totalArea+=box.getArea();
		}
		return totalArea;
	}
	
	/**
	 * Use to find the largest box among the boxes
	 * @return Can return null or the largest box.
	 */
	private Rectangle findLargestBox()
	{
		int largestArea = 0;
		Rectangle largestBox = null;
		for(Rectangle box:this.boxes)
		{
			if(box.getArea()>largestArea)
			{
				largestArea = box.getArea();
				largestBox = box;
			}
		}
		return largestBox;
	}
	
	
	/**
	 * Use to find the find the DropBox which has length and width closest to the largest box
	 * @return
	 */
	private Rectangle findClosestDropboxMatch()
	{
		Rectangle closestDropBox = null;
		// First find the largest box in the list
		Rectangle largestBox = this.findLargestBox();
		// Find the DropBox which has length and width closest to the largest box
		ArrayList<Rectangle> possibleDropBoxes = this.findPossibleDropBoxes();
		for(Rectangle dropBox:possibleDropBoxes)
		{
			if(closestDropBox==null)
			{
				closestDropBox = dropBox;
			}
			else
			{
				try
				{
					DifferenceRectangle diffRectangle = new DifferenceRectangle(dropBox.getLength() - largestBox.getLength(), dropBox.getWidth()- largestBox.getWidth());
					if(diffRectangle.getSumOfSides()<closestDropBox.getSumOfSides())
					{
						closestDropBox = dropBox;
					}
				}
				catch(Exception ex)
				{
					
				}
				largestBox.rotateNinetyDegrees();
				try
				{
					DifferenceRectangle rotatedDiffRectangle = new DifferenceRectangle(dropBox.getLength() - largestBox.getLength(), dropBox.getWidth()- largestBox.getWidth());
					if(rotatedDiffRectangle.getSumOfSides()<closestDropBox.getSumOfSides())
					{
						closestDropBox = dropBox;
					}
				}
				catch(Exception ex)
				{
					
				}
			}
		}
		return closestDropBox;
	}
	
	
	
	/**
	 * Use to find all possible DropBoxes that can fit the boxes
	 * @return ArrayList of Rectangles
	 */
	private ArrayList<Rectangle> findPossibleDropBoxes()
	{
		ArrayList<Rectangle> possibleDropBoxes = new ArrayList<Rectangle>();
		int totalArea = this.findTotalArea();
		for (int side = 1; side < totalArea; side++) 
		{
            if (totalArea % side == 0) 
            {
                if (isPrime(side)) 
                {
                	try
                	{
                	possibleDropBoxes.add(new Rectangle(side, totalArea/side));
                	}
                	catch(Exception ex)
                	{
                		
                	}
                }
            }
		}
		return possibleDropBoxes;
	}
	
	/**
	 * Use to check if a number is Prime or not
	 * @param number
	 * @return
	 */
	private boolean isPrime(long number) 
	{
        boolean isPrime = false;
        int i = (int) Math.ceil(Math.sqrt(number));
        while (i > 1) {
                if ((number != i) && (number % i == 0)) {
                        isPrime = false;
                        break;
                } else if (!isPrime)
                        isPrime = true;
                --i;
        }
        return isPrime;
	}
	
	

}
