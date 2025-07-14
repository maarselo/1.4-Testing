package level2.ex5;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import static org.assertj.core.api.Assertions.assertThat;

public class TestMap {
    @Test
    public void TestMapIfContainsKey() {
        HashMap<String, Integer> children = new HashMap<String, Integer>();
        children.put("Marcelo", 18);
        children.put("Alejandra", 17);
        assertThat(children).containsKey("Marcelo");
    }
}
