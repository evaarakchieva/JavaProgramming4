package Story2;

import Story2.Human;

public class UncleJulius extends Human {

    UncleJulius(String name, int age, double height) {
        super(name, age, height);
        System.out.println("Создан персонаж " + this.getName());
    }

    public String toString() {
        String var10000 = this.getName();
        return "Имя персонажа: " + var10000 + ", Возраст персонажа: " + this.getAge() + ", Рост персонажа: " + this.getHeight();
    }
}
