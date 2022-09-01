package factoryPattern;

public abstract  class Plan {
	
	protected double rate;
	
	abstract void getrate();
	
	public void generateBill(int units)
	{
		System.out.println("Total amount:"+(rate*units));
	}

}
