/*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Lab 8
 */

class Engine implements Cloneable
{
	private String model;
	
	public Engine(String model)
	{
		this.model = model;
	}
	
	public void reset(String model)
	{
		this.model = model;
	}
	
	public String show()
	{
		return model;
	}

	public Engine clone() throws CloneNotSupportedException
	{
		//return (Engine) super.clone();	// shallow copy clone returned
		return new Engine(new String(this.model));  // deep copy clone returned
		 
	}
}




