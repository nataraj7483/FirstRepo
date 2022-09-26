class MovieDataOperator{
	
	static String[] movieNames={null,null,null,null,null};
	static int position=0;
	
	static void save(String movieName)
	{
		System.out.println("save:Movie start agide");
		movieNames[position]=movieName;
		System.out.println("saved movie name:"+movieName+" at position:"+position);
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