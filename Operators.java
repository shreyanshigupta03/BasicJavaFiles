public class Operators{
 public static void main(String[] args) {
 int sum1=15;
 int sum2=sum1+30;
 int sum3=sum1+sum2;
 int sum4=sum3-sum1;
 int sum5=sum4*2;
 int sum6=sum5/sum1;
  ++sum6 ;
  System.out.println(sum3);
  System.out.println(sum4);
  System.out.println(sum5);
  System.out.println(sum6);
  System.out.println(sum6==sum1);
  System.out.println(sum6 != sum1);
  System.out.println(sum6 <= sum1);
  System.out.println(sum6 >= sum1);
  System.out.println(sum6 <8 && sum1>=8);
  System.out.println(sum6 <8 && sum1<=8);
  System.out.println(sum6 <8 || sum1<=8);
  System.out.println (!(sum6 < 8));
}
}