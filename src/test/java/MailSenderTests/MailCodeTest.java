package MailSenderTests;
import mail_sender.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class MailCodeTest {
    MailCode mailCode;

    @BeforeEach
    void setUp() {
        mailCode = MailCode.HAPPY_BIRTHDAY;
    }
    @Test
    void generateText() {
        assertEquals(mailCode.generateText(), "Hi, %NAME%!\nHappy %AGE%-th anniversary!\nYou now are %AGE% years old.\n");
    }
}
