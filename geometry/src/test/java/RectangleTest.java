import org.example.Quadrilateral;
import org.example.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigInteger;

public class RectangleTest {

    @Test
    void shouldInitializeARectangleWithNegativeValue_thenThownNumberFormatException(){
        Exception exception = assertThrows(NumberFormatException.class, () -> 
                                                new Rectangle(-2,3));
        assertEquals(Quadrilateral.POSTIVE_NUM_EXCEPTION, exception.getMessage());
    }
    @Test
    void shouldCalculateAreaOfARectangle_thenAssetArea(){
        Quadrilateral rectangle = new Rectangle(2,3);
        BigInteger area = rectangle.calculateArea();
        assertEquals(6,area.longValue());
    }
    @Test
    void shouldCalculateAreaOfARectangle_thenResultExceedsTheIntegerRange(){
        Quadrilateral rectangle = new Rectangle(2147483647,2147483647);
        BigInteger area = rectangle.calculateArea();
        assertEquals(2147483647*2147483647,area.longValue());
    }
    @Test
    void shouldCalucaltePerimeterOfARectangle_thenAssetPerimeter(){
        Quadrilateral rectangle = new Rectangle(2,3);
        BigInteger perimeter = rectangle.calculatePerimeter();
        assertEquals(10, perimeter.longValue());
    }
    @Test
    void shouldCalucaltePerimeterOfARectangle_thenResultExceedsTheIntegerRange(){
        Quadrilateral rectangle = new Rectangle(2147483647,2147483647);
        BigInteger perimeter = rectangle.calculatePerimeter();
        assertEquals(2*(2147483647+2147483647),perimeter.longValue());
    }
}
