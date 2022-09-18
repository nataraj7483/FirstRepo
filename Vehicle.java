class Vehicle{
	
	static double transport(String source, String destination)
	{
	  System.out.println("Entered source and destination");
	  if(source=="Hosadurga" && destination=="280")
	  {
		  System.out.println("The journy starts from Hosadurga to Bangaloore");
		  return 280;
	  }
	  return 0.0;
		
	}
	static double transport(String source, String destination, boolean ontime)
	{
		System.out.println("Entered transport");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
		if(source=="Shivmoga" && destination=="Hosadurga" && ontime==true)
		{
			System.out.println("The journy start from Shivmoga to Hosadurga");
			return 180;
		}
		return 0.0;
	
	}
	static boolean transport(String destination)
	{
		System.out.println("Entered Transport");
		if(destination=="Shivmoga")
		{
			System.out.println("The journy starts from hosadurga to bangaloore");
			return true;
		}
		return false;
	}
	static boolean transport(String destination, boolean ontime)
	{
		System.out.println("To reach destination ontime");
		if(destination=="Shivmoga" && ontime==true)
		{
			System.out.println("To reach shivmoga ontime");
			return false;
		}
		return true;
	}
	static boolean transport(boolean ontime)
	{
		System.out.println("to reach ontime");
		if(ontime==true)
		{
			System.out.println("To reach destination ontime");
			return true;
		}
		return false;
	}
	
	
	
}