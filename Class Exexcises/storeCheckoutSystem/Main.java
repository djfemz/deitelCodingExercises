public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.welcomeMessage();
        store.addItemToCheckoutCart();
        store.calculateTotalPricePerItem();
        store.calculatePriceTotal();
        store.calculateValueAddedTax();
        store.calculateDiscount();
        store.calculateBillTotal();
        store.summaryOfPurchase();
        store.processCustomerpayment();
        store.printReceipt();
    }
}
