package lld.practise.hotelBooking.repository;

import lld.practise.hotelBooking.model.Hotel;
import lld.practise.hotelBooking.model.Room;

import java.util.List;

public interface HotelManager {
    List<Hotel> getAllHotels();
    Hotel addHotel(Hotel h);
    void addRooms(Hotel h, Room r);
    List<Room> getAllHotelRooms(Hotel h);
}
