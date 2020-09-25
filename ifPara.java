public class ifPara{
  static void checkAge(int age){
      if(age>18){
      System.out.println("Allowed");
      }
      else{
      System.out.println("Access denied");
      }


   }
  public static void main(String[]args){
     checkAge(20);
  }
}