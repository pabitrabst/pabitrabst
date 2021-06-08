


public class AutomobileTest
{
	public static void main(String[] args)
	{
		Automobile camryAutomobile = new Automobile();

		camryAutombile.setMake("Toyota");
		camryAutombile.setModel("2017");
		camryAutombile.setType("Camry V6");
		camryAutombile.setPrice(22000.00);

		
		String make = camryAutombile.getMake();
		String model= camryAutombile.getModel();
		String type= camryAutombile.getType();
		double price= camryAutombile.getPrice();

		System.out.printf("%n%s",make);
		System.out.printf("%n%s", model);
		System.out.printf("%n%s",type);
		System.out.printf("%d%n",price);

	}


}