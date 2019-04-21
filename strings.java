
public class strings {
String s = "Help";
String t = "Help";// s and t are the same thing both in literal memory
s = "No help"; // immuatble means I have to creat a new object
				//t is unaffected

//two String with the same text created as literals are the same object
//two strings with the same text created using "new" will be different object
//any change to a String (like assigning new text") requires creating a new String object (implicitly or not)

// practical implication: for comparison testing:
//1- testing if two objects are the same object
//2- testing if two objects have the same data values
}	
