package animal;

public class Animal {
    private String name;
    private int age;

    //引数なしのコンストラクタ
    public Animal() {

    }

    //引数ありのコンストラクタ
    public Animal(String name,int age) {
        this.age=age;
        this.name=name;
    }

    public void say() {
        System.out.println(name+"です。"+age+"歳です。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }

}
