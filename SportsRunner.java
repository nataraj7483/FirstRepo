class SportsRunner{
	
	public static void main(String[] sports)
	{
		System.out.println("Entered cricketnames");
		String[] PlayersNames={"Rohith Sharma","KL Rahul","Virat Kohli","Suryakumar Yadav","Rishab Panth","Hardik Pandya","R Jadeja","R Ashvin","Yuzvendra Chahal","Jasprit Bumrah","Bhuvaneshwar Kumar"};
		Sports.cricketTeamMembers(PlayersNames);
		
		System.out.println("Entered Jerseyno");
		int[] JerseyNos={7,15,8,5,9,6,10,2,1,67,45};
		Sports.kabbadiTeamMembersJerseyNos(JerseyNos);
		
		System.out.println("Entered salary per month");
		double[] Salary={23000,25000,40000,30000,32000,33000,42000,45000,38000,28000};
		Sports.footBallTeamMembersSalary(Salary);
		
		System.out.println("Entered mobile number");
		long[] Number={7483735838L,7483735878L,7483735848L,7353865789L,8197732643L,8747872243L,8747020476L};
		Sports.ludoTeamMobileNumber(Number);
		
		System.out.println("Entered No of matches played 2002 to 2010");
		int[] NoOfMatches={5,10,15,16,17,19,20,23,8,11};
		Sports.hockeyTeamMembersNoOfMatches(NoOfMatches);
		
		System.out.println("Entered country codes");
		long[] CountryCode={93,355,213,684,376,264,880,1,86,809,1624,91};
		Sports.kokoTeamMembersCountryCode(CountryCode);
		
		System.out.println("Entered members are alive");
		boolean[] Alive={true,true,false,false,true,false,true,false,true};
		Sports.lagoriTeamMembersAlive(Alive);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}