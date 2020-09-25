public class mdary{
  public static void main(String[]args){
    int[][] ary ={{1,2,3},{4,5,6}};
    int x= ary[1][2];
    System.out.println(x);
    for(int i = 0; i < ary.length; ++i){
      for(int j= 0;j < ary[i].length; ++j){
        System.out.println(ary[i][j]);
          }
    }

  }
}