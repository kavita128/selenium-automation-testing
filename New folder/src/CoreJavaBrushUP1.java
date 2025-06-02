
public class CoreJavaBrushUP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = 5;
		String website = "rahul shetty accademy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true; 
		System.out.println(myNum + "is the value stored in the myNum variale");
		System.out.println(website);
		//Array 
		int [] arr = new int [5];
		arr[0] = 1;
		arr[1] =2;
		arr[2] = 4;
		arr[3] = 6;
		arr[4] =7;
		
		
		int[] arr2 = {1, 2, 4, 6, 7,8, 9, 10 };
		System.out.println (arr2[0]);
		
		
		// for loop
		for (int i=0; i<arr.length; i++)
		{
		System.out.println(arr[i]);
		}
		
    for (int i= 0; i<arr2.length; i++)
        { System.out.println(arr2[i]);
        }
    	
    String[] name = {"rahul" , "shetty" , "selenium"};
    for (int i=0; i< name.length; i++)
    
    { System.out.println(name[i]);
	}
    
	for (String s: name)

	{System.out.println(s);
	
	}
	
}

}
