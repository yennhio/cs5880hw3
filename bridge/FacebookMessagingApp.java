package bridge;
public class FacebookMessagingApp extends App {

    public FacebookMessagingApp (MessageType messageType) {
        this.messageType = messageType;
    }

    public void setApp() {
        System.out.println("Facebook app.");
        messageType.sendMessage();
    }
    
}
