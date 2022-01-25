/**
 * @uthor: Vinit Kumar
 * @created on: 25-Jan-2021
 * Hotel Reservation System
 */
package hotelreservationsytem;

import java.util.ArrayList;

public class HotelReservationSystem {
    //initialize array
    public static ArrayList<Hotel> hotelList = new ArrayList<>();

    /**
     * add hotel
     * takes name and rate
     * checks validation add or throw exception
     * @param name
     * @param rate
     * @return
     * @throws HotelReservationException
     */
    public static boolean addHotel(String name, double rate) throws HotelReservationException {
        if(name!=null && name!=""){
            hotelList.add(new Hotel(name, rate));
            return true;
        }else{
            throw new HotelReservationException("Invalid Input");
        }
    }
}

