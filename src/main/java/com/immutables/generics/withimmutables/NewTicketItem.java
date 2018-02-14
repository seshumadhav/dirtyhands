package com.immutables.generics.withimmutables;

import com.immutables.generics.TicketId;
import org.immutables.value.Value;

@Value.Immutable
public interface NewTicketItem<E extends TicketId> {

    E getTicketId();

    String getOtherData();

}
