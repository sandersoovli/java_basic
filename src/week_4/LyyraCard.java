package week_4;

public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart){
        balance = balanceAtStart;
    }
    public String toString(){
        return "This card has " + this.balance + " euros";
    }
}
