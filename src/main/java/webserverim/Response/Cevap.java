package webserverim.Response;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

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
        String response = "Sayfaya ulasildi";
        httpExchange.sendResponseHeaders(200,response.length());
        OutputStream sonuc = httpExchange.getResponseBody();
        sonuc.write(response.getBytes());
        sonuc.close();
    }
}
