class BillionariesRunner{
	public static void main(String[] args)
	{
		System.out.println("main: start");
		String billionaries1="Elon Musk";
		Billionaries.save(billionaries1);
		Billionaries.save("Jeff Bezos");
		Billionaries.save("Bernard Arnault");
		Billionaries.save("Bill Gates");
		Billionaries.save("Warren Buffett");
		Billionaries.save("Larry Page");
		Billionaries.save("Sergey Brin");
		Billionaries.save("Larry Ellision");
		Billionaries.save("Steve Ballmer");
		Billionaries.save("Mukkesh Ambani");
		
		Billionaries.update("Larry Page","Gautam Adani");
		boolean delete=Billionaries.deleteBillionaries("Bernard Arnail");
		System.out.println("billionaries deleted:"+delete);
	
		boolean found=Billionaries.findBillionaries("Bill Gates");
		System.out.println("billionaries found:"+found);
		
		Billionaries.displayDetails();
		
		System.out.println("main: close");
		
	}
	
	
}