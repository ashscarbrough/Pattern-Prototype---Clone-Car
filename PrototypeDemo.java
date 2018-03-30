public class PrototypeDemo
{
	public static void main(String args[]) throws CloneNotSupportedException 
	{
		Car standardCar = new Car();
		Car Car_1 = standardCar.clone();
		Car Car_2 = standardCar.clone();
		
		System.out.println("Standard Car--- Model: "+ standardCar.getModel() +"; Engine Model: "+ standardCar.getEngineModel());
		
		System.out.println();
		
		System.out.println("Car 1---Model: "+ Car_1.getModel() + "; Engine Model: "+ Car_1.getEngineModel());
		System.out.println("Car 2---Model: "+ Car_2.getModel() + "; Engine Model: "+ Car_2.getEngineModel());

		System.out.println();
		
		Workshop workShop = new Workshop();
		Car_1 = workShop.makeJaguar(Car_1);
		Car_2 = workShop.makeRoadrunner(Car_2);
		
		System.out.println("New Car 1---Model: "+ Car_1.getModel() + "; Engine Model: "+ Car_1.getEngineModel());
		System.out.println("New Car 2---Model: "+ Car_2.getModel() + "; Engine Model: "+ Car_2.getEngineModel());
	}
}