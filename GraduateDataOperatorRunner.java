class GraduateDataOperatorRunner{

	public static void main(String[] student)
	{
		System.out.println("main:  beku");
		String ref="Natarj S 7";
		GraduateDataOperator.save(ref);
		GraduateDataOperator.save("Sanjay 7.8");
		GraduateDataOperator.save("Sharath 8");
		GraduateDataOperator.displayDetails();
		System.out.println("main:  saku");
	}
}