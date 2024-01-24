package assessment;

import java.util.stream.Collectors;

public class InsertSpace {
	
	 /* With Java8
    public String insertSpace(String s) {
        // Using Java 8 Stream API and lambda expression to insert a space between each character
        return s.chars()
                .mapToObj(c -> (char) c + " ")  // Convert each character to String with a space
                .collect(Collectors.joining()); // Join the strings
    }*/
	
	//Without Java8
	 public String insertSpace(String s) {
	        StringBuilder result = new StringBuilder();
	        
	        // Iterate through each character in the input string
	        for (int i = 0; i < s.length(); i++) {
	            // Append the character and a space to the result
	            result.append(s.charAt(i)).append(' ');
	        }
	        
	        // Convert StringBuilder to String and trim the trailing space
	        return result.toString().trim();
	    }
    
    public static void main(String[] args) {
        // Example usage
    	InsertSpace source = new InsertSpace();
        String result = source.insertSpace("Capgemini");
        System.out.println(result);  
    }

}
