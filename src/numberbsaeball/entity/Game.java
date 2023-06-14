package numberbsaeball.entity;

import java.util.ArrayList;
import java.util.List;

public class Game {

	private List<String> numberList = new ArrayList<>();

	public Game(List<String> numberList) {
		super();
		this.numberList = numberList;
	}

	public List<String> getNumberList() {
		return numberList;
	}

	public void setNumberList(List<String> numberList) {
		this.numberList = numberList;
	}

}
