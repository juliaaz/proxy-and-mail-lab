package MailSenderTests;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import mail_sender.Client;
import mail_sender.Gender;

public class ClientTest {
    Client Client1;
    Client Client2;
    @BeforeEach
    void setUp() {
        Client1 = new Client("Jiji", Gender.FEMALE, 19, "jiji123@gmail.com");
        Client2 = new Client("Leo", Gender.MALE, 21, "leoleo@gmail.com");
    }

    @Test
    void getAge() {
        assertEquals(Client1.getAge(), 19);
        assertEquals(Client2.getAge(), 21);
    }

    @Test
    void getGender() {
        assertEquals(Client1.getSex(), Gender.FEMALE);
        assertEquals(Client2.getSex(), Gender.MALE);
    }

    @Test
    void getEmail() {
        assertEquals(Client1.getEmail(), "jiji123@gmail.com");
        assertEquals(Client2.getEmail(), "leoleo@gmail.com");
    }

}
