import java.math.BigDecimal;

public class Item {
    private String name;
    private BigDecimal price = BigDecimal.valueOf(0.0);
    private int quantity = 0;
    private BigDecimal priceOfQuantityPurchased = BigDecimal.valueOf(0.0);


    public Item(String name, BigDecimal price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity= quantity;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getPriceOfQuantityPurchased(){  
        return priceOfQuantityPurchased;
    }

    public void calculatePriceOfQuantityPurchased(){
        priceOfQuantityPurchased = price.multiply(BigDecimal.valueOf(quantity));  
    }
}
