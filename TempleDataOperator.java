class MovieDataOperator{
	
	static String[] save(String movieNames);
	int position=0;
	
	static void save(String movieNames)
	{
		System.out.println("save:Movie start agide");
		movieNames [position]=movieNames;
		System.out.println("saved movie name:"+movieNames+" at position:"+position);
		position++;
		System.out.println("Next position of ref:"+ position);
		System.out.println("save: mugithu");
		
	}
	static void displayDetails()
	{
		for(int index=0; index<movieNames.length; index++)
		{
			String ref=movieNames[index];
			System.out.println(ref);
		}
		
		
		
	}
		
		
		
		
		
	
	
	
	
	
}