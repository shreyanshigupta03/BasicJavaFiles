public class ary{
   public static void main(String[]args){
   String[] cars ={"volvo","ford","mazda"};
   System.out.println(cars[2]);
   cars[0]="manza";
   System.out.println(cars[0]);
   
  for(int i=0; i < cars.length; i++){
    System.out.println(cars[i]);
   }
   System.out.println(cars.length);
  for(String j : cars){
  System.out.println(j);
    }
  }
}