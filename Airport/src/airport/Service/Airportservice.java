package airport.Service;

import airport.model.Plane;

import java.util.Scanner;

public class Airportservice {
    public Plane createPlane() {
        Scanner s = new Scanner(System.in);
        Plane plane = new Plane();
        System.out.println("enter the name of the plane");
        plane.setName(s.next());
        System.out.println("enter hours in air");
        plane.setHoursInAir(s.nextInt());
        System.out.println("enter release date of the plane");
        plane.setRealeaseYear(s.nextInt());
        System.out.println("Is the plane military? Y/N");
        String m = s.next().toLowerCase();
        plane.setMilitary(m.charAt(0) == 'y');
        return plane;
    }

    public void printNameAndReleaseDate(Plane plane) {
        System.out.println(plane.getName() + "," + plane.getRealeaseYear());
    }

    public void printNameORYear(Plane plane) {
//        if(plane.getRealeaseYear()>2000)     //long way if, else
//            System.out.println(plane.getName());
//        else
//            System.out.println(plane.getHoursInAir());
        //short way if (?) else(:)
        System.out.println("our calculation leads to this answer " + (plane.getRealeaseYear() > 2000 ? plane.getName() : plane.getHoursInAir()));

    }

    public String nameOfPlaneWithBiggerTime(Plane plane1, Plane plane2) {
//        if (plane1.getHoursInAir()>plane2.getHoursInAir())
//            return plane1.getName();
//        else
//            return plane2.getName();
        return plane1.getHoursInAir() > plane2.getHoursInAir() ? plane1.getName() : plane2.getName();
    }

    public Plane planeWithBiggerName(Plane a, Plane b) {
        if (a.getName().length() > b.getName().length())
            return a;
        return b;
    }

    public void printPlaneArray(Plane[] planes) {
        for (Plane x : planes)
            x.printInfo();
    }

    public void printMilitaryPlanesAfter2010(Plane[] planes) {
        for (Plane x : planes)
            if (x.isMilitary() && x.getRealeaseYear() > 2010)
                x.printInfo();
    }

    public void printNewestMilitary(Plane[] planes) {
      int min=0;
        for (int i = 0; i < Plane.getHoursInAir().lenght ; i++) {

        }

    }
}