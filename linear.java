import java.util.*;
class linear
  {
    public static void linear(int arr[],int key){
      int i,count=0;
      for(i=0;i<arr.length;i++)
        {
          if(arr[i]==key){
            count++;
            break;
          }
        }
      if(count>0){
          System.out.println("index pos="+i);
        }
      else{
        System.out.println("element not found");
      }
    }
      public static void main(String args[]){
        int arr[]={12,23,56,65,21};
         Scanner sc=new Scanner(System.in);
         int key=sc.nextInt();
         linear(arr,key);
    }
  }
  