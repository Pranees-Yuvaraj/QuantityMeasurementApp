public class QuantityMeasurementApp {

    public boolean areFeetEqual(double value1, double value2) {
        return value1 == value2;
    }

    public static void main(String[] args) {
        QuantityMeasurementApp app = new QuantityMeasurementApp();

        double feet1 = 5.0;
        double feet2 = 5.0;

        boolean result = app.areFeetEqual(feet1, feet2);

        System.out.println("Are both measurements equal? " + result);
    }
}