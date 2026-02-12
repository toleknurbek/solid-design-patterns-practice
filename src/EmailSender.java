public class EmailSender implements IMessageSender {
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}