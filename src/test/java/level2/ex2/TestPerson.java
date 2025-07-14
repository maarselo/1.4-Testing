package level2.ex2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestPerson {
    @Test
    void    TestSameReference() {
        Person person1 = new Person(4);
        Person person2 = person1;
        assertThat(person1).isSameAs(person2);
    }
    @Test
    void    TestDifferentReference() {
        Person person1 = new Person(4);
        Person person2 = new Person(4);
        assertThat(person1).isNotSameAs(person2);
    }
}
