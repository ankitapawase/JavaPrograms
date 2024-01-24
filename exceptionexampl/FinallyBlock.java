package exceptionexampl;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Case 1 : Where exception doesn't occures.");
		try {
			int a=12/2;
			System.out.println("Div : "+a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Case 1 : Finnaly block always execute.");
		}
		System.out.println("Case 1 : rest of code.");
		System.out.println("-----------------------------------");
		System.out.println("\ncase 2 : where exception occurs and handle.");
		
		try {
			String s =null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Case 2 : Finnaly block always execute.");
		}
		System.out.println("Case 2 : rest of code.");
		System.out.println("-----------------------------------");
		System.out.println("\ncase 3 : where exception occurs and dosnt handle.");
		
		try {
			int a=12/0;
			System.out.println("Div : "+a);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Case 3 : Finnaly block always execute.");
		}
		System.out.println("Case 3 : rest of code.");
	
	}

}
