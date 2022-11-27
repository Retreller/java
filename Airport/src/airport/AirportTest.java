package airport;

import airport.Service.Airportservice;
import airport.model.Plane;

public class AirportTest {
    public static void main(String[] args) {
        Airportservice service = new Airportservice();
        Plane plane = service.createPlane();
//        service.printNameORYear(plane);
//        Plane pl2 = service.createPlane();
//        Plane pl3 = service.createPlane();
//        Plane[] planes = {plane, pl2, pl3};
//        service.printPlaneArray(planes);
//        service.printMilitaryPlanesAfter2010(planes);

//        System.out.println(service.nameOfPlaneWithBiggerTime(plane,pl2));
//        service.planeWithBiggerName(plane, pl2).printInfo();
        plane.getName();

    }
}
