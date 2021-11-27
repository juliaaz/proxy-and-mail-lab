package MailSenderTests;
import mail_sender.Client;
import mail_sender.Gender;
import mail_sender.MailBox;
import mail_sender.MailInfo;
import mail_sender.MailCode;
import org.junit.jupiter.api.BeforeEach;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MailBoxTest {
    MailBox mailBox;
    Client Client1;
    Client Client2;
    MailInfo mailInfo;
    MailInfo mailInfo2;
    MailCode mailCode;
    ArrayList<MailInfo> mails = new ArrayList<>();
    @BeforeEach
    void setUp() {
        mailBox = new MailBox();
        mailCode = MailCode.HAPPY_BIRTHDAY;
        Client1 = new Client("Jiji", Gender.FEMALE, 19, "jiji123@gmail.com");
        Client2 =new Client("Leo", Gender.MALE, 21, "leoleo@gmail.com");
        mailInfo = new MailInfo(Client1, mailCode);
        mailInfo2 = new MailInfo(Client2, mailCode);
    }

    @Test
    void addMailInfo() {
        mailBox.addInfo(mailInfo);
        mails.add(mailInfo);
        assertEquals(mailBox.getInfos().get(0).getEmail(), mails.get(0).getEmail());
    }
}
