/**
 *  Author: Nick McCrory
 *  Date: 3/9/2017
 */

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class StackTest {

    @Test
    public void shouldCreateEmptyStack() {
        Stack s = new Stack();
        assertThat(s.getCount(), is(0));
    }

    @Test
    public void shouldCreateNonEmptyStack() {
        Stack s = new Stack(8);
        assertThat(s.getCount(), is(1));
        assertThat(s.peek(), is(8));
    }

    @Test
    public void shouldPushNodesToStack() {
        Stack s = new Stack();
        s.push(0);
        s.push(1);
        s.push(100);
        s.push(-1);
        s.push(-100);
        assertThat(s.getCount(), is(5));
    }

    @Test
    public void shouldPopNodeFromStack() {
        Stack s = new Stack();
        s.push(1);
        s.push(100);
        s.pop();
        assertThat(s.getCount(), is(1));
        assertThat(s.peek(), is(1));
    }
}
