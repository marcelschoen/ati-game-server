package games.play4ever.xchars.server;

import games.play4ever.xchars.server.json.LoginRequired;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/login")
public class LoginResource {

	@GET
	@Produces("application/json")
	public LoginRequired getLoginRequired() {
		return new LoginRequired();
	}
}
