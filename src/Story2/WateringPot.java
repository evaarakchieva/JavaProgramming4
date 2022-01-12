package Story2;

import Story2.Item;

public class WateringPot extends Item {
    WateringPot(String name, String material) {
        super(name, material);
        System.out.println("Создан предмет " + this.getName());
    }
    public String toString() {
        String var10000 = this.getName();
        return "Имя предмета: " + var10000 + ", Состав предмета: " + this.getMaterial();
    }
}
