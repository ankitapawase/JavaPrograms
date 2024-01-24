package exceptionexampl;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				String s=null;
				System.out.println(s.length());
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
			try {
				String s1="abc";
				System.out.println(Integer.parseInt(s1));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Rest Of Code");
	}

}
