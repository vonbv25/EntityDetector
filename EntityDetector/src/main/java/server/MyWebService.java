package server;

import Data_objects_OLD.Entity;
import Data_objects_OLD.NameEntity;
import org.codehaus.jackson.map.ObjectMapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import java.io.IOException;

/**
 * Created by OJT4 on 7/18/2014.
 */
@Path("hello")
public class MyWebService {

    @GET
    @Path("/hello/{param}")
    public Response getMsg(@PathParam("param") String msg) {

        String output = "Hello: " + msg;



        return Response.status(200).entity(output).build();
    }


    @GET
    @Path("/myEntity/")
    public Response getEntity(@QueryParam("param") String msg) {
        Entity entity = new NameEntity();
        entity.setName(msg);
        ObjectMapper mapper = new ObjectMapper();
        try {
            String something = mapper.writeValueAsString(entity);
            return Response.status(200).entity(something).build();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

