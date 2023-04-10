public class MessagingDriver {
    public static void main(String[] args) {

        FacebookMessagingApp facebookMsg = new FacebookMessagingApp(new VideoMessage());
        facebookMsg.setApp();
        facebookMsg = new FacebookMessagingApp(new TextMessage());
        facebookMsg.setApp();

        TelegramMessagingApp telegramMsg = new TelegramMessagingApp(new TextMessage());
        telegramMsg.setApp();
        telegramMsg = new TelegramMessagingApp(new ImageMessage());
        telegramMsg.setApp();

        WhatsAppMessagingApp whatsappMsg = new WhatsAppMessagingApp(new ImageMessage());
        whatsappMsg.setApp();
        whatsappMsg = new WhatsAppMessagingApp(new VideoMessage());
        whatsappMsg.setApp();


    }
}
