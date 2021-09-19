import java.util.*;
import java.math.*;

public class Reciept {
   private ArrayList<Item> items = new ArrayList<Item>();
   private BigDecimal valueAddedTax = BigDecimal.ZERO;
   private BigDecimal discount = BigDecimal.ZERO;
   private BigDecimal total = BigDecimal.ZERO;
   private BigDecimal billTotal = BigDecimal.ZERO;
   private BigDecimal amountPaid = BigDecimal.ZERO;
   private BigDecimal balance = BigDecimal.ZERO;

 
 

   public Reciept(ArrayList<Item> items, BigDecimal totalAmount, BigDecimal discount, BigDecimal valueAddedTax, BigDecimal billTotal, BigDecimal amountPaid, BigDecimal balance) {
       this.items=items;
       this.valueAddedTax = valueAddedTax;
       total = totalAmount;
       this.discount=discount;
       this.billTotal = billTotal;
       this.amountPaid = amountPaid;
       this.balance=balance;
   }

   public void generateReciept() {
       Date today = new Date();
       System.out.println("""
                Store: Phoenix Stores
                Branch: MAIN BRANCH
                Tel: 08122234445
       """);
       System.out.printf("%s%s\t%s%n","Date",":", today.toString());
       printDoubleLine();
       System.out.printf("%s\t%s\t%s\t%s%n", "ITEM", "QTY", "PRICE", " ₦");
       printSingleLine();
       for(Item item : items) {
           System.out.printf("%s\t%s\t%.2f\t%.2f%n", item.getName(), item.getQuantity(), item.getPrice().doubleValue(), item.getPriceOfQuantityPurchased().doubleValue());
       }
       printSingleLine();
       System.out.printf("\t%s%s\t%.2f%n","Subtotal", ":", total.doubleValue());
       System.out.printf("\t%s%s\t%.2f%n", "Discount", ":", discount);
       System.out.printf("\t%s%s\t%.2f%n", "VAT @ 7.50%", ":", valueAddedTax);
       printDoubleLine();
       System.out.printf("\t%s%s\t%.2f%n", "Bill Total", ":", billTotal);
       System.out.printf("\t%s%s\t%.2f%n", "Tendered", ":", amountPaid);
       System.out.printf("\t%s%s\t%.2f%n", "Balance", ":", balance);
       printDoubleLine();
       System.out.printf("\t\t%s%n", getGoodByeMessage());
       printDoubleLine();
   }


   private static void printSingleLine() {
        System.out.println("-".repeat(50));
   }

   private static void printDoubleLine() {
        System.out.println("=".repeat(50));
   }

   private static String getGoodByeMessage(){
       return "THANK YOU";
   }

  
}
