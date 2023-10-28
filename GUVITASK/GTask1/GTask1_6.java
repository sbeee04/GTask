package GUVITASK.GTask1;

public class GTask1_6 {
  public void pattern(int num){
      for(int i=1;i<=num;i++){
          for(int j=num;j>=1;j--){
              if(j>num-i+1){
                  System.out.print(j);
              }
              else{
                  System.out.print(num-i+1);
              }
          }
          System.out.println();
      }
  }
}
