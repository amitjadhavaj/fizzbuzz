# fizzbuzz
FizzBuzz Rest API

FizzBuzz as a service

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
 

Non integer path parameters result in an error.
