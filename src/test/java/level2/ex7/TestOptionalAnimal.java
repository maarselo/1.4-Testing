package level2.ex7;

import level2.ex4.Animal;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

public class TestOptionalAnimal {
    @Test
    public void testAnimalIfItsEmpty() {
        Optional<Animal> animal = Optional.empty();
        assertThat(animal).isEmpty();
    }
}
