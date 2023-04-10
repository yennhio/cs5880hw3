package bridge;
public class WhatsAppMessagingApp extends App {

    public WhatsAppMessagingApp (MessageType messageType) {
        this.messageType = messageType;
    }

    public void setApp() {
        System.out.println("WhatsApp app.");
        messageType.sendMessage();
    }
    
}
