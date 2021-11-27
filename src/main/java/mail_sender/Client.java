package mail_sender;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @ToString
public class Client {
    private final int id;
    private final String name;
    private final Gender sex;
    private final int age;
    private final String email;

    public Client(String name, Gender sex, int age, String email) {
        id = ClientIDGenerator.generateID();
        this.name = name;
        this.age = age;
        this.email = email;
        this.sex = sex;
    }

    private static class ClientIDGenerator {
        private static int counter = 0;

        public static int generateID() {
            counter += 1;
            return counter;
        }
    }

}
