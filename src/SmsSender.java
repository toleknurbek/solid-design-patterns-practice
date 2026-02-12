public class SmsSender implements IMessageSender {
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}