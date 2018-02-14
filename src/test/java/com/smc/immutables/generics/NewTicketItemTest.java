package com.smc.immutables.generics;

import com.smc.immutables.generics.withimmutables.ImmutableNewTicketItem;
import org.junit.Assert;
import org.junit.Test;

public class NewTicketItemTest {

    @Test
    public void testNewImmutableTicketItemCreation() {
        ImmutableNewTicketItem<TicketId> newEticketItem = ImmutableNewTicketItem.builder()
                .ticketId(new ETicketId())
                .otherData("Some other details")
                .build();
        Assert.assertEquals("eTicket", newEticketItem.getTicketId().getTicketType());
    }
}
