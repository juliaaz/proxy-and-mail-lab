package mail_sender;
import lombok.Getter;
import lombok.AllArgsConstructor;
import java.util.HashMap;
@AllArgsConstructor @Getter
public class MailInfo {
    public Client client;
    public MailCode mailCode;

    public String getText(){
        HashMap<String, String> templates = new HashMap<>();
        templates.put("%NAME%", client.getName());
        templates.put("%AGE%", (new Integer(this.client.getAge())).toString());
        String text = mailCode.generateText();

        for (String key : templates.keySet()){
            text = text.replace(key, templates.get(key));
        }
        return text;
    }

    public String getEmail(){
        return client.getEmail();
    }
}
