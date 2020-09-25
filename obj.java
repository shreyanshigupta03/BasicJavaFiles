public class obj{
  int x=5;
  String name= "mann";
  String lname= "gupta";
  int age = 23;
public static void main(String[]args){
 obj myObj = new obj();
 obj myObj1 =new obj();
 //obj person = new obj();
 myObj.x=40;
 System.out.println(myObj.x);
 //overiding of value
  myObj.x=45;
 System.out.println(myObj1.x);
 System.out.println(myObj.x);
 System.out.println("NAME=" + myObj.name + " " + myObj.lname);
 System.out.println("AGE=" + myObj.age);
}

}