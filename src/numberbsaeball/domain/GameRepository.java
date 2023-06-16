package numberbsaeball.domain;

import numberbsaeball.entity.Computer;
import numberbsaeball.entity.User;

public interface GameRepository {

	void makeAnswer(Computer compter);

	void Win();

	void Lose();

	void Check(Computer computer);

	void Calculate(Computer computer, User user);
}
