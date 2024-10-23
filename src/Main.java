import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Task 4    Session     Inheritance
Chat деген класс тузунуз, полелери (name, isNew(boolean), dateOfIssue, designColor), methods: getChatName(){}; chat тын
 атын жана тусун чыгарып берсин. getIsNewChat(){}; эгерде акыркы 5 жылдын аралыгында чыксы true, болбосо false кайтарсын.
Аларды мурастаган WhatsApp, Telegram, Instagram, Slack жана башкалар. Ар бир класста 2 ден уникалдуу полелери болсун
жана parent class тын методторун переопределять этиши керек. Ар бир мурастап жаткан класстын озуно тиешелуу методу
болсун, ошол гана класстын эмне кылып жатканын жана кандай озгочолуктору бар экенин кайтарып берчу.
 main ден ар бир класстын бир нече объектин тузуп баарын массивге салыныз. Метод тузунуз бизге параметрден келген
 чаттардын арасынан эн жаны чатты табып, анан чаттын атын жана “ эн жаны чат” деп консолго чыгарып берсин.   */


        Chat chat = new Chat("SMS", true, "white", LocalDate.of(2023, 6, 26));
        //System.out.println(chat.toString());
        chat.getChatName();
        System.out.println("Chat's method: Is this chat new? " + chat.getIsNewChat());



        WhatsApp whatsApp = new WhatsApp("WhatsApp", true, "blue",
                LocalDate.of(2011, 5, 6), "Times new roman", true);
        System.out.println(whatsApp.whatsAppMethod());
        whatsApp.showStatusFeature();


        Telegram telegram = new Telegram("Telegram", true, "grey", LocalDate.of(2015,3,9),
                "100000 GB", "500");
        System.out.println(telegram.telegramMethod());


        Instagram instagram = new Instagram("Instagram", true, "bright", LocalDate.of(2014,7,9),
                "maximum", "medium");
        System.out.println(instagram.instagramMethod());

        Slack slack = new Slack("Slack", true, "violet", LocalDate.of(2017,2,4),
                "Announcement, Java-16", "talking");
        System.out.println(slack.slackMethod());

        Chat[] chats = {whatsApp, telegram, instagram, slack};

        System.out.println();
         System.out.println("General information about all chats: ");
        for (Chat myChat : chats) {
            System.out.println(myChat.toString());
            System.out.println();
        }


        System.out.println("The newest Chat:");
       Chat newestChat = findNewestChat(chats);
       System.out.println(newestChat );




    }

    public static Chat findNewestChat(Chat[] chats) {
        Chat newestChat = null;

        for (Chat chat : chats) {
            if (newestChat == null || chat.getDateOfIssue().isAfter(newestChat.getDateOfIssue())) {
                newestChat = chat;
            }
        }

        return newestChat;
    }


}