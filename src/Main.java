import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Convertor Project");
        System.out.println("Version 1.0");

        int km = 15;
        int mills = 20;

        System.out.println(km + " кілометрів це " + convertKmToMills(km) + ". А " + mills + " миль в кілометрах, це " + convertMillsToKm(mills) + ".");
    }
    public static double convertKmToMills(int km) {
        return km * 0.621371;
    }
    public static double convertMillsToKm(int Mills) {
        return Mills * 1.60934;
    }
}