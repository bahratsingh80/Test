import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RectanglePerimeter {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        
        System.out.print("Enter the length of the rectangle: ");
        double l = Double.parseDouble(reader.readLine());

        System.out.print("Enter the width of the rectangle: ");
        double w = Double.parseDouble(reader.readLine());

        
        double p = 2 * (l + w);

    
        System.out.println("Perimeter of the rectangle is = " + p);
    }
}
