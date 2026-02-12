public class Ksiazka {

    private String tytul;
    private String autor;
    private int rokWydania;
    private boolean dostepna;

    public Ksiazka() {
    }

    public Ksiazka(String tytul, String autor, int rokWydania, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.dostepna = dostepna;
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public boolean isDostepna() {
        return dostepna;
    }
}
