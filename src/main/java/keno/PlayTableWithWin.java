package keno;

public class PlayTableWithWin {

    private Integer playline;
    private double win;

    public PlayTableWithWin(Integer playline, double win) {
        this.playline = playline;
        this.win = win;
    }

    public Integer getPlayline() {
        return playline;
    }

    public double getWin() {
        return win;
    }
}
