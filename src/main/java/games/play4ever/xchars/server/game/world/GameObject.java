package games.play4ever.xchars.server.game.world;

import lombok.Getter;
import lombok.Setter;

public abstract class GameObject {

	public enum TYPE {
		one_sided,
		four_sided,
		wall
	}

	public enum DIRECTIONS {
		front,
		back,
		left,
		right
	}

	@Getter
	protected TYPE objectType;

	@Getter @Setter
	private DIRECTIONS direction = DIRECTIONS.front;

	@Getter @Setter
	private int xCoordinate = 0;

	@Getter @Setter
	private int yCoordinate = 0;

	@Getter @Setter
	private int zCoordinate = 0;

}
