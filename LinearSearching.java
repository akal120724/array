import java.util.*;
class LinearSearching {
    public static void main(String[]args){
        Scanner obj= new Scanner(System.in);
        int size= obj.nextInt();
        int []arr= new int[size];
        int itr;
        for(itr=0;itr<size;itr++)
            arr[itr]=obj.nextInt();
        int key=obj.nextInt();
        for(itr=0;itr<size;itr++){
          if(arr[itr]==key)
            break;
        }
      if(arr[itr]==key){
        System.out.print("found  " + arr[itr]);
      }else{
        System.out.print("Not Found");
      }
    }
}
      
