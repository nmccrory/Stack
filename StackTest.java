/**
 *  Author: Nick McCrory
 *  Date: 3/9/2017
 */

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class StackTest {

    @Test
    public void shouldCreateStack() {
        Stack s = new Stack();
        assertThat(s.getCount(), is(0));
    }
}
