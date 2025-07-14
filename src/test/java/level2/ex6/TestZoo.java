package level2.ex6;

import level2.ex4.Animal;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class TestZoo {
    @Test
    public void testListOfZooThrowsIndexOutOfBounds() {
        Zoo zoo = new Zoo(List.of(new Animal("Dog"), new Animal("Cat"), new Animal("Elephant")));
        assertThatThrownBy(() -> zoo.getAnimalByIndex(5))
                .isInstanceOf(IndexOutOfBoundsException.class);
    }
}
