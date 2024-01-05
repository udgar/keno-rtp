package keno;

import java.util.List;

public class KenoRequest {

    private List<Integer> listOfSelectedNumber;
    private double totalBet;

    public List<Integer> getListOfSelectedNumber() {
        return listOfSelectedNumber;
    }

    public void setListOfSelectedNumber(List<Integer> listOfSelectedNumber) {
        this.listOfSelectedNumber = listOfSelectedNumber;
    }

    public double getTotalBet() {
        return totalBet;
    }

    public void setTotalBet(double totalBet) {
        this.totalBet = totalBet;
    }
}
