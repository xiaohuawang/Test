package neu.edu.ccs.cs5010;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyQueueTest {
    IQueue queue1,queue2,queue3,queue4,queue5,queue6,queue7;
    @Before
    public void setUp() throws Exception {
        queue1 = new MyQueue();
        queue2 = new MyQueue();
        queue3 = new MyQueue();
        queue4 = new MyQueue();
        queue5 = new MyQueue();
        queue6 = new MyQueue();
        queue7 = new MyQueue();
    }

    @Test
    public void enqueueSuccessful() throws Exception {
        assertEquals(true,queue1.isEmpty());
        queue1.enqueue(1);
        queue1.enqueue(2);
        assertEquals(queue1.front(),1);
        assertEquals(false,queue1.isEmpty());
    }


    @Test
    public void dequeueTest() throws Exception {
        assertEquals(true,queue2.isEmpty());
        int i = 5;
        while(i > 0) {
            queue2.enqueue(9);
            i--;
        }
        assertEquals(9,queue2.front(),0);
    }


    @Test
    public void frontTest() throws Exception {
        queue3.enqueue(-1);
        assertEquals(-1,queue3.front(),0);
        queue3.dequeue();
    }

    @Test
    public void isEmpty() throws Exception {
        assertEquals(true,queue2.isEmpty());
        assertEquals(true,queue3.isEmpty());
        assertEquals(true,queue4.isEmpty());
    }

    @Test
    public void integrationTest1() throws Exception {
        assertEquals(true,queue5.isEmpty());
        for(int i=0;i<10;i++){
            queue5.enqueue(2*i);
            assertEquals(0,queue5.front(),0);
        }

        assertEquals(false,queue5.isEmpty());
        for(int i=0;i<10;i++){
            assertEquals(2*i,queue5.front(),0);
            queue5.dequeue();
        }
        assertEquals(true,queue5.isEmpty());
    }

    @Test
    public void integrationTest2() throws Exception {
        assertEquals(true, queue6.isEmpty());
        for (int i = 0; i < 10; i++) {
            queue6.enqueue(5 * i);
            assertEquals(0, queue6.front(), 0);
        }

        queue6.dequeue();
        queue6.dequeue();
        assertEquals(10, queue6.front(), 0);

        for (int i = 10; i < 15; i++) {
            queue6.enqueue(5 * i);
            assertEquals(10, queue6.front(), 0);
        }
        assertEquals(10, queue6.front(), 0);
        assertEquals(false, queue6.isEmpty());

        for (int i = 2; i < 15; i++) {
            assertEquals(5 * i, queue6.front(), 0);
            queue6.dequeue();
        }
        assertEquals(true, queue6.isEmpty());
    }

    @Test
    public void integrationTest3() throws Exception {
        assertEquals(true, queue7.isEmpty());

        queue7.enqueue(3);
        queue7.enqueue(10);

        assertEquals(3, queue7.front(), 0);
        queue7.dequeue();
        assertEquals(10, queue7.front(), 0);
        queue7.dequeue();

        assertEquals(true, queue7.isEmpty());

        queue7.enqueue(3);
        queue7.dequeue();

        assertEquals(true, queue7.isEmpty());
    }

}
