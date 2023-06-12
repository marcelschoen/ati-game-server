package games.play4ever.xchars.server.game;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.Getter;

@ApplicationScoped
public class CoreSettings {

	@Getter
	private int worldXWidth = 100;

	@Getter
	private int worldZWidth = 100;
}
