import java.util.Scanner;  

public class summ{
 public static void main(String[] args){
  
 int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
//reading the number of elements from the that we want to enter  
n=sc.nextInt();  
//creates an array in the memory of length 10  
int[] array = new int[10];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
 array[i]=sc.nextInt();  
}  
Scanner scc=new Scanner(System.in);
  System.out.println("target");
  int target=scc.nextInt();
for (int l;l<array.length;l++){
  for(int j;j<array.length;j++){
    if(array[j]==target-array[l]){
     //return int[]{l,j};
      System.out.println();
     }
    }
  }
 }
} 