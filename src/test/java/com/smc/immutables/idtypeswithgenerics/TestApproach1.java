package com.smc.immutables.idtypeswithgenerics;

import com.smc.immutables.idtypeswithgenerics.approach1.ImmutableCompoundEntity1;
import com.smc.immutables.idtypeswithgenerics.approach1.ImmutableID;
import org.junit.Test;

public class TestApproach1 {

    @Test
    public void testGoodCase() {
        ImmutableID id1 = ImmutableID.builder().value("id1").build();
        ImmutableID id2 = ImmutableID.builder().value("id2").build();
        ImmutableCompoundEntity1.builder()
                .entity1Id(id1)
                .entity2Id(id2)
        .build();
    }

    @Test
    public void testBadCaseAlsoDoesNotFail() {
        ImmutableID id1 = ImmutableID.builder().value("id1").build();
        ImmutableID id2 = ImmutableID.builder().value("id2").build();
        ImmutableCompoundEntity1.builder()
                .entity1Id(id2)
                .entity2Id(id1)
        .build();
    }
}
