package games.play4ever.xchars.server;

import java.net.URI;
import java.security.Principal;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.reactive.server.ServerRequestFilter;

public class Filters {

	@ServerRequestFilter(preMatching = true)
	public void getFilter(ContainerRequestContext requestContext) {
		Principal principal = requestContext.getSecurityContext().getUserPrincipal();
		System.out.println("*** PRINCIPAL: " + principal);
		if (principal == null) {
			requestContext.setRequestUri(URI.create("/login"));
		}
	}
/*
	@ServerRequestFilter
	public Optional<RestResponse<Void>> getFilter(ContainerRequestContext ctx) {
		// only allow GET methods for now
		if(ctx.getMethod().equals(HttpMethod.GET)) {
			return Optional.of(RestResponse.status(Response.Status.METHOD_NOT_ALLOWED));
		}
		return Optional.empty();
	}

 */
}
