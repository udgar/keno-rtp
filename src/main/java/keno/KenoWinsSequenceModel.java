package keno;

import java.util.List;

public class KenoWinsSequenceModel {
	
	private int pick;
	
	private List<Double> wins;
	
	public KenoWinsSequenceModel(int pick, List<Double> wins) {
		this.pick = pick;
		this.wins = wins;
	}

	public KenoWinsSequenceModel() {
	}

	public int getPick() {
		return pick;
	}

	public void setPick(int pick) {
		this.pick = pick;
	}

	public List<Double> getWins() {
		return wins;
	}

	public void setWins(List<Double> wins) {
		this.wins = wins;
	}	
}
