package lld.practise.hotelBooking.model;

import java.util.Date;

public class Room {
    private RoomType roomType;
    private Date bookingStartDate;
    private Date bookingEngDate;
    private boolean availability;

    public Room(RoomType roomType, Date bookingStartDate, Date bookingEngDate) {
        this.roomType = roomType;
        this.bookingStartDate = bookingStartDate;
        this.bookingEngDate = bookingEngDate;
        this.availability = true; // always room will be created in default availability
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Date getBookingStartDate() {
        return bookingStartDate;
    }

    public void setBookingStartDate(Date bookingStartDate) {
        this.bookingStartDate = bookingStartDate;
    }

    public Date getBookingEngDate() {
        return bookingEngDate;
    }

    public void setBookingEngDate(Date bookingEngDate) {
        this.bookingEngDate = bookingEngDate;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
