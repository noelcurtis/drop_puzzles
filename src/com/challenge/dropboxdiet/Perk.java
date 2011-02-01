package com.challenge.dropboxdiet;

public class Perk {
	private String name;
	private int caloricImpact;
	private int id;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCaloricImpact(int caloricImpact) {
		this.caloricImpact = caloricImpact;
	}
	public int getCaloricImpact() {
		return caloricImpact;
	}
	
	public void printName()
	{
		System.out.printf("%s", this.name);
	}
	
	public void printPerk()
	{
		System.out.printf("Perk Name:%s, Caloric Impact:%d \r\n", this.name, this.caloricImpact);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public Perk(int id, String name, int calorificImpact)
	{
		this.id = id;
		this.name = name;
		this.caloricImpact = calorificImpact;
	}
	
	public Boolean isCaloriePositive()
	{
		if(this.caloricImpact > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
