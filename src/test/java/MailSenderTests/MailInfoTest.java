package MailSenderTests;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import mail_sender.Client;
import mail_sender.Gender;
import mail_sender.MailInfo;
import mail_sender.MailCode;
import static org.junit.jupiter.api.Assertions.*;

public class MailInfoTest {
    Client client1;
    Client client2;
    MailInfo mailInfo1;
    MailInfo mailInfo2;

    @BeforeEach
    void setUp() {
        client1 = new Client("Jiji", Gender.FEMALE, 19, "jiji123@gmail.com");
        client2 = new Client("Leo", Gender.MALE, 21, "leoleo@gmail.com");
        mailInfo1 = new MailInfo(client1, MailCode.HAPPY_BIRTHDAY);
        mailInfo2 = new MailInfo(client2, MailCode.GREETINGS);
    }
    @Test
    void getClientText1() {
        assertEquals(mailInfo1.getText(), "Hi, Jiji!\nHappy 19-th anniversary!\nYou now are 19 years old.\n");
    }

    @Test
    void getClientText2() {
        assertEquals(mailInfo2.getText(), "Hi Leo! Have a great day!\n");
    }
}
