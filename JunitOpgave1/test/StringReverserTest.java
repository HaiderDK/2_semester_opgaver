import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverserTest {
    @Test
    public void test1 (){
        // dont need to create new object since static...
        StringReverser r = new StringReverser() ;
        r.reverse ("adam");
        assertEquals("adam", StringReverser.reverse("mada"));
    }

    @Test
    public void test2 () {
        assertEquals("meow", StringReverser.reverse("woem"));
    }

    @Test
    public void test3 () {
        assertEquals("abc", StringReverser.reverse("abc"));
    }
}