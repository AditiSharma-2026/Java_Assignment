abstract class Ride {
    double distance;

    Ride(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();
}

// Bike Ride
class BikeRide extends Ride {
    BikeRide(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 25;
    }
}

// Auto Ride
class AutoRide extends Ride {
    AutoRide(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 28;
    }
}

// Car Ride
class CarRide extends Ride {
    CarRide(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 12;
    }
}

// Main Class
public class RideBookingApp {
    public static void main(String[] args) {

        Ride[] rides = new Ride[3];

        rides[0] = new BikeRide(10);   // 10 km
        rides[1] = new AutoRide(8);    // 8 km
        rides[2] = new CarRide(15);    // 15 km

        for (Ride r : rides) {
            System.out.println("Fare: ₹" + r.calculateFare());
        }
    }
}
