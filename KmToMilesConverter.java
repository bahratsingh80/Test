import java.io.*;

public class KmToMilesConverter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter distance in kilometers: ");
        double kilometers = Double.parseDouble(reader.readLine());
        double miles = kilometers * 0.621371;
        System.out.println("Distance in miles: " + miles);
    }
}
