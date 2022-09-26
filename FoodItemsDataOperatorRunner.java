class FoodItemsDataOperatorRunner{
	
	public static void main(String[] snaks)
	{
		System.out.println("main:start aytu");
		String ref="Chips";
		FoodItemsDataOperator.save(ref);
		FoodItemsDataOperator.save("Kurkure");
		FoodItemsDataOperator.save("Pickels");
		FoodItemsDataOperator.save("cake");
		FoodItemsDataOperator.displayDetails();
		System.out.println("main:mugitu");
	}
	
}