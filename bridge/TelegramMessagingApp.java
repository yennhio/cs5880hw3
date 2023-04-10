package bridge;
public class TelegramMessagingApp extends App {

    public TelegramMessagingApp (MessageType messageType) {
        this.messageType = messageType;
    }

    public void setApp() {
        System.out.println("Telegram app.");
        messageType.sendMessage();
    }
    
}
