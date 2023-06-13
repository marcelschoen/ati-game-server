package games.play4ever.xchars.server.game.world;

import lombok.Getter;
import lombok.Setter;

public class Player extends GameObject {

	protected TYPE objectType = TYPE.four_sided;

	@Getter @Setter
	private boolean worldOwner = false;
}
