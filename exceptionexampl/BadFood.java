package exceptionexampl;

public class BadFood {
	
	public static void checkFruit(String fruitName) throws BadFoodException
	{
		if(fruitName.equalsIgnoreCase("Mango"))
			System.out.println("I like "+fruitName);
		else
			throw new BadFoodException("I dont like "+fruitName);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkFruit("Apple");
		} catch (BadFoodException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
            System.out.println(e.getMessage()); 
		}
		System.out.println("Rest of code.....");
	}

}
