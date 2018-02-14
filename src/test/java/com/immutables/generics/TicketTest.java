package com.immutables.generics;

import com.immutables.generics.noimmutables.TicketItem;
import org.junit.Assert;
import org.junit.Test;

public class TicketTest {

    @Test
    public void testTicketItemCreationTheBadWay() {
        TicketItem item = new TicketItem();

        item.setTicketId(new ETicketId());
        Assert.assertEquals("eTicket", item.getTicketId().getTicketType());

        item.setTicketId(new PaperTicketId());
        Assert.assertEquals("PaperTicket", item.getTicketId().getTicketType());
    }

    @Test
    public void testTicketItemCreationTheRecommendedWay() {
        // Forcing TicketItem to contain only TicketIds of type PaperTicketId
        TicketItem<PaperTicketId> item = new TicketItem<>();

        // This gives a compile error
        // item.setTicketId(new ETicketId());
        // Assert.assertEquals("eTicket", item.getTicketId().getTicketType());

        item.setTicketId(new PaperTicketId());
        Assert.assertEquals("PaperTicket", item.getTicketId().getTicketType());
    }
}
