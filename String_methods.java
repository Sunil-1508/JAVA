
public class String_methods {
	public static void main(String args[]) {
	String s1="aditya college ";
	String s2="Engineering";
	String s3=s1;
	String s4="engineering";
	System.out.println(s1.charAt(3));//Returns the character at the specified index
	System.out.println(s1.compareTo(s3));//Compares two strings lexicographically
	System.out.println(s1.compareTo(s2));
	System.out.println(s2.compareToIgnoreCase(s4));//Compares two strings lexicographically, ignoring case differences
	System.out.println(s1.concat(s2));//Appends a string to the end of another string
	System.out.println(s1.contains("lleg"));//Checks whether a string contains a sequence of characters
	System.out.println(s2.contains("ngee"));
	System.out.println(s2.contentEquals(s4));//Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer
	System.out.println(s1.equals(s3));//Compares two strings. Returns true if the strings are equal, and false if not
	System.out.println(s4.equals(s2));
	System.out.println(s4.equalsIgnoreCase(s2));//Compares two strings, ignoring case considerations
	char[] ch= {'a','b','c','d','e'};
	System.out.println(s4);
    s4=s4.copyValueOf(ch,0,4);//Returns a String that represents the characters of the character array
    System.out.println(s4);
    System.out.println(s2.endsWith("ng"));//Checks whether a string ends with the specified character(s)
    //System.out.println(s4.getBytes());
    s2.getChars(2,7,ch,0);//Copies characters from a string to an array of chars
    System.out.println(ch);
    System.out.println(s3.hashCode());//Returns the hash code of a string(ASCII value for single char)
    System.out.println(s1.indexOf('e'));//Returns the position of the first found occurrence of specified characters in a string
    System.out.println(s1.lastIndexOf('e'));//Returns the position of the last found occurrence of specified characters in a string
    System.out.println(s1.length());//Returns the position of the last found occurrence of specified characters in a string
    System.out.println(s1.isEmpty());//Checks whether a string is empty or not
    
    
}}
