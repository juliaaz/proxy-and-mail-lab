package mail_sender;

public class MailSender {
    public void sendMail(MailInfo info) {
        System.out.println("Mail " + info.getText()+" was sent to "+info.getEmail()+"\n");
    }
}
