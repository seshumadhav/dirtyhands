package com.smc.comparator;

import java.util.Comparator;

/**
 * @author seshu
 */

public class FooComparator implements Comparator<Foo> {

    @Override
    public int compare(Foo o1, Foo o2) {
        return o1.value - o2.value;
    }
}
