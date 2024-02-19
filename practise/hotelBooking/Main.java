package lld.practise.hotelBooking;

/*
* Design a logic for fetching all the rooms
* User input startDate, endDate, roomType
* User output list of rooms based on type for different hotels.
* */

import lld.practise.hotelBooking.model.Room;
import lld.practise.hotelBooking.model.RoomType;
import lld.practise.hotelBooking.service.HotelService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {
    public Date parseInputDate(String date) {
        Date answerDate = null;
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            answerDate = dateFormat.parse(date);
        } catch(ParseException e){
            System.out.println("Parse Exception handling done here: " + e);
        }
        return answerDate;
    }
    public static void main(String[] args) {
        // The input is a room which users are searching
        HotelService hotelService = new HotelService();
        Main main = new Main();

        String bookingStartDate = "24/09/2024";
        String bookingEndDate = "26/09/2024";

        Room inputRoom = new Room(RoomType.SINGLE, main.parseInputDate(bookingStartDate), main.parseInputDate(bookingEndDate));
        List<Room> rooms = hotelService.getRoomsBasedOnInput(inputRoom);
        if(rooms == null){
            System.out.println("All the rooms are occupied for this input.");
        }
    }
}
