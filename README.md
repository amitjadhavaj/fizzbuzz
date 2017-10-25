# fizzbuzz
FizzBuzz Rest API

**FizzBuzz as a service**

This web application that can do fizzbuzz as a web service and this will  prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.

This service support one GET endpoint:

Use below endpoint to access this service :

http://localhost:8080/fizzbuzz/{upper bound as an integer}  

//e.x http://localhost:8080/fizzbuzz/100
 

This service consumes an upper boundry as a path parameter, and determine which numbers would print "Fizz", "Buzz", and "FizzBuzz". It respond to the caller with these numbers, grouped by Fizz, Buzz, and FizzBuzz. For example:

Sample response
HTTP GET - http://localhost:8080/fizzbuzz/15
 
 
{
  Fizz: [3,6,9,12],
  Buzz:[5,10],
  FizzBuzz:[15]
}
 

Non integer path parameters results in an error.


**How to Install :**

1. download or checkout the code from git repository

2. Go into the root folder (fizzbuzz-master) and Open command prompt and run the below command to build the application.

	`mvn eclipse:eclipse` 
	
3. To run the application use below command

	`mvn spring-boot:run`
	
4. Open the below URL in browse and provide the input as integer	
 	http://localhost:8080/fizzbuzz/100
 	
5. If you want to change the port use below command 
	
	`java -jar -Dserver.port=9000 target/fizzbuzz-1.0-SNAPSHOT.jar`
 
	
6. open the url in browser with new port - http://localhost:9000/fizzbuzz/100
