public class ClassObject {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(21);
        p1.setName("Denys");
        p1.speak("Hello my friends. I am "+ p1.age+"years , I am "+ p1.name, p1.age);
        int salary = p1.salary();
        System.out.println("Money per month " + salary);


        Person p2 = new Person();
        p2.setAge(30);
        p2.setName("Pavlo");
        p2.speak("I am " + p2.name+" .Here I am a boss, go away", p2.age);
    }
}
//class is blueprint
class Person{
    int age;
    String  name;
    void speak(String text, int age){
        System.out.println(text);
        if(age<22) {
            for (int i = 0; i < 3; i++) {
                System.out.println("lol");
            }
        }
    }
    int salary(){
        int s= age*200;
        return s;
    }

    void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}