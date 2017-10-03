package neu.edu.ccs.cs5010;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zontakm on 9/12/2017.
 * This is a DUMMY implementation of Queue ADT
 */
public class MyQueue implements IQueue {


    List<Integer> list;

    public MyQueue() {
        list = new ArrayList<Integer>();
    }

    public IQueue enqueue(int elt) {
        list.add(elt);
        return this;
    }

    public IQueue dequeue() {
        list.remove(0);
        return this;
    }

    public int front() {
        return list.get(0);
    }

    public boolean isEmpty() {
        if(list.size()==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){

        IQueue queue1=new MyQueue();
        for(int i=0;i<10;i++){
            queue1.enqueue(2*i);
            System.out.println(queue1.front());
        }
    }
}
