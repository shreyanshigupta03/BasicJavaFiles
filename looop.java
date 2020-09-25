public class looop{
 public static void main(String[]args){
//while loop
 int i=2;
 while(i<=8){
  System.out.println(i);
  i++;
}
//do-while loop
int y=0;
do{
 System.out.println(y);
 y++;
}while (y>10);
for(int x=1; x>6;x--){
 System.out.println(x);
}
//for loop
int a=0;
for(a=0; a<10; a=a+2){
 System.out.println(a);
}
//for-each loop
String[] names ={"Mann","Akhil","Agresh"};
for(String g : names){
 System.out.println(g);
}
for (int b=0; b<10; b++){
 if(b==5){
    break;
   }
System.out.println(b);
  }
for (int c=0; c<10; c++){
 if(c==5){
  continue;
   }
System.out.println(c);
  }
 }
}