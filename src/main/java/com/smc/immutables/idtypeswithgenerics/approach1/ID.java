package com.smc.immutables.idtypeswithgenerics.approach1;

import org.immutables.value.Value;

@Value.Immutable
public abstract class ID {

    public abstract String getValue();

}
