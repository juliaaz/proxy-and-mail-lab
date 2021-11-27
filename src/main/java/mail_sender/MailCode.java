package mail_sender;

import lombok.SneakyThrows;
import java.io.File;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("./happy_birthday.txt"), GREETINGS("./greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    @SneakyThrows
    public String generateText() {
        File file = new File(this.filename);
        Scanner input = new Scanner(file);
        String text = "";
        while (input.hasNextLine()) {
            text = text + input.nextLine();
            text = text + "\n";
        }
        input.close();
        return text;
    }
}
