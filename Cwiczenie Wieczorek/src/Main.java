import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Student student = new Student(
                "Jan",
                22,
                List.of("programowanie", "sport", "muzyka")
        );

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(student);

        System.out.println(json);
    }
}
