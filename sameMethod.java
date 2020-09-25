public class sameMethod{
 static int plusMethod(int x, int y){
  return x+y;   
    }
 static double plusMethod(double  x, double y){
 return x+y;
   }
 static int plusMethod(int a) {
  System.out.println("Enter value=" + a);
  return 0;
  }
public static void main(String[]args){
  int mynum1=plusMethod(8,5);
  double mynum2=plusMethod(8.3,5.26);
  System.out.println("int: " + mynum1);
  System.out.println("double: " + mynum2);
  int mynum3=plusMethod(8);

   }
}