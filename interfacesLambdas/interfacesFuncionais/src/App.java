import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //lista imutável
        List<Users> users = List.of(new Users("Maria", 21),
        new Users("Cecília", 40), new Users("Tayna", 65));
        //expressão lambda
        users.forEach((Users user) -> {
            System.out.println(user);
        });
    }
}
