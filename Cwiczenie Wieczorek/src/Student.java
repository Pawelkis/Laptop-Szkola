import java.util.List;

public class Student {

    private String imie;
    private int wiek;
    private List<String> hobby;

    public Student() {
    }

    public Student(String imie, int wiek, List<String> hobby) {
        this.imie = imie;
        this.wiek = wiek;
        this.hobby = hobby;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }
}
