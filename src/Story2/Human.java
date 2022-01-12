package Story2;

import java.util.Objects;

public abstract class Human {
    private  String name;
    private int age;
    private  double height;

    Human(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getHeight() {
        return this.height;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj != null && obj.getClass() == this.getClass()) {
            Human person = (Human)obj;
            return Objects.equals(this.name, person.name) && Objects.equals(this.age, person.age) && Objects.equals(this.height, person.height);
        } else {
            return false;
        }
    }

    public abstract String toString();

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.age, this.height});
    }

}
