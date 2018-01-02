package java;

import com.adityasharat.java.lesson5.Functions;
import org.junit.jupiter.api.Test;

/**
 * @author Aditya Sharat
 */
class ConvertTest {

    @Test
    public void run() {
        String result = Functions.convert("A", 16, 10);
        System.out.println(result);
    }
}