import java.util.*;
class ReverseArray {
    public static void main(String[]args){
        Scanner obj= new Scanner(System.in);
        int size= obj.nextInt();
        int []arr= new int[size];
        int itr;
        for(itr=0;itr<size;itr++)
            arr[itr]=obj.nextInt();
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
     } 
}
}
           
