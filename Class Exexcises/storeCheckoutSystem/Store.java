import java.util.*;
import java.math.*;

public class Store {
    Scanner scanner = new Scanner(System.in);
    private static final String storeName = "kataStore";
    private ArrayList<Item> checkoutCart = new ArrayList<Item>();
    private final BigDecimal discountRate= BigDecimal.valueOf(0.05);
    private BigDecimal discount = BigDecimal.ZERO;
    private final BigDecimal valueAddedTaxRate = BigDecimal.valueOf(0.075);
    private BigDecimal valueAddedTax = BigDecimal.ZERO;
    private BigDecimal totalAmount = BigDecimal.ZERO;
    private BigDecimal billTotal = BigDecimal.ZERO;
    private static BigDecimal amountPaid= BigDecimal.ZERO;
    private BigDecimal balance = BigDecimal.ZERO;
    private Reciept receipt;

    //input mismatch exception
    public void addItemToCheckoutCart() {
        String response ="";
        do {
            try {
                System.out.println("what did the customer buy?");
                String itemName = scanner.next();
                BigDecimal pricePerItem = getPricePerItem();
                int quantityPurchased= getQuantityPurchased();
                System.out.println("Anything else?");
                response = scanner.next();
                Item item = new Item(itemName, pricePerItem, quantityPurchased);
                checkoutCart.add(item);
            } catch (InputMismatchException e) {
                System.out.printf("%n Exception: %s%n", e.getMessage());
                scanner.nextLine();
            }
            
        } while (!response.equalsIgnoreCase("no"));
            
    }

    public void calculatePriceTotal() {
        for (Item item : checkoutCart) {
            totalAmount=totalAmount.add(item.getPriceOfQuantityPurchased());
        }
    }

    public void welcomeMessage() {
        System.out.printf("Welcome to %s%n", storeName);
    }

    public void calculateTotalPricePerItem() {
        for (Item item : checkoutCart) {
            item.calculatePriceOfQuantityPurchased();
        }
    }
    
    public void printReceipt(){
        receipt = new Reciept(checkoutCart, totalAmount, discount, valueAddedTax, billTotal, amountPaid, balance);
        receipt.generateReciept();
    }

    public void calculateDiscount() {
        discount = totalAmount.multiply(discountRate);
        
    }

    public void calculateValueAddedTax(){
        valueAddedTax=totalAmount.multiply(valueAddedTaxRate);
    }

    public void summaryOfPurchase() {
        System.out.printf("%s\t%s\t%s\t%s%n", "ITEM", "QTY", "PRICE", " ₦");
        
        for(Item item : checkoutCart) {
            System.out.printf("%s\t%s\t%.2f\t%.2f%n", item.getName(), item.getQuantity(), item.getPrice().doubleValue(), item.getPriceOfQuantityPurchased().doubleValue());
        }
        
        System.out.printf("\t%s%s\t%.2f%n","Subtotal", ":", totalAmount.doubleValue());
        System.out.printf("\t%s%s\t%.2f%n", "Discount", ":", discount);
        System.out.printf("\t%s%s\t%.2f%n", "VAT @ 7.50%", ":", valueAddedTax);
        System.out.printf("\t%s%s\t%.2f%n", "Bill Total", ":", billTotal);
        System.out.printf("%n");
        
    }

    public void calculateBillTotal() {
        billTotal=totalAmount.subtract(discount).add(valueAddedTax);
    }
    
    //input mismatch exception
    public void processCustomerpayment() {
       promptCustomerForPayment();
       BigDecimal amountPaid = collectCashFromCustomer();
       while (amountPaid.compareTo(BigDecimal.ZERO)==0 || amountPaid.compareTo(BigDecimal.ZERO) == -1 || amountPaid.compareTo(billTotal)==-1) {
           System.out.println("Invalid Amount, Enter valid Amount");
            promptCustomerForPayment();
            amountPaid = collectCashFromCustomer();
       }
       balance = calculateCustomersBalance(amountPaid, billTotal);
    }

    private void promptCustomerForPayment() {
        System.out.println("How much is the customer paying?");
    }

    public BigDecimal collectCashFromCustomer() {
        amountPaid = scanner.nextBigDecimal();
        return amountPaid;
    }

    private BigDecimal getPricePerItem() {
        System.out.println("How much is the item?");
        BigDecimal pricePerItem = scanner.nextBigDecimal();
        BigDecimal validatedPrice = validateItemPrice(pricePerItem);
        return validatedPrice;
    }

    private BigDecimal validateItemPrice(BigDecimal value) {
        while (value.compareTo(BigDecimal.ZERO)==0 || value.compareTo(BigDecimal.ZERO) == -1) {
                System.out.println("Invalid Price, Enter valid price");
                value = getPricePerItem(); 
        }
        return value;
    }


    private int validateItemQuantity(int value) {
        while (value<=0){
            System.out.println("Invalid Price, Enter valid price");
            value = getQuantityPurchased();
        }
        return value;
    }


    private int getQuantityPurchased() {
        System.out.println("What quantity did the customer buy?");
        int quantityPurchased = scanner.nextInt();
        int validatedItemQuantity=validateItemQuantity(quantityPurchased);
        return validatedItemQuantity;
    }

    private BigDecimal calculateCustomersBalance(BigDecimal amountPaid, BigDecimal billTotal){
        return amountPaid.subtract(billTotal);
    }
}

