package com.demo.Booking;

import com.demo.User.User;

import java.util.ArrayList;
import java.util.Objects;

public class BookingService {

    BookingDAO bookingDAO = new BookingDAO();

    public ArrayList<Booking> getBookings(){
        return bookingDAO.getBookings();
    }

    public void addBooking(Booking booking){
        bookingDAO.addBooking(booking);
    }

    public ArrayList<Booking> getBookingsByUserId(String id){
        ArrayList<Booking> res = new ArrayList<>();
        ArrayList<Booking> bookings = bookingDAO.getBookings();

        for (Booking booking : bookings) {
            if (Objects.equals(booking.getUser().getId().toString(), id)) {
                res.add(booking);
            }
        }

        return res;

    }
}
