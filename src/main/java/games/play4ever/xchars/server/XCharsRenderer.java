package games.play4ever.xchars.server;

import games.play4ever.xchars.server.game.world.GameObject;
import games.play4ever.xchars.server.json.XCharsGameScreen;
import games.play4ever.xchars.server.game.world.World;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class XCharsRenderer {

	public char[][] render(World world) {
		// take world from current session

		XCharsGameScreen screen = new XCharsGameScreen();

		// get owner (user) of world
		// render data based on current position and orientation of owner
		GameObject ownerPlayer = world.getOwner();
		int x = ownerPlayer.getXCoordinate();
		int z = ownerPlayer.getZCoordinate();

		for (GameObject gameObject : world.getGameObjects()) {
			// for each object, calculate if it's in viewing area of player


		}

		return world.getWorldData();
	}
}
