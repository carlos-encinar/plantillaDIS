package es.ufv.dis.final2022.front;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class API {


    private static final String urlPrefix = "http://localhost:8080/%s/%s";

    public String getPokemons() throws URISyntaxException, IOException, InterruptedException {
        String fullUrl = String.format(urlPrefix, "Pokemons","");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(fullUrl))
                .GET()
                .build();
        HttpResponse<String> response = HttpClient
                .newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return response.body();
    }

    public String getPokemonPorNombre(String nombre) throws URISyntaxException, IOException,
            InterruptedException {
        String fullUrl = String.format(urlPrefix, "Pokemons/porNombre", nombre);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(fullUrl))
                .GET()
                .build();
        HttpResponse<String> response = HttpClient
                .newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());
                        System.out.println(response.body());
        return response.body();
    }



    public String getPokemonPorTipo(String tipo) throws URISyntaxException, IOException,
            InterruptedException {
        String fullUrl = String.format(urlPrefix, "Pokemons/porTipo", tipo);
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(new URI(fullUrl))
                        .GET()
                        .build();
        HttpResponse<String> response = HttpClient
                .newBuilder()
                .build()
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return response.body();
    }

}
