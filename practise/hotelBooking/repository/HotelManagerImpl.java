package lld.practise.hotelBooking.repository;

import lld.practise.hotelBooking.model.Hotel;
import lld.practise.hotelBooking.model.Room;

import java.util.List;

public class HotelManagerImpl implements HotelManager{
    private List<Hotel> hotels;

    @Override
    public List<Hotel> getAllHotels() {
        return hotels;
    }

    @Override
    public Hotel addHotel(Hotel h) {
        // Logic for adding the hotel
        hotels.add(h);
        return h;
    }

    @Override
    public void addRooms(Hotel h, Room r) {
        List<Room> getAllHotelRooms = h.getAssociatedRooms();
        getAllHotelRooms.add(r);
        h.setAssociatedRooms(getAllHotelRooms);
    }

    @Override
    public List<Room> getAllHotelRooms(Hotel h) {
        return h.getAssociatedRooms();
    }
}
