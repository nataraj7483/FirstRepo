class Person
{
	static void Work(String Company, double Salary)
	{
		System.out.println("Enerted companywork");
		System.out.println("Company:"+Company);
		System.out.println("Salary:"+Salary);
		if(Company=="Thoshiba" &&  Salary==35000)
		{
			System.out.println("Company and Salary:" +Company  +Salary);
		}
	}
	static void Work(String Company, double Salary ,String Destination)
	{
		System.out.println("Company:"+Company);
		System.out.println("Salary:"+Salary);
		System.out.println("Destination:"+Destination);
		if(Company=="Worksbot" &&  Salary==25000 && Destination=="Design Enginer")
		{
			System.out.println("Company and Salary and Destination:" +Company  +Salary  +Destination);
		}
	}
}