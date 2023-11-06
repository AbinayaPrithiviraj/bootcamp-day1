import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Square;
import org.junit.jupiter.api.Test;
import java.math.BigInteger;

public class SquareTest {

    @Test
    void shouldCalculateAreaOfASquare_thenAssetArea(){
        Square square = new Square(10);
        BigInteger area = square.calculateArea();
        assertEquals(100, area.longValue());
    }

        @Test
    void shouldCalculatePerimeterOfASquare_thenAssetPerimeter(){
        Square square = new Square(10);
        BigInteger perimeter = square.calculatePerimeter();
        assertEquals(40, perimeter.longValue());
    }
    
}
