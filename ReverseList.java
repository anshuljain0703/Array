import java.util.ArrayList;
import java.util.Collections;
public class ReverseList {
    // static void reverselist(ArrayList<Integer> list){
    // //     int i=0;
    // //     int j=list.size()-1;
    // //     while(i<j){
    // //         Integer temp=Integer.valueOf(list.get(i));
    // //         list.set(i,list.get(j));
    // //         list.set(j,temp);

    // //         i++;
    // //         j--;
    // //     }
    // // }
    public static void main(String [] args){
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Original list:"+list);
        Collections.reverse(list);
    
        System.out.println("Reverse list:"+list);
        System.out.println("Sorting in ascending order:"+list);
        Collections.sort(list);
        System.out.println("Sorting in descending order:"+list);
        Collections.sort(list,Collections.reverseOrder());
    }
    
}
