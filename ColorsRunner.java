class ColorsRunner{

       public static void main(String[] args)
	   {
	   
	   System.out.println("main: nadithide");
	   String ref="Red";
	   Colors.save(ref);
	   Colors.save("Orange");
	   Colors.save("Green");
	   Colors.save("pink");
	   Colors.save("Block");
	   Colors.save("Yellow");
	   Colors.save("White");
	   Colors.displayDetails();
	   boolean found=Colors.findColors("Blue");
	   System.out.println("color found :"+found);
	   System.out.println("main: mugithu");
	   
	   
	   
	   
	   }






}