package level1.ex3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestArrayAccess {

    @Test
    public void testArrayExceptionIndexOutOfBounds() {
        int[] data = {1, 2, 3};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> ArrayAccess.getElement(5, data));
    }
}
