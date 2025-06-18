
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // string is an object which is the sequence of characters
		// it can be written in two ways 1st String literal
		
		//String s2 = "Rahul shetty accademy"; // here if two variables define same object not two objects create but both directs to same object 
	   String s5 = "hello"; 
		
		// 2nd with new 
		String s3 = new String ("welcome");
		String s4 = new String ("welcome"); // here with new two different objects create for different variables 
		
		String s = "Rahul Shetty accademy";
	    String[] splittedString = s.split("Shetty");
	    System.out.println(splittedString[0]);
	    System.out.println(splittedString[1]);
	    System.out.println(splittedString[1].trim());
	    for( int i=s.length()-1; i>=0; i--)
	    
	    {
	    System.out.println(s.charAt(i));
	    }
	    
	    //Suppose a UI message says:
	    	//"Test Case ID: 1234 | Status: PASS"

	    	//You want to extract the test ID and status:
	    String msg = "Test Case ID: 1234 | Status: PASS";
	     String[] parts = msg.split("\\|");
	     String testid = parts[0].split(":")[1].trim();
	     String status = parts[1].split(":")[1].trim();
	    
	     System.out.println("ID:" + testid + ", status"+ status);
	    
	
	     
	

}
}