import java.io.*;

public class AverageCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number: ");
        double num1 = Double.parseDouble(reader.readLine());
        System.out.print("Enter second number: ");
        double num2 = Double.parseDouble(reader.readLine());
        System.out.print("Enter third number: ");
        double num3 = Double.parseDouble(reader.readLine());
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average: " + average);
    }
}
