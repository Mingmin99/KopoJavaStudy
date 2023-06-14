package numberbsaeball.domain;

import java.util.Random;

import numberbsaeball.entity.Computer;
import numberbsaeball.entity.Game;

public class GameImpl implements GameRepository {

	@Override
	public void makeAnswer(Computer computer) {
		Random ran = new Random();

		// 첫번째 숫자를 받아오기
		int firstRandomNumber = ran.nextInt(9) + 1;
		computer.getNumberList().add(Integer.toString(firstRandomNumber));

		// 두번째, 세번째 숫자를 받아오기
		for (int i = 0; i < 2; i++) {
			int randomNumber = ran.nextInt(10);
			computer.getNumberList().add(Integer.toString(randomNumber));
		}

	}

	@Override
	public void Calculate(Game game) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Win() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Lose() {
		// TODO Auto-generated method stub

	}

}
