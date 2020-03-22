package com.smc.immutables.idtypeswithgenerics.approach1;

import org.immutables.value.Value;

@Value.Immutable
public abstract class CompoundEntity1 {

    public abstract ID getEntity1Id();

    public abstract ID getEntity2Id();

}
