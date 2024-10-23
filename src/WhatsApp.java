import java.time.LocalDate;

public class WhatsApp extends Chat{

    private String encryptionType;  // Уникалдуу поле
    private boolean hasStatusFeature; // Уникалдуу поле

    public WhatsApp() {
    }

    public WhatsApp(String name, boolean isNew, String designColor, LocalDate dateOfIssue,
                    String encryptionType,boolean hasStatusFeature ) {
        super(name, isNew, designColor,dateOfIssue);
        this.encryptionType = encryptionType;
        this.hasStatusFeature = hasStatusFeature;
    }

    public String getEncryptionType() {
        return encryptionType;
    }

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    public boolean isHasStatusFeature() {
        return hasStatusFeature;
    }

    public void setHasStatusFeature(boolean hasStatusFeature) {
        this.hasStatusFeature = hasStatusFeature;
    }

    @Override
    public void getChatName() {
        super.getChatName();
    }

    @Override
    public boolean getIsNewChat() {
        return super.getIsNewChat();
    }


    public String whatsAppMethod() {
        return "\nWhatsApp Method:  Encryption Type: " + this.encryptionType;
    }

    public void showStatusFeature() {
        System.out.println("WhatsApp method:  WhatsApp Status Feature: " + (hasStatusFeature ? "Available" : "Not Available"));
    }


    @Override
    public String toString() {
        return "WhatsApp:  " +
                "encryptionType: " + encryptionType  +
                "    hasStatusFeature: " + hasStatusFeature + super.toString();
    }
}
