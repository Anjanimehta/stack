package l1;

import java.util.Arrays;

public class L1
{
    int[] list= new int[10];
    public static void main(String[] args) {
        L1 l= new L1();

        System.out.println(Arrays.toString(l.list));
        l.insert(42);
        System.out.println(Arrays.toString(l.list));
        l.insert(43);
        l.insert(45);
        l.insert(20);
        l.insert(45);
        l.insert(48);
        l.insert(43);
        System.out.println(Arrays.toString(l.list));
        l.remove(2);
        System.out.println(Arrays.toString(l.list));
       // l.isEmpty();
        System.out.println(l.isEmpty());
        //l.isFull();
        System.out.println(l.isFull());

    }
    void insert(int value){
        for(int i=0;i<list.length;i++){
            if(list[i]==0)
            {
                list[i]=value;
                break;//one data item at a location
            }
        }
    }
    void remove(int index){
        for (int i = index; i < list.length-1; i++) {
            list[i]=list[i+1];

        }
        list[list.length-1]=0;
    }
    boolean isEmpty(){
        if(list[0]==0)
        {
            return true;
        }
        else{
            return false;
        }
    }

    boolean isFull(){
        if(list[list.length-1]==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
