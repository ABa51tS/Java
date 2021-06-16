package Aircraft;

public class Main {
    public static void main(String[] args) {
        /*
        aircraft cessna172 = new aircraft();             // Creates object of class aircraft

        aircraft piperSaratoga = new aircraft();            // Creates another object of class aircraft
        */

        aircraft cessna172 = new aircraft(4, 140, 56.5, 9.5);

        double cessna172Endurance;

        /*
        cessna172.passenger = 4;
        cessna172.cruiseSpeed = 140;
        cessna172.fuelCapacity = 56.5;
        cessna172.fuelBurnRate = 9.5;

        /* System.out.println("Cessna172 passengers: " + cessna172.passenger);
            System.out.println("Cessna172 fuel capacity: " + cessna172.fuelCapacity + "gph\n");
        */
        /*
        piperSaratoga.passenger = 10;
        piperSaratoga.cruiseSpeed = 206;
        piperSaratoga.fuelCapacity = 102.5;
        piperSaratoga.fuelBurnRate = 20.5;
        */
        /* System.out.println("pipersaratoga cruise speed: " + piperSaratoga.cruiseSpeed + "mph");
            System.out.println("pipersaratoga fuel burn rate: " + piperSaratoga.fuelBurnRate + "gph");

         */

        // how many hours will a plane stay in the air?

        //cessna172Endurance = cessna172.fuelCapacity / cessna172.fuelBurnRate;

        //System.out.print("A cessna172 can stay in the air for" + cessna172Endurance + "hours");

        System.out.println("Cessna172");
        cessna172.calculateEndurance();

        System.out.println("Piper");
        //System.out.println(piperSaratoga.calculateEndurance());
    }
}

class aircraft {
    int passenger;              // number of people
    int cruiseSpeed;            // miles per hour
    double fuelCapacity;        // gallons
    double fuelBurnRate;        // gallons per hour
    // method to calculate aircraft endurance

    aircraft(int p, int c, double fc, double fbr) {
        passenger = p;
        cruiseSpeed = c;
        fuelCapacity = fc;
        fuelBurnRate = fbr;
    }


    double calculateEndurance() {
        return fuelCapacity / fuelBurnRate;


    }

    double fuelNeeded(double time) {
        return fuelBurnRate * time;
    }
}
