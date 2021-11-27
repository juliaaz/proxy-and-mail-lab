package mail_sender;

public class Main {
    public static void main(String[] args) {
        MailBox mailBox = new MailBox();
        Client client1 = new Client("Jiji", Gender.FEMALE, 19, "jiji123@gmail.com");
        Client client2 = new Client("Omar", Gender.MALE, 20, "omar_komar321@gmail.com");
        Client client3 = new Client("Leo", Gender.MALE, 21, "leoleo@gmail.com");
        MailInfo Info1 = new MailInfo(client1, MailCode.GREETINGS);
        MailInfo Info2 = new MailInfo(client2, MailCode.HAPPY_BIRTHDAY);
        MailInfo Info3 = new MailInfo(client3, MailCode.GREETINGS);
        mailBox.addInfo(Info1);
        mailBox.addInfo(Info2);
        mailBox.addInfo(Info3);
        mailBox.sendAll();
    }
}
