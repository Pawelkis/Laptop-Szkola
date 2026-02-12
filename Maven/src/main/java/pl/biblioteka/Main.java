package pl.biblioteka;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        File plik = new File("biblioteka.json");

        List<Ksiazka> ksiazki = new ArrayList<>();
        ksiazki.add(new Ksiazka("Władca Pierścieni", "J.R.R. Tolkien", 1954, true));
        ksiazki.add(new Ksiazka("1984", "George Orwell", 1949, false));
        ksiazki.add(new Ksiazka("Hobbit", "J.R.R. Tolkien", 1937, true));

        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(plik, ksiazki);
            System.out.println("Zapisano książki do biblioteka.json");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<Ksiazka> wczytaneKsiazki = mapper.readValue(
                    plik,
                    new TypeReference<List<Ksiazka>>() {}
            );

            System.out.println("\nDostępne książki:");
            wczytaneKsiazki.stream()
                    .filter(Ksiazka::isDostepna)
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
