import java.util.List;

public class StudentDrugi {

    private String imie;
    private int wiek;
    private List<String> hobby;

    public StudentDrugi(String imie, int wiek, List<String> hobby) {
        this.imie = imie;
        this.wiek = wiek;
        this.hobby = hobby;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    public List<String> getHobby() {
        return hobby;
    }
}
