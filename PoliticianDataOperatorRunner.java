class PoliticianDataOperatorRunner{

	public static void main(String[] politics)
	{
		System.out.println("main :start aytu");
		String ref="Gulehatti D Shekar";
		PoliticianDataOperator.save(ref);
		PoliticianDataOperator.save("BG Govindappa");
		PoliticianDataOperator.save("Panduranga");
		PoliticianDataOperator.save("Maruthi");
		PoliticianDataOperator.displayDetails();
		System.out.println("main:mugitu");
		
	}
	
	
}