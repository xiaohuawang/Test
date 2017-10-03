package neu.edu.ccs.cs5010;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * created by Xiaohua Wang
 * use different stack to test the functions of the MyStack and if either one can't pass testcase
 * we will look into detail of the MyStack methods
 */

public class MyStackTest {
    private IStack stack1,stack2,stack3,stack4,stack5,stack6;
    @Before
    public void setUp() throws Exception {
        stack1 = new MyStack();
        stack2 = new MyStack();
        stack3 = new MyStack();
        stack4 = new MyStack();
        stack5 = new MyStack();
        stack6 = new MyStack();
    }

    @Test
    public void pushSuccessfulTest() throws Exception {
        stack1.push(10);
        assertEquals(10,stack1.top(),0);
        stack1.push(15);
        assertEquals(15,stack1.top(),0);
        stack1.pop();
        assertEquals(10,stack1.top(),0);
        stack1.pop();
        assertEquals(true,stack1.isEmpty());
    }


    @Test
    public void popsuccessfultest() throws Exception {
        stack2.push(5000);
        stack2.pop();
        assertEquals(true,stack3.isEmpty());
    }

    @Test
    public void top() throws Exception {
        stack3.push(20);
        stack3.push(30);
        assertEquals(30,stack3.top(),0);
    }

    @Test
    public void isEmpty() throws Exception {
        assertEquals(stack4.isEmpty(),true);
        stack3.push(1);
        stack3.pop();
        assertEquals(stack3.isEmpty(),true);
    }

    @Test
    public void integrationTest1() throws Exception {
        assertEquals(stack5.isEmpty(),true);

        int totalPushTime=10;
        for(int i=1;i<=totalPushTime;i++) {
            stack5.push(i);
            assertEquals(i,stack5.top(),0);
        }

        assertEquals(stack5.isEmpty(),false);

        for(int i=totalPushTime;i>=1;i--) {
            assertEquals(i,stack5.top(),0);
            stack5.pop();
        }
    }

    @Test
    public void integrationTest2() throws Exception {
        assertEquals(stack6.isEmpty(),true);

        for(int i=1;i<=5;i++) {
            stack6.push(i*2);
            assertEquals(i*2,stack6.top(),0);
        }
        assertEquals(stack6.isEmpty(),false);
        assertEquals(10,stack6.top(),0);

        for(int i=0;i<3;i++){
            stack6.pop();
        }

        for(int i=0;i<3;i++){
            stack6.push(15);
        }

        assertEquals(15,stack6.top(),0);

        for(int i=0;i<5;i++){
            stack6.pop();
        }
        assertEquals(stack6.isEmpty(),true);
    }

}