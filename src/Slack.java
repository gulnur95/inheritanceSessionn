import java.time.LocalDate;

public class Slack extends Chat{
    private String channels;
    private String activity;

    public Slack() {
    }

    public Slack(String name, boolean isNew, String designColor, LocalDate dateOfIssue, String channels, String activity) {
        super(name, isNew, designColor, dateOfIssue);
        this.channels = channels;
        this.activity = activity;
    }

    public String getChannels() {
        return channels;
    }

    public void setChannels(String channels) {
        this.channels = channels;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String slackMethod(){
        return "\nSlack's Method:  Channels of slack:  " + this.channels;
    }

    @Override
    public boolean getIsNewChat() {
        return super.getIsNewChat();
    }

    @Override
    public void getChatName() {
        super.getChatName();
    }



    @Override
    public String toString() {
        return  "Slack "+
                "activity: " + activity  +
                "   channels: " + channels +
                super.toString();
    }
}
