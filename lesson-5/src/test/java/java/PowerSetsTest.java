package java;

import com.adityasharat.java.lesson5.Functions;
import org.junit.jupiter.api.Test;

import java.util.StringJoiner;
import java.util.stream.Stream;

/**
 * @author Aditya Sharat
 */
class PowerSetsTest {

    @Test
    public void run() {
        String[][] sets = Functions.powersets(new String[]{"A", "B", "C", "D"});

        Stream.of(sets).forEach(set -> {
            StringJoiner joiner = new StringJoiner(" ");
            Stream.of(set).forEach(joiner::add);
            System.out.println(joiner.toString());
        });
    }

}