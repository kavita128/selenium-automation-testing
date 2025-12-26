import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.testng.Assert;

public class test1 {
		// TODO Auto-generated method stub
		//count the number of names start with alphabet "A" in list
		@Test
	public void regular()
	{ 
	ArrayList<String>names= new ArrayList<String> ();
	names.add("Abhijee");
	names.add("Don");
	names.add("Alakya");
	names.add("Adam");
	names.add("Ram");
	int count=0;
	for(int i=0; i<names.size();i++)
		{
	    String actual = names.get(i);
	    if(actual.startsWith("A"))
	    { 
	    	count++;
	    	
	    }
		}
	System.out.println(count);
		}
    @Test
    public void streamFilter()
    {
    	ArrayList<String>names= new ArrayList<String> ();
    	names.add("Abhijee");
    	names.add("Don");
    	names.add("Alakya");
    	names.add("Adam");
    	names.add("Ram");
    	//there is no life for intermediate op if there is not terminal op
    	//terminal operation will execute only if inter op(filter) returns true 
    	//we can create stream
    	//How to use filter in stream API
    	Long c = names.stream().filter(s->s.startsWith("A")).count();
    	System.out.println(c);
    	
    	long d = Stream.of("Abhijee","Don","Alakya","Adam","Ram" ).filter(s->
    	{ 
    		s.startsWith("A");
    		return false;
    		}).count();
    	System.out.println(d);
    	names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
    	names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
    	
    	}
    //print names which have last letter a" in upper case
    @Test
    public void streamMap()
    {
    
    
    	Stream.of("Abhijee","Don","Alakya","Adam","Ram" ).filter(s->s.endsWith("a")).map(s->s.toUpperCase())
    	.forEach(s->System.out.println(s));
    
    }
  // print names which have first letter a" in upper case and sorted 
    @Test
    public void filterAndMerge() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Man");
        names.add("Don");
        names.add("Women");
    List<String> name1 = Arrays.asList("Azbhijee", "Don", "Alekhy", "Adam", "Rama");

    name1.stream().filter(s -> s.startsWith("A")).sorted() .map(s -> s.toUpperCase())
         .forEach(System.out::println);
    List<String> mergedList = Stream.concat(names.stream(), name1.stream())
            .collect(Collectors.toList());

// Now you can use mergedList multiple times
mergedList.stream().sorted().forEach(System.out::println);

boolean flag = mergedList.stream()
     .anyMatch(s -> s.equalsIgnoreCase("Adam"));

System.out.println("Is 'Adam' present? " + flag);

Assert.assertTrue(flag);  // ✅ This will now PASS because Adam exists
}
  @Test
  public void streamCollect() {
	  List<String> ls = Stream.of("Abhijee", "Don", "Alakya", "Adam", "Ram")
              .filter(s -> s.endsWith("a"))
              .map(s -> s.toUpperCase())
              .collect(Collectors.toList());
	 if (!ls.isEmpty()) {
		    System.out.println(ls.get(0));
		} else {
		    System.out.println("No names ending with 'a' found.");
		}
	// System.out.println(ls.get(0));
  
List<Integer> value = Arrays.asList(3,2,2,7,5,1,9,7);
List<Integer> li=value.stream().distinct().sorted().collect(Collectors.toList());
System.out.println(li.get(2));
  }  
  }
  
    
