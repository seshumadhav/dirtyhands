package com.smc.immutables.idtypeswithgenerics.approach2;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Entity2A implements HasID  {

    public abstract BD<Entity2A> getId();

}
