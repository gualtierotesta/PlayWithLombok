package it.gualtierotesta.playwithlombok;

import lombok.val;
import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Unit test
 */
public class ValTest {

    @Test
    public void testList() throws Exception {
        // given
        val list = new java.util.ArrayList<String>();
        list.add("a value");
        // when + then
        Assertions.assertThat(list)
                .isInstanceOf(java.util.ArrayList.class)
                .isNotEmpty();
    }

    @Test
    public void testMap() throws Exception {
        // given
        val map = new java.util.HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        // when + then
        Assertions.assertThat(map)
                .isInstanceOf(java.util.HashMap.class)
                .containsKeys(0, 5);
    }

    @Test
    public void testBigDecimal() throws Exception {
        // given
        val map = java.math.BigDecimal.valueOf(13l);
        // when + then
        Assertions.assertThat(map)
                .isInstanceOf(java.math.BigDecimal.class)
                .isEqualTo("13");
    }
}