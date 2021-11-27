package mail_sender;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import lombok.Getter;
@Getter
public class MailBox {
    private ArrayList<MailInfo> infos = new ArrayList<>();

    public MailBox(){}

    public void addInfo(MailInfo info){
        infos.add(info);
    }

    public void sendAll(){
        MailSender mailSender = new MailSender();
        for (MailInfo mailInfo: infos) {
            mailSender.sendMail(mailInfo);
        }
        infos.clear();
    }
}