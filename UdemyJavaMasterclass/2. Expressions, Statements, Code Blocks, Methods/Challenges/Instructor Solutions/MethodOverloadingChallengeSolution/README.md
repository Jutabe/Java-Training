# Method Overloading Challenge - Instructor Solution

## Link to Udemy lecture and challenge

https://www.udemy.com/course/java-the-complete-java-developer-course/learn/lecture/4422036#announcements

## Challenge content

Create a method called calcFeetAndInchesToCentimeters it needs to have two parameters:
	1. feet is the first parameter,
	2. inches is the 2nd parameter

You should validate that the first parameter feet is >= 0
You should validate that the 2nd parameter inches is >= 0 and <=12
return -1 from the method if either of the above is not true

If the parameters are valid, then calculate how many centimeters comprise the feet and inches passed to this method and return that value.

Create a 2nd method of the same name but with only one parameter:
	1. inches is the parameter

validate that its >=0
return -1 if it is not true
But if its valid, then calculate how many feet are in the inches and then here is the tricky part call the other overloaded method passing the correct feet and inches calculated so that it can calculate correctly.

hints: 
	1. Use double for your number datatypes is probably a good idea
    2. 1 inch = 2.54cm and one foot = 12 inches
    3. Use the link I give you to confirm your code is calculating correctly -> https://s11.metric-conversions.org/length/feet-to-centimeters.htmj
    4. Calling another overloaded method just requires you to use the right number of parameters