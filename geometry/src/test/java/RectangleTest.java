import org.example.Rectangle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigInteger;

public class RectangleTest {

    static Rectangle rectangle;
    @BeforeAll
    static void initSetUp(){
        rectangle = new Rectangle();
    }

    @Test
    void shouldCalculateAreaOfARectangle_thenAssetResult(){
        BigInteger area = rectangle.calculateArea(3,5);
        assertEquals(15,area.longValue());
    }
    @Test
    void shouldCalculateAreaOfARectangle_thenThownExceptionOnNegativeNumber(){
        Exception exception = assertThrows(NumberFormatException.class, () -> 
                                                rectangle.calculateArea(-3,5));
        assertEquals(Rectangle.POSTIVE_NUM_EXCEPTION, exception.getMessage());
    }
    @Test
    void shouldCalculateAreaOfARectangle_thenResultExceedsTheIntegerRange(){
        BigInteger area = rectangle.calculateArea(2147483647,2147483647);
        assertEquals(2147483647*2147483647,area.longValue());
    }
}
