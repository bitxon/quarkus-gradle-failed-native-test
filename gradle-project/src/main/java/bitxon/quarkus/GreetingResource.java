package bitxon.quarkus;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bitxon.quarkus.db.AccountDao;

@Path("/hello")
public class GreetingResource {

    @Inject
    AccountDao accountDao;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        accountDao.findAll();
        return "Hello from RESTEasy Reactive";
    }
}