package dayElifHoca;

public class C04 {

    public static void main(String[] args) {
        String gun = "Sali";
        switch (gun) {

            case "Pazartesi":
            case "Sali":
                System.out.println("Java Dersi");
                break;

            case "Carsamba":
            case "Cumartesi":
                System.out.println("Sql dersi");
                break;
            case "Persembe":
            case "Cuma":
                System.out.println("Selenyum dersi ");
                break;

            default:
        }
        System.out.println("Izin gunum");


    }
}