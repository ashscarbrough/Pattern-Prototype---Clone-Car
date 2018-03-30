/*
 * Name: Ash Scarbrough
 * Class: CSCI-C490
 * Semester: Summer II, 2017
 * Assignment: Lab 8
 */

class Car implements Cloneable
{
	private String CarType;
	private String model;
	private Engine engine;
	
	public Car()
	{
		CarType = "Standard";
		model = "Leopard";
		engine = new Engine("V4");
	}
	
	public Car clone() throws CloneNotSupportedException 
	{	
		Car cloneCar = new Car();	// New Car instance created for deep copy
		cloneCar.CarType = new String(this.CarType);	// Deep Copy of CarType String
		cloneCar.model = new String(this.model);	// Deep Copy of model String
		cloneCar.engine = this.engine.clone();		// Calls Engine method to create deep copy clone

		return cloneCar;
	}
	
	public void makeAdvanced(String type, String model, String kmodel)
	{
		CarType = type;
		this.model = model;
		this.engine.reset(kmodel);
	}
	
	public String getModel()
	{
		return model;
	}
	
	public String getEngineModel()
	{
		return engine.show();
	}
}