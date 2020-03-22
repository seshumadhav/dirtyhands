package com.smc.immutables.idtypeswithgenerics;

import com.smc.immutables.idtypeswithgenerics.approach2.ImmutableBD;
import com.smc.immutables.idtypeswithgenerics.approach2.ImmutableCompoundEntity2;
import org.junit.Test;

public class TestApproach2 {

    @Test
    public void testGoodCase() {
        ImmutableBD bd1 = ImmutableBD.builder().value("bd1").build();
        ImmutableBD bd2 = ImmutableBD.builder().value("bd2").build();
        ImmutableCompoundEntity2.builder()
                .entity1Id(bd1)
                .entity2Id(bd2)
                .build();
    }

    @Test
    public void testBadCaseAlsoDoesNotFail() {
        ImmutableBD bd1 = ImmutableBD.builder().value("bd1").build();
        ImmutableBD bd2 = ImmutableBD.builder().value("bd2").build();
        ImmutableCompoundEntity2.builder()
                .entity1Id(bd2)
                .entity2Id(bd1)
                .build();
    }
}
