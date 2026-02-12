import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        List<Ksiazka> biblioteka = new ArrayList<>();
        biblioteka.add(new Ksiazka("Władca Pierścieni", "Tolkien", 1954, true));
        biblioteka.add(new Ksiazka("Harry Potter", "Rowling", 1997, false));
        biblioteka.add(new Ksiazka("Hobbit", "Tolkien", 1937, true));

        mapper.writeValue(new File("biblioteka.json"), biblioteka);

        List<Ksiazka> wczytaneKsiazki = mapper.readValue(
                new File("biblioteka.json"),
                new TypeReference<List<Ksiazka>>() {}
        );

        for (Ksiazka k : wczytaneKsiazki) {
            if (k.isDostepna()) {
                System.out.println(
                        k.getTytul() + " - " +
                                k.getAutor() + " (" +
                                k.getRokWydania() + ")"
                );
            }
        }
    }
}
