package neu.edu.ccs.cs5010;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyPriorityQueueTest {


    private MyPriorityQueue pQueue1;
    private MyPriorityQueue pQueue2;
    private MyPriorityQueue pQueue3;
    private MyPriorityQueue pQueue4;

    @Before
    public void setUp() throws Exception {
        pQueue1 = new MyPriorityQueue();
        pQueue2 = new MyPriorityQueue();
        pQueue3 = new MyPriorityQueue();
        pQueue4 = new MyPriorityQueue();
    }

    @Test
    public void remove() throws Exception {
        for (int i = 1; i <= 5; i++) {
            pQueue1.insert(i);
        }
        int removeValue = (int) pQueue1.remove();
        assertEquals(5, removeValue, 0);
    }

    @Test
    public void insert() throws Exception {

        for (int i = 1; i <= 3; i++) {
            pQueue2.insert(i);
        }
        assertEquals(3, (int) pQueue2.front(), 0);
    }

    @Test
    public void front() throws Exception {
        for (int i = 1; i <= 10; i++) {
            pQueue3.insert(i);
        }
        assertEquals(10, (int) pQueue3.front(), 0);
        pQueue3.insert(15);
        assertEquals(15, (int) pQueue3.front(), 0);
    }

    @Test
    public void isEmpty() throws Exception {
        assertEquals(true, pQueue4.isEmpty());
    }
}