package pl.stormit.ping;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("ping")
public class PingResource {

	@GET
	@Path("time")
	public String ping() {
		return System.currentTimeMillis() + "";
	}

}
