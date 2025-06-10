import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sic {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        
        System.out.print("Enter the Principal amount: ");
        double p = Double.parseDouble(reader.readLine());

        System.out.print("Enter the Rate of interest (per annum): ");
        double r = Double.parseDouble(reader.readLine());

        System.out.print("Enter the Time (in years): ");
        double t = Double.parseDouble(reader.readLine());

       
        double si = (p * r * t) / 100;

        
        System.out.println("Simple Interest = ₹" + si);
    }
}
