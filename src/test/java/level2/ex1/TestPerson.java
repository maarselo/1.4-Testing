package level2.ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestPerson {
    private Person person1;
    private Person person2;
    private Person person3;

    @BeforeEach
    void setUp() {
        person1 = new Person(5);
        person2 = new Person(5);
        person3 = new Person(10);
    }

    @Test
    void testTwoPersonsAreEqualByValue() {
        assertThat(person1).isEqualTo(person2);
    }

    @Test
    void testTwoPersonsAreNotEqualByValue() {
        assertThat(person1).isNotEqualTo(person3);
    }
}
