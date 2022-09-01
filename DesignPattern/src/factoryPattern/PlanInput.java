package factoryPattern;

public class PlanInput {
	
	
	
	Plan getPlan(String name)
	{
		if(name==null)
		{
			return null;
		}
		
		if(name.equalsIgnoreCase("Domestic"))
			return new DomesticPlan();
		else if(name.equalsIgnoreCase("Commercial"))
			return new CommercialPlan();
		else if(name.equalsIgnoreCase("Institutional"))
			return new IntitutionalPlan();
		return null;
	}

}
