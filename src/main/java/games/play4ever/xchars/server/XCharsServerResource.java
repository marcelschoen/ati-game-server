package games.play4ever.xchars.server;

import games.play4ever.xchars.server.game.CoreSettings;
import games.play4ever.xchars.server.json.XCharsGameScreen;
import games.play4ever.xchars.server.world.World;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/game")
public class XCharsServerResource {

	@Inject
	private CoreSettings coreSettings;

	@Inject
	private XCharsRenderer renderer;

	@GET
	@Produces("application/json")
	public XCharsGameScreen getGameScreen() {
		XCharsGameScreen gameScreen = new XCharsGameScreen();

		World world = new World();
		world.init(coreSettings);

		gameScreen.screenBuffer = renderer.render(world);

		return gameScreen;
	}

	void onStart(@Observes StartupEvent ev) {

	}
}
