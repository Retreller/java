package airport.model; 

public class Plane {
    private String name;
    private int realeaseYear;
    private int hoursInAir;
    private boolean isMilitary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRealeaseYear() {
        return realeaseYear;
    }

    public void setRealeaseYear(int realeaseYear) {
        this.realeaseYear = realeaseYear;
    }

    public int getHoursInAir() {
        return hoursInAir;
    }

    public void setHoursInAir(int hoursInAir) {
        this.hoursInAir = hoursInAir;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public void printInfo() {
        System.out.printf("Name- %s, Release year- %d, Hours in Air-%d, Is MIlitary- %s\n",
                name, realeaseYear, hoursInAir, isMilitary ? "yes" : "no");

    }
}

