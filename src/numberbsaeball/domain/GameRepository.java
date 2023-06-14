package numberbsaeball.domain;

import numberbsaeball.entity.Computer;
import numberbsaeball.entity.Game;

public interface GameRepository {

	void makeAnswer(Computer compter);

	void Calculate(Game game);

	void Win();

	void Lose();

}
