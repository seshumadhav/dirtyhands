package com.immutables.generics.noimmutables;

import com.immutables.generics.TicketId;

public class TicketItem<E extends TicketId> {

    private E ticketId;

    private String otherData;

    public TicketItem() {
    }

    public E getTicketId() {
        return ticketId;
    }

    public void setTicketId(E ticketId) {
        this.ticketId = ticketId;
    }

    public String getOtherData() {
        return otherData;
    }

    public void setOtherData(String otherData) {
        this.otherData = otherData;
    }
}
