package keno;

import java.util.List;

public class KenoResponse {

    private double winAmount = 0;

    private double balance;

    private PlayTableWithWin playTableWithWin;

    private List<Integer> balls;

    private List<Integer> included;
    private List<Integer> notIncluded;

    public double getWinAmount() {
        return winAmount;
    }

    public void setWinAmount(double winAmount) {
        this.winAmount = winAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public PlayTableWithWin getPlayTableWithWin() {
        return playTableWithWin;
    }

    public void setPlayTableWithWin(PlayTableWithWin playTableWithWin) {
        this.playTableWithWin = playTableWithWin;
    }

    public List<Integer> getIncluded() {
        return included;
    }

    public void setIncluded(List<Integer> included) {
        this.included = included;
    }

    public List<Integer> getNotIncluded() {
        return notIncluded;
    }

    public void setNotIncluded(List<Integer> notIncluded) {
        this.notIncluded = notIncluded;
    }

    public List<Integer> getBalls() {
        return balls;
    }

    public void setBalls(List<Integer> balls) {
        this.balls = balls;
    }
}
