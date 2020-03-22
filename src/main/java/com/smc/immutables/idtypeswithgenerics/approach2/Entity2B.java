package com.smc.immutables.idtypeswithgenerics.approach2;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Entity2B implements HasID {

    public abstract BD<Entity2B> getId();

}
