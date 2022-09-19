class SpiceJet{
	
	static void flightNo(String[] flightno)
	{
		System.out.println("Entered flight nos");
		System.out.println("Total flight nos:"+flightno.length);
		for(int index=0; index<flightno.length; index++)
		{
			String ref=flightno[index];
			System.out.println("Flight no:"+ref);
		}
		
	}
	
	
	
}