import java.util.*;
class Duplicate{
  public static void main(String[]args){
    Scanner obj= new Scanner(System.in);
    int size=obj.nextInt();
    int arr[]=new int[size];
    int i,j,k;
    for(i=0;i<size;i++)
      arr[i]=obj.nextInt();
    for(i=0;i<size;i++){
      for(j=i+1;j<size;j++){
        if(arr[i]==arr[j]){
          for(k=j;k<size-1;k++){
            arr[k]==arr[k+1]{
            }
            size--;
            j--;
          }
        }
      }
      for(i=0;i<size;i++){
        System.out.print(i+" ");
      }
    }
  }
}
    
