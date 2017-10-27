package deqo.mrou.mysimplestack;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rlm0843a on 19/10/2017.
 */
public class StackImplTest {

    @Test
    public void TestEmpty(){
        StackImpl s = new StackImpl();
        assertTrue(s.isEmpty());
    }

    @Test
    public void TestPushPop(){
        StackImpl s = new StackImpl();
        s.push(new Item());
        s.pop();
        assertTrue(s.isEmpty());
    }

    @Test
    public void TestPopPush(){
        StackImpl s = new StackImpl();
        s.push(new Item());
        s.pop();
        s.push(new Item());
        assertFalse(s.isEmpty());
    }
}