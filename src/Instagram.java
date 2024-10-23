import java.time.LocalDate;

public class Instagram extends Chat{
    private String speed;
    private String sound;

    public Instagram() {
    }

    public Instagram(String name, boolean isNew, String designColor, LocalDate dateOfIssue, String speed, String sound) {
        super(name, isNew, designColor, dateOfIssue);
        this.speed = speed;
        this.sound = sound;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String instagramMethod(){
        return "\ninstagram's Method:  Speed of Instagram downloading:  " +  this.speed;
    }

    @Override
    public void getChatName() {
        super.getChatName();
    }

    @Override
    public boolean getIsNewChat() {
        return super.getIsNewChat();
    }

    @Override
    public String toString() {
        return "Instagram " +
                "sound: " + sound  +
                "   speed: " + speed +
                 super.toString();
    }
}
