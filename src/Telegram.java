import java.time.LocalDate;

public class Telegram extends Chat{
    private String size;
    private String memory;

    public Telegram() {
    }

    public Telegram(String name, boolean isNew, String designColor, LocalDate dateOfIssue, String memory, String size) {
        super(name, isNew, designColor, dateOfIssue);
        this.memory = memory;
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String telegramMethod() {
        return "\nTelegram's method:  Memory " + this.memory;
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
        return "Telegram " +
                "memory: " + memory +
                "    size: " + size  +
                super.toString();
    }
}
