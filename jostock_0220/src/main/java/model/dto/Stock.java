package model.dto;

public class Stock {
    private String stockName;
    private int price;

    public Stock(String stockName, int price) {
        this.stockName = stockName;
        this.price = price;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "종목 : " + stockName +
                ", 가격 : " + price;
    }
}
