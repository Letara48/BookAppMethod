import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        Book one = new Book("Charlotte's Web", "E.B. White", "A children's story about a friendship between a spider and pig",20.00, false);
//        one.getDisplayText();
        Book two = new Book(20.00, false);
        Book three = new Book(20.00, true);
        Book four = new Book(20.00, true);
        Book five = new Book(20.00, false);
//        double prices = 0;
        }

    public static double total(double totalPrices){
//        double totalPrices = 0.0;
        ArrayList<Double>prices = new ArrayList<>();
        for (int i = 0; i < prices.size(); i++) {
            totalPrices += prices.get(i);
            prices.add(Book.getprice());
        }
            return totalPrices;

//        if isInStock = true{
//            System.out.println("This is the total price of your books: " + totalPrices());
        }

    }


}
