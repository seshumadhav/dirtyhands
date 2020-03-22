package com.smc.immutables.idtypeswithgenerics.approach2;

import org.immutables.value.Value;

@Value.Immutable
public abstract class CompoundEntity2 {

    public abstract BD<Entity2B> getEntity1Id();

    public abstract BD<Entity2A> getEntity2Id();

}
