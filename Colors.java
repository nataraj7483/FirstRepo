class Colors{
	static String[] colorNames={null,null,null,null,null,null,null};
	static int position=0;
	static void save(String colorName)
	{
		System.out.println("save:start ");
		if(colorNames.length>=7)
		{
			System.err.println("Color is exceeds");
			return;
		}
		if(colorName!=null && colorName.length()>3)
		{
		colorNames[position]=colorName;
		System.out.println("Saved color names:"+colorName+"at position"+position);
		position++;
		System.out.println("Next position of ref:"+position);
		}
		else{
			System.err.println("Color name is null:"+colorName);
		}
		System.out.println("save:close");
	}
	static void displayDetails()
	{
		for(int index=0;index<colorNames.length;index++)
		{
			String ref=colorNames[index];
			System.out.println(ref);
		}
	}
	static boolean findColors(String name)
	{
		if(name!=null && name.length()>5)
		{
			System.out.println("Valid name will check in array");
			for(int find=0;find<colorNames.length;find++)
			{
				String ref=colorNames[find];
				if(ref==name)
				{
				System.out.println("color found:"+name);
				return true;
			}
			}
		}
	else{
		System.err.println("Not a Valid Name:"+name);
		
		
	}return false;
	
	
	}
	
	
	
}