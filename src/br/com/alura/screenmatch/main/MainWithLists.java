package br.com.alura.screenmatch.main;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;
import java.util.*;

public class MainWithLists {
    public static void main(String[] args) {
        var movie1 = new Movie("The Godfather", 1972);
        movie1.review(9);
        var movie2 = new Movie("Avatar", 2009);
        movie2.review(10);
        var series1 = new Series("Game Of Thrones", 2011);
        series1.review(8);

        ArrayList<Title> list = new ArrayList<>();
        list.add(movie1);
        list.add(movie2);
        list.add(series1);

//        for (Title item: list){
//            System.out.println(item);
//        }

        // The code below does the same thing as the code above:
        list.forEach(System.out::println);

        List<String> searchByActor = new ArrayList<>();

        searchByActor.add("Adam Sandler");
        searchByActor.add("Paul Walker");
        searchByActor.add("Jason Statham");

        // Sorting the list alphabetically:
        Collections.sort(searchByActor);
        System.out.println(searchByActor);

        Collections.sort(list);
        System.out.println(list);

        // Sorting the list in order of release year:
        list.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println(list);
    }
}
