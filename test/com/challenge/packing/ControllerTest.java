package com.challenge.packing;

import java.util.ArrayList;
import java.util.Random;
import org.junit.Test;


public class ControllerTest 
{
	private Controller packingController;
	
	
	private void testFindSmallestDropBox(ArrayList<Rectangle> boxes)
	{
		try
		{
		this.packingController = new Controller(boxes);
		Rectangle smallestDropBox = this.packingController.findSmallestDropBox();
		smallestDropBox.printDetailsToConsole();
		}
		catch(Exception ex)
		{
			System.err.println(ex.getStackTrace());
		}
	}
	
	@Test
	public void testFindSmallestDropBoxes() throws Exception
	{
		/*ArrayList<Rectangle> boxes = new ArrayList<Rectangle>();
		boxes.add(new Rectangle(8,4));
		boxes.add(new Rectangle(3,12));
		boxes.add(new Rectangle(6,18));
		boxes.add(new Rectangle(2,2));
		boxes.add(new Rectangle(3,2));*/
		
		Random generator = new Random();
		int dimensionUpper = 100;
		ArrayList<ArrayList<Rectangle>> boxList = new ArrayList<ArrayList<Rectangle>>();
		for(int i=0;i<10;i++)
		{
			ArrayList<Rectangle> boxes =  new ArrayList<Rectangle>();
			for(int j=0;j<100;j++)
			{
				int length = generator.nextInt(dimensionUpper);
				int width = generator.nextInt(dimensionUpper);
				if(length >0 && width>0)
					boxes.add(new Rectangle(length, width));
			}
			boxList.add(boxes);
		}
		
		for(ArrayList<Rectangle> boxes:boxList)
		{
			this.testFindSmallestDropBox(boxes);
		}
	}
}
