package family;

public class Mother {
    private String name;
    private int age;
    private String eyeColor;



    public Mother(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "family.Mother{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }

    public String getNameMother(){
        return name + " this is mother";



                /*     Task 1   Session
        Создайте класс family.Mother с полями(name, age, eye color) и метод getName(); возвращает "name + this is
mother". Создайте класс family.Daughter c полем(hair color, heigh) класс должен наследоваться от класса family.Mother и
должен переопределять его метод и при его вызове возвращать "this is daughter". В main создайте по 2 объекта
каждого класса. Вызовите методы    */

//        family.Mother mother = new family.Mother("Marry", 35, "blue");
//        System.out.println(mother.toString());
//        System.out.println(mother.getNameMother());
//
//        family.Daughter daughter = new family.Daughter("Mia", 35, "brown","black", 1.7);
//
//        System.out.println(daughter.toString());
//        System.out.println( daughter.getNameMother());


    }
}
