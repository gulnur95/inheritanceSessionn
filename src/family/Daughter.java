package family;

public class Daughter extends Mother {
    private  String hairColor;
    private double height;

    public Daughter(String name, int age, String eyeColor, String hairColor, double height) {
        super(name, age, eyeColor);
        this.hairColor = hairColor;
        this.height = height;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "family.Daughter{" +
                "family.Mother's name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", eyeColor='" + super.getEyeColor() + '\'' +
                " hairColor='" + hairColor + '\'' +
                ",   height=" + height +
                '}';
    }


    @Override
    public String getNameMother() {
        return super.getNameMother();
    }
}
