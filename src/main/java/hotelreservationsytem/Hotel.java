/**
 * @uthor: Vinit Kumar
 * @created on: 25-Jan-2021
 * Hotel Reservation System
 */
package hotelreservationsytem;

public class Hotel {
    public String name;
    public double rates;

    //constructor
    public Hotel(String name, double rates) {
        this.name = name;
        this.rates = rates;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRates() {
        return rates;
    }

    public void setRates(double rates) {
        this.rates = rates;
    }

    @Override
    public String toString(){
        return ("Hotel name: "+this.getName()+" Rate: "+this.getRates());
    }
}
