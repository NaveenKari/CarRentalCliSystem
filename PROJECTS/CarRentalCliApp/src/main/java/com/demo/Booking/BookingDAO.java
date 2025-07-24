package com.demo.Booking;

import java.util.ArrayList;

public class BookingDAO {
    private ArrayList<Booking> bookings = new ArrayList<>();

    public ArrayList<Booking> getBookings(){
        return bookings;
    }

    public void addBooking(Booking booking){
        bookings.add(booking);
    }
}
