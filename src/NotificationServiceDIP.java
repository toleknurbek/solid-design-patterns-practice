import java.util.List;

public class NotificationServiceDIP {
    private final List<IMessageSender> senders;

    public NotificationServiceDIP(List<IMessageSender> senders) {
        this.senders = senders;
    }

    public void sendNotification(String message) {
        for (IMessageSender sender : senders) {
            sender.sendMessage(message);
        }
    }
}