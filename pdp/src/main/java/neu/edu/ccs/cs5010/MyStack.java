package neu.edu.ccs.cs5010;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zontakm on 9/12/2017.
 * This is a dummy implementation of Stack ADT
 */
public class MyStack implements IStack {

    List<Integer> list;

    public MyStack() {
        list = new ArrayList<Integer>();
    }

    public IStack push(int elt) {
        list.add(elt);
        return this;
    }

    public IStack pop() {
        list.remove(list.size() - 1);
        return this;
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        if (list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

}
