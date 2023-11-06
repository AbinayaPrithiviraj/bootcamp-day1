import org.example.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {

    @Test
    void shouldCalculateAreaOfARectangle(){
        Rectangle rectangle = new Rectangle();
        Integer area = rectangle.computeArea(3,5);
        assertEquals(15,area);
    }
    @Test
    void shouldThownExceptionOnNegativeNumber(){
        Rectangle rectangle = new Rectangle();
        Exception exception = assertThrows(NumberFormatException.class, () -> 
                                                rectangle.computeArea(-3,5));
        assertEquals("Positive Number are allowed", exception.getMessage());
    }
}
