import java.time.LocalDate;
import java.time.Period;

public class Chat {

    private String name;
    private boolean isNew;
    private LocalDate dateOfIssue;
    private String designColor;

    public Chat() {
    }

    public Chat(String name, boolean isNew, String designColor, LocalDate dateOfIssue) {
        this.name = name;
        this.isNew = isNew;
        this.designColor = designColor;
        this.dateOfIssue = dateOfIssue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getDesignColor() {
        return designColor;
    }

    public void setDesignColor(String designColor) {
        this.designColor = designColor;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public void getChatName(){
        System.out.println("Chat's method:  Chat Name: " + this.name);
        System.out.println("Chat's method:  Design Color: " + this.designColor);

    }

    public boolean getIsNewChat(){
        LocalDate today = LocalDate.now();
        Period period = Period.between(this.dateOfIssue,today);
        return period.getYears() < 5;
    }



    @Override
    public String toString() {
        return
                "    dateOfIssue: " + dateOfIssue +
                "   name: " + name  +
                "   isNew: " + isNew +
                "   designColor: " + designColor ;
    }
}
