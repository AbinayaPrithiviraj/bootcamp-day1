import org.example.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigInteger;

public class RectangleTest {

    @Test
    void shouldCalculateAreaOfARectangle(){
        Rectangle rectangle = new Rectangle();
        BigInteger area = rectangle.computeArea(3,5);
        assertEquals(15,area.longValue());
    }
    @Test
    void shouldThownExceptionOnNegativeNumber(){
        Rectangle rectangle = new Rectangle();
        Exception exception = assertThrows(NumberFormatException.class, () -> 
                                                rectangle.computeArea(-3,5));
        assertEquals("Positive Number are allowed", exception.getMessage());
    }

    @Test
    void shouldCalculateAreaOfARectangleResultExceedsTheIntegerRange(){
        Rectangle rectangle = new Rectangle();
        BigInteger area = rectangle.computeArea(2147483647,2147483647);
        assertEquals(2147483647*2147483647,area.longValue());
    }
}
