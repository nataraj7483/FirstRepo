class VehicleRunner{
	
	public static void main(String[] vehicle)
	{
		System.out.println("Entered main method");
		Vehicle.transport("Hosadurga");
		Vehicle.transport("Shivmoga",true);
		Vehicle.transport(true);
		Vehicle.transport("Shivmoga", false);
		Vehicle.transport(true);
		
	}
	
	
}