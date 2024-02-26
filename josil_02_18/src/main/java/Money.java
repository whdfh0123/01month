public class Money {
    String unit;
    double notified;
    double buy;
    int rate;
    int limit;
    public Money(){

    }
    public Money(String unit, double notified, double buy, int rate, int limit){
        this.unit = unit;
        this.notified = notified;
        this.buy = buy;
        this.rate = rate;
        this.limit = limit;
    }
    public void setUnit(String unit){
        this.unit = unit;
    }
    public String getUnit(){
        return this.unit;
    }
    public void setNotified(double notified){
        this.notified = notified;
    }
    public double getNotified(){
        return this.notified;
    }
    public void setBuy(double buy){
        this.buy = buy;
    }
    public double getBuy(){
        return this.buy;
    }
    public void setRate(int rate){
        this.rate = rate;
    }
    public int getRate(){
        return this.rate;
    }
    public void setLimit(){
        this.limit = limit;
    }
    public int getLimit(){
        return this.limit;
    }
    @Override
    public String toString(){
        return "["+unit+"] "+"고시환율 : "+notified+" / 현찰살때 : "+buy+" / 환율우대 : "+rate+" / 일일한도 : "+limit;
    }

}
