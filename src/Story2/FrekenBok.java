package Story2;

import java.util.Random;

public class FrekenBok extends Human implements Wipe,LeadToTheRoom,ExplainSth {
    FrekenBok(String name, int age, double height) {
        super(name, age, height);
        System.out.println("Создан персонаж " + this.getName());
    }

    public String toString() {
        String var10000 = this.getName();
        return "Имя персонажа: " + var10000 + ", Возраст персонажа: " + this.getAge() + ", Рост персонажа: " + this.getHeight();
    }
    public int x;
    public void wipe(Human obj) {
        FrekenBok.Condition dryness = FrekenBok.Condition.DRY;
        Random random = new Random();
        int i = random.nextInt(2);
        switch(i) {
            case 0:
                dryness = FrekenBok.Condition.DRY;
                break;
            case 1:
                dryness = FrekenBok.Condition.STILL_WET;
                break;
        }
        System.out.println(this.getName() + " вытерла " + obj.getName() + " " + dryness.condition);
        if(dryness.condition.equals("не досуха")){ x = 0;}else{x=1;}
    }
    public void leadToTheRoom(Human obj){
        System.out.println(this.getName() + " отвела в комнату " + obj.getName());
    }
    public String explainSth(Human obj) {
        // локальный класс
        class Explanation{
            String explain(){return " объясняла " + obj.getName() + " , что этот толстый мальчишка - школьный товарищ Малыша и что всякий раз он ";}
        }
        Explanation e = new Explanation();
        return this.getName() + e.explain();
    }

    @Override
    public String explainSth() {
        return null;
    }

    @Override
    public void leadToTheRoom() {

    }

    public enum Condition {
        DRY("досуха"),
        STILL_WET("не досуха");
        private final String condition;
        Condition(String condition){
            this.condition = condition;
        }
    }
    @Override
    public void wipe(){}
}