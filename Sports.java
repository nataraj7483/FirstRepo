class Sports{
	
	static void cricketTeamMembers(String[] names)
    {
	  System.out.println("Enter cricketTeamMembers");
	  System.out.println("Total cricket names:"+ names.length);
      for(int index=0; index<names.length; index++)
      {
		  
		  String ref=names[index];
		  System.out.println("Cricket team members names:"+ref);
		  
	  }
	
	
	}	
	static void kabbadiTeamMembersJerseyNos(int[] numbers)
	{
		System.out.println("Enter kabbadiTeamMembersJerseyNos");
		System.out.println("Total kabbadi jersey no:"+numbers.length);
		for(int index=0; index<numbers.length; index++)
		{
			int ref=numbers[index];
			System.out.println("Kabbadi Team Jersey No:"+ ref);
		}
	}
	static void footBallTeamMembersSalary(double[] salaries)
	{
		System.out.println("Enter footBallTeamMembersSalary");
		System.out.println("Total football players Salary:"+salaries.length);
		for(int index=0; index<salaries.length; index++)
		{
			double ref=salaries[index];
			System.out.println("Football players salary:"+ ref);
		}
	}
	static void ludoTeamMobileNumber(long[] numbers)
	{
		System.out.println("Enter ludoTeamMobileNumber");
		System.out.println("Total mobile numbers:"+numbers.length);
		for(int index=0; index<numbers.length; index++)
		{
			long ref=numbers[index];
			System.out.println("Mobile numbers:"+ref);
		}
	}
	static void hockeyTeamMembersNoOfMatches(int[] matches)
	{
		System.out.println("Enter hockeyTeamMembersNoOfMatches");
		System.out.println("Total hockey matches:"+matches.length);
		for(int index=0; index<matches.length; index++)
		{
			int ref=matches[index];
			System.out.println("No of matches:"+ref);
		}
	}
	static void kokoTeamMembersCountryCode(long[] names)
	{
		System.out.println("Enter kokoTeamMembersCountryCode");
		System.out.println("Total members country code:"+names.length);
		for(int index=0; index<names.length; index++)
		{
			long ref=names[index];
			System.out.println("Koko team country codes:"+ref);
		}
	}
	static void lagoriTeamMembersAlive(boolean[] names)
	{
		System.out.println("Enter lagoriTeamMembersAlive");
		System.out.println("Total team members alive:"+names.length);
		for(int index=0; index<names.length; index++)
		{
			boolean ref=names[index];
			System.out.println("Team members alive:"+ref);
		}
	}
	
	
	
}