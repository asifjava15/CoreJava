package com.training.core.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMapEx {

	public static void main(String[] args) {
//		List<Employee> employees= new ArrayList<Employee>();
//		employees.add(new Employee(21,"Arun",20,"Male",new Address("1","10", "LA", "NC", "US", 12345)));
//		employees.add(new Employee(10,"asif",25,"Male",new Address("1","10", "LA", "NC", "US", 12345)));
//		employees.add(new Employee(1,"gagan",35,"Male",new Address("1","10", "LA", "NC", "US", 12345)));
//		employees.add(new Employee(15,"harsh",26,"Male",new Address("1","10", "LA", "NC", "US", 12345)));
//		employees.add(new Employee(25,"Pinky",23,"Female",new Address("1","10", "LA", "NC", "US", 12345)));
//		employees.add(new Employee(2,"shaik",29,"Male",new Address("1","10", "LA", "NC", "US", 12345)));
//		Map<Integer,Employee> empMap=employees.stream().collect(Collectors.toMap(Employee::getEmpId, Function.identity()));
//		for(Map.Entry<Integer, Employee> m:empMap.entrySet()) {
//			System.out.println("Key: "+m.getKey()+" Value: "+m.getValue());
//		}
		// map() Operation
//		Stream strStream = Stream.of("Welcome", "To", "java", "blog");
//		Stream subStream2 = strStream.map(string -> {
//		 if (string == "java")
//		  return "Java-W3schools";
//		 return string;
//		});
//		List welomeList = (List) subStream2.collect(Collectors.toList());
//		System.out.println(welomeList);

//		  String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
//
//		  // Java 8
//		  String[] result = Stream.of(array)  // Stream<String[]>
//		          .flatMap(Stream::of)        // Stream<String>
//		          .toArray(String[]::new);    // [a, b, c, d, e, f]
//
//		  for (String s : result) {
//		      System.out.println(s);
//		  }
//		Stream fruitsStream = Stream.of( "jack Fruit","Mango", "Apple", "Water Melon", "Apple", "Mango");
//		Stream distinctStream = fruitsStream.distinct().sorted();
//		distinctStream.forEach(name -> System.out.println(name));
//		Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
//		  .peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
//		  .peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());
		
		Stream.of("one", "two", "three", "four").limit(3).forEach(item -> System.out.println(item));
	}

}
