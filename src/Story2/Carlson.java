package Story2;

public class Carlson extends Human implements Take, Shower {
    Carlson(String name, int age, double height) {
        super(name, age, height);
        System.out.println("Создан персонаж " + this.getName());
    }

    public String toString() {
        String var10000 = this.getName();
        return "Имя персонажа: " + var10000 + ", Возраст персонажа: " + this.getAge() + ", Рост персонажа: " + this.getHeight();
    }
    public void take(Item obj){
        System.out.println(this.getName() + " взял " + obj.getName() );
    }
    public void shower(Human obj){
        System.out.println(this.getName() + " стал поливать " + obj.getName() );
    }
    @Override
    public void take() {}
    @Override
    public void shower() {}
}