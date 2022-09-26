class TempleDataOperatorRunner{

       public static void main(String[] temples)
	   {
		   System.out.println("main:Open");
		   
		   String ref1="Benkki Ranga";
		   TempleDataOperator.save(ref1);
		   
		   TempleDataOperator.save("Tirupathi");
		   TempleDataOperator.save("Gaali anjaneyya");
		   TempleDataOperator.save("Chamundi Devi");
		    
		   TempleDataOperator.displayDetails();
		   System.out.println("main: Close");
		   
		   
		   
		   
		   
		   
		   
	   }







}