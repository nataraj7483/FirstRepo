class MovieDataOperatorRunner{
	
	public static void main(String[] movies)
	{
		System.out.println("main: Open");
		
		String ref="Galate Aliyandru";
		MovieDataOperator.save(ref);
		
		MovieDataOperator.save("Bhabruvahana");
		MovieDataOperator.save("Mayura");
		MovieDataOperator.save("Simdriya Simha");
		MovieDataOperator.save("Nagavalli");
		
	    MovieDataOperator.displayDetails();
		System.out.println("main:close");
	
		
	}
	
	
	
}