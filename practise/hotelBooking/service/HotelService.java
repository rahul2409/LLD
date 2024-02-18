package lld.practise.hotelBooking.service;

import lld.practise.hotelBooking.model.Hotel;
import lld.practise.hotelBooking.model.Room;
import lld.practise.hotelBooking.repository.HotelManager;
import lld.practise.hotelBooking.repository.HotelManagerImpl;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
    private HotelManager hotelManager;

    public HotelService() {
        this.hotelManager = new HotelManagerImpl();
    }

    public List<Room> getRoomsBasedOnInput(Room r){
        List<Hotel> getAllHotels = hotelManager.getAllHotels();
        List<Room> getAllRoomsInAllHotel = new ArrayList<>();
        for(Hotel h: getAllHotels){
            for(Room room: hotelManager.getAllHotelRooms(h)){
                if(room.getBookingEngDate().compareTo(r.getBookingStartDate()) < 0
                        && room.getBookingStartDate().compareTo(room.getBookingEngDate()) > 0
                        && room.getRoomType() == r.getRoomType()
                ){
                    // Room is available. Add in list and return.
                    getAllRoomsInAllHotel.add(room);
                }
            }
        }
        return getAllRoomsInAllHotel;
    }
}
