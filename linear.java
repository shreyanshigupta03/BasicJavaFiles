import java.util.Scanner;
public class linear{
  public static void main(String[] args){

   int a[]={10, 23, 40, 1, 2, 0, 14, 13, 50, 9};
   int x ;
   int i;
   Scanner sc=new Scanner(System.in); 
   int item=sc.nextInt();
   System.out.println("Enter the item to be found=" + item);
    for(i=0;i<10;i++)
      {
         if(a[i]==item){

               x = i + 1;
               

          }
         else{
             x = 0;
            }

     
       if ((x != 0 )){
           System.out.println("Item found at location=" + x );
                   }
      
    }
  }
}