package webserverim;

import com.sun.net.httpserver.HttpServer;
import webserverim.Response.Cevap;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: MehmetHacisalihoglu
 * Date: 04.12.2013
 * Time: 19:56
 * To change this template use File | Settings | File Templates.
 */
public class Webserver  {
    public static void main(String[] args) throws IOException {
        InetSocketAddress port = new InetSocketAddress(8007);
        HttpServer server = HttpServer.create(port, 0);
        server.createContext("/Default", new Cevap());
        server.setExecutor(Executors.newCachedThreadPool());
        server.start();
    }
}
