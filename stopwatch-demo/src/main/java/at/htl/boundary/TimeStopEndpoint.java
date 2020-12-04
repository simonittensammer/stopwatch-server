package at.htl.boundary;

import at.htl.entity.TimeStop;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import java.util.List;

@ApplicationScoped
public class TimeStopEndpoint {

    @Inject
    TimeStopEndpoint tsEndpoint;

    @GET
    public List<TimeStop> getAll() {
        return null;
    }
}
