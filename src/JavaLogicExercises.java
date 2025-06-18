
public class JavaLogicExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int evenCount= 0;
		int oddCount=0;
		
		
		System.out.println("Even Number:");
		
		for (int i=0; i<arr.length; i++)
		{ 
			if(arr[i] % 2==0)
				
		{
			System.out.println(arr[i]);
			evenCount++;
		}
		}
			System.out.println("Odd Number: ");
			
		for (int odd: arr)
		{ 
			if( odd %2 !=0)
			
			
		{
			System.out.println(odd);
			oddCount++;
		}
		}
		
		System.out.println("Total evencount" +evenCount);
		System.out.println("Totle oddcount" +oddCount);
		
		int[] scores= {10, 20, 40, 70, 90};
	 
		int max= scores[0];
		int min = scores[0];
		
		for (int i = 1; i< scores.length; i++)
		{ 
			if (scores[i] > max ) {
         max=scores[i];
			}
			
			else if(scores[i]<min) {
				min=scores[i];
			}
			
		}
		
		
		System.out.println("Maximum Number:" + max);
		System.out.println("Minimum Number:" + min);
		
		
		for (int i=0; i<scores.length; i++)
		{ if (scores[i] != max && scores[i] != min);
		
		{
			System.out.println("scores"+scores[i]+"in between max and min");
			
		}
		}
			}
			
           
		
		
		
	}



      
