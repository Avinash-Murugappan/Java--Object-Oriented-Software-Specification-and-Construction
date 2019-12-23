import org.junit.Test;

import static org.junit.Assert.*;

public class MyStringTest {

    @Test
    public void Test(){
        String str = "";
        MyString obj = new MyString("dog");

        while (obj.hasNext()){
            char a = ' ';
            a = obj.next();
            str +=  a;
        }

        assertEquals("dog", str);

    }



}