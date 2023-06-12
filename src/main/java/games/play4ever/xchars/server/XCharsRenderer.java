package games.play4ever.xchars.server;

import games.play4ever.xchars.server.json.XCharsGameScreen;
import games.play4ever.xchars.server.world.World;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class XCharsRenderer {

	public char[][] render(World world) {
		// take world from current session
		// get owner (user) of world
		// render data based on current position and orientation of owner

		XCharsGameScreen screen = new XCharsGameScreen();



		return world.getWorldData();
	}
}
