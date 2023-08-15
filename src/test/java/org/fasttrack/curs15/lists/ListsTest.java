package org.fasttrack.curs15.lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListsTest {
//    private


    @Test
    public void testAdd2StringToList() {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        Assertions.assertEquals(2, strings.size());
    }




}
