package level2.ex3;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestArrayIntegers {
    @Test
    public void checkIfTwoSameArraysIntegersAreEquals() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        assertThat(a).isEqualTo(b);
    }
}
