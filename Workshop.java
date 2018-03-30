class Workshop
{
	public Car makeJaguar(Car Car)
	{
		Car.makeAdvanced("Advanced", "Jaguar", "V6");
		return Car;
	}
	
	public Car makeRoadrunner(Car Car)
	{
		Car.makeAdvanced("Advanced", "RoadRunner", "V8");
		return Car;
	}
}