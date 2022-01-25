package hotelreservationsystem;

import hotelreservationsytem.Hotel;
import hotelreservationsytem.HotelReservationSystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    //initialize hotel
    HotelReservationSystem hotel=new HotelReservationSystem();

    //checks add hotel functionality
    @Test
    public void testValidHotel() {
        try {
            Assertions.assertTrue(hotel.addHotel("Lakewood", 110));
            Assertions.assertTrue(hotel.addHotel("Bridgewood", 150));
            Assertions.assertEquals("Invalid Input",hotel.addHotel("",150));
        }catch (Exception e){

        }
    }

}