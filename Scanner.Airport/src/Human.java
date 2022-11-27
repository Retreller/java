public class Human {
    private String name;
    private int age;
    private String seondName;

    public Human(String a) {
        name=a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSeondName() {
        return seondName;
    }

    public void setSeondName(String seondName) {
        this.seondName = seondName;
    }
}