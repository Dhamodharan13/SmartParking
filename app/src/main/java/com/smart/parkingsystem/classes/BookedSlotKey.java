package com.smart.parkingsystem.classes;

public class BookedSlotKey {
    public BookedSlots bookedSlots;
    public String key;

    public BookedSlotKey(){}
    public BookedSlotKey(BookedSlots bookedSlots, String key){
        this.bookedSlots=bookedSlots;
        this.key=key;
    }
}

