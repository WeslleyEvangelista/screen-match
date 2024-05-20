package br.com.alura.screenmatch.main;
import br.com.alura.screenmatch.models.OmdbTitle;
import br.com.alura.screenmatch.models.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the movie title you wish to search: ");
        var search = scanner.nextLine();

        String url = STR."https://www.omdbapi.com/?t=\{search}&apikey=ddf8730b";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        OmdbTitle omdbTitle = gson.fromJson(json, OmdbTitle.class);
        System.out.println(omdbTitle);

        Title myTitle = new Title(omdbTitle);
        System.out.println(myTitle);
    }
}
