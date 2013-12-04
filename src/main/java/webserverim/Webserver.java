package webserverim;

import com.sun.net.httpserver.HttpServer;
import webserverim.Response.Cevap;
import java.net.InetSocketAddress;

/**
 * Created with IntelliJ IDEA.
 * User: MehmetHacisalihoglu
 * Date: 04.12.2013
 * Time: 19:56
 * To change this template use File | Settings | File Templates.
 */
public class Webserver {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/deneme", new Cevap());
        server.setExecutor(null);
        server.start();
    }
}
