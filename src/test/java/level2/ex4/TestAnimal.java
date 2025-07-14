package level2.ex4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class TestAnimal {
    Animal animal1;
    Animal animal2;
    Animal animal3;

    @BeforeEach
    public void setUp() {
        animal1 = new Animal("Dog");
        animal2 = new Animal("Cat");
        animal3 = new Animal("Dolphin");
    }

    @Test
    public void testSortedByAdd() {
        List<Animal> animals = List.of(animal1, animal2, animal3);
        assertThat(animals).containsExactly(animal1, animal2, animal3);
    }

    @Test
    public void testSortedAnyOrder() {
        List<Animal> animals = List.of(animal1, animal2, animal3);
        assertThat(animals).containsExactlyInAnyOrder(animal3, animal1, animal2);
    }

    @Test
    public void testAddOneAddCheckIfOnlyOnceTimeAdd() {
        Animal animal4 = new Animal("Elephant");
        List<Animal> animals = List.of(animal1, animal2, animal3);
        assertThat(animals).containsOnlyOnce(animal1);
    }

    @Test
    public void testNotAddOneAndCheckIfContains() {
        Animal animal4 = new Animal("Elephant");
        List<Animal> animals = List.of(animal1, animal2, animal3);
        assertThat(animals).doesNotContain(animal4);
    }
}
