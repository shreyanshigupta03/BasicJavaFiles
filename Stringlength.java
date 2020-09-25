public class Stringlength{
 public static void main(String[]args){
  String greet= "Hello Welcome";
  String firstName="Shreyanshi";
  String lastName="Gupta";
  String text = "We are the so-called \"Vikings\" from the north.";
  String txt= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  System.out.println(greet);
   String t = "Hello\rWorld!";
    System.out.println(t);
  String tx = "Hello\nWorld!";
    System.out.println(tx);
  
  System.out.println("The lenght of the string is:" + txt.length());
  System.out.println(greet.toUpperCase());   // Outputs "HELLO WORLD"
  System.out.println(greet.toLowerCase());
  System.out.println(greet.indexOf("m"));
  System.out.println(firstName + " " + lastName);
  System.out.println(firstName.concat( lastName));
  System.out.println(text);
  String x = "Hello\rWorld!";
    System.out.println(x);
 

}
}