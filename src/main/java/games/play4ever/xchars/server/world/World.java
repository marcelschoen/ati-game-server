package games.play4ever.xchars.server.world;

import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import lombok.Getter;

import games.play4ever.xchars.server.game.CoreSettings;

public class World {

	private int x_width = 100;
	private int z_width = 100;

	@Getter
	private char[][] worldData;

	public void init(CoreSettings coreSettings) {
		x_width = coreSettings.getWorldXWidth();
		z_width = coreSettings.getWorldZWidth();
		worldData = new char[x_width][z_width];

		// TEMPORARY WORLD FILL
		for(int x = 0; x < x_width; x ++) {
			for(int z = 0; z < z_width; z ++) {
				worldData[x][z] = 'X';
			}
		}
	}

}
