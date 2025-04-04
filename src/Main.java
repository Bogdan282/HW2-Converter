import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Convertor Project");
        System.out.println("Version 1.0");

        int km = 15;
        int mills = 20;

        System.out.println(mills + " миль це " + convertMillsToKm(mills) + " кілометрів.");
    }
    public static double convertMillsToKm(int mills) {
        return mills * 1.60934;
    }
}