package com.smc.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author seshu
 */

public class FooMain {

    public static final void main(String[] args) {
        Foo f1 = new Foo();f1.value = 20;
        Foo f2 = new Foo();f2.value = 10;
        Foo f3 = new Foo();f3.value = 30;

        List<Foo> before = Arrays.asList(f1, f2, f3);
        System.out.println(before);
        Collections.sort(before, new FooComparator());
        System.out.println(before);
    }
}
