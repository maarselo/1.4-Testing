package level2.ex2;

import java.util.Objects;

public class Person {
        private int id;

        public Person(int id) {
            this.id = id;
        }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return id == person.getId();
    }

    public int getId() {return id;}

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}