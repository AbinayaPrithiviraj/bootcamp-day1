import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.example.Quadrilateral;
import org.example.Square;
import org.junit.jupiter.api.Test;
import java.math.BigInteger;

public class SquareTest {

    @Test
    void shouldInitializeASquareWithNegativeValue_thenThownNumberFormatException(){
        Exception exception = assertThrows(NumberFormatException.class, () -> 
                                                new Square(-2));
        assertEquals(Quadrilateral.POSTIVE_NUM_EXCEPTION, exception.getMessage());
    }
    @Test
    void shouldCalculateAreaOfASquare_thenAssetArea(){
        Quadrilateral square = new Square(10);
        BigInteger area = square.calculateArea();
        assertEquals(100, area.longValue());
    }

    @Test
    void shouldCalculatePerimeterOfASquare_thenAssetPerimeter(){
        Quadrilateral square = new Square(10);
        BigInteger perimeter = square.calculatePerimeter();
        assertEquals(40, perimeter.longValue());
    }
    
}
