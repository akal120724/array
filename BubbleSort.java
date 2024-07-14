import java.util.*;
class BubbleSort{
  public static void main(String[]args){
    Scanner obj= new Scanner(System.in);
    int size= obj.nextInt();
    int []arr= new int[size];
    int pass, itr,temp;
    for(itr=0;itr<size;itr++)
      arr[itr]=obj.nextInt();
    for(pass=0;pass<size-1;pass++){
      for(itr=0;itr<size-1-pass;itr++){
        if(arr[itr]>arr[itr+1]){
          temp=arr[itr];
          arr[itr]=arr[itr+1];
          arr[itr+1]= temp;
        }
      }
    }
    for(int i: arr)
      System.out.print(i + " ");
  }
}
  
    
