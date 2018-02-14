package com.smc.immutables.generics.withimmutables;

import com.smc.immutables.generics.TicketId;
import org.immutables.value.Value;

@Value.Immutable
public interface NewTicketItem<E extends TicketId> {

    E getTicketId();

    String getOtherData();

}
