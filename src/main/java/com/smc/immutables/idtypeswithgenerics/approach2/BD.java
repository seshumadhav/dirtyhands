package com.smc.immutables.idtypeswithgenerics.approach2;

import org.immutables.value.Value;

@Value.Immutable
public abstract class BD<E extends HasID> {

    public abstract String getValue();

}
