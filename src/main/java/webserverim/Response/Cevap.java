package webserverim.Response;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.*;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: MehmetHacisalihoglu
 * Date: 04.12.2013
 * Time: 20:00
 * To change this template use File | Settings | File Templates.
 */
public class Cevap implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        URI uri = httpExchange.getRequestURI();
        if (uri.getHost() == null) {
            String response = "Sayfaya ulasildi";
            httpExchange.sendResponseHeaders(200,response.length());
            OutputStream sonuc = httpExchange.getResponseBody();
            sonuc.write(response.getBytes());
            sonuc.close();
            sonuc.close();
        } else {
            String response = "Sayfaya ulasilamadi";
            httpExchange.sendResponseHeaders(404,response.length());
            OutputStream sonuc = httpExchange.getResponseBody();
            sonuc.write(response.getBytes());
            sonuc.close();
            sonuc.close();
        }
    }
}
