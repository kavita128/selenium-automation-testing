import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {1, 2, 4, 6, 7,8, 9, 10 , 122};
		
		for (int i=0; i<arr2.length; i++)
		{
			if (arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
				}
			else
			{
				System.out.println(arr2[i] +"is not a multiple of 2");
			}
			ArrayList<String> a = new ArrayList<String>();
	        a.add("rahul");
	        a.add("shetty");
	        a.add("accademy");
	        a.add("selenium");

	        System.out.println(a.get(3));  
	        
	        for (int i1 = 0; i1 < a.size(); i1++) {
	            System.out.println(a.get(i1));
		}
	        System.out.println("***********");
	     for (String val: a) 
	     {
	    	 System.out.println(val);
	     }
	     // item is present in array or not
	       System.out.println(a.contains("selenium"));
	}
		//using contains for string it won't apply directly 
		String[] names = {"rahul", "shetty", "accademy"};
		List<String> namesArrayList = Arrays.asList(names);
		System.out.println(namesArrayList. contains("Selenium"));
		
}
}


