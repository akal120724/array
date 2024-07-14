import java.util.*;
class LeftRotate{
  public static void main(String[]args){
    Scanner ob=new Scanner(System.in);
    int num=ob.nextInt();
    int pv=1;
    int temp= num;
    while(num!=0){
      pv *=10;
      num/=10;
    }
    int rot_time=3;
    int rot_num=temp;
    for(int itr=1; itr<=rot_time;itr++){
      rot_num = (rot_num % 10)* pv + (rot_num / 10);
    }
    System.out.print(rot_num);
  }
}
        
