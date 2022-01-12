package Story2;

public class Main {
    public static void main(String[] args) throws NoAgeException, NoDryException {
        Carlson carl = new Carlson("Карлсон", 36, 100.0D);
        FrekenBok freken = new FrekenBok("фрекен Бок", 60, 175.0D);
        UncleJulius julius = new UncleJulius("дядя Юлиус", 63, 169.0D);
        class NumberOfPeople{
            int number = 3;
            public NumberOfPeople(){
                this.number=number;
            }
            public void counter() throws Story2.NumberOfPeopleException {
                if(number==3){
                    System.out.println("Героев в нашей истории - трое");
                } else{
                    throw new Story2.NumberOfPeopleException("неверное количество героев");
                }
            }
        }
        NumberOfPeople numberOfPeople = new NumberOfPeople();
        numberOfPeople.counter();

        //вложенный нестатический класс
        BodyParts part1 = new BodyParts("глаза");
        BodyParts.Eyes eyes = part1.new Eyes();
        BodyParts part2 = new BodyParts("голос");
        BodyParts.Voice voice = part2.new Voice();
        WateringPot pot = new WateringPot("лейка", "пластмасса");
        carl.take(pot);
        carl.shower(julius);
        System.out.println(eyes.openEyes(julius));
        freken.wipe(julius);

        try{
            if(freken.x==0){
                throw new NoDryException("ошибка! вытерла не досуха");
            } else{
                freken.leadToTheRoom(julius);
                // работа со статическим вложенным (внутренним) классом
                CurrentPlace.Bedroom hisRoom = new CurrentPlace.Bedroom();
                System.out.println(hisRoom.goingToJuliusRoom());
                System.out.println("оттуда " + voice.comingOfTheVoice(freken));
                // анонимный вложенный класс
                ToBeNaughty toBeNaughty = () -> System.out.println("придумывает " + ToBeNaughty.pranks);
                System.out.print(freken.explainSth(julius));
                toBeNaughty.comeUpWith();
            }
        } catch (NoDryException noDryException){
            System.out.println(noDryException.getMessage());
            System.out.println("надо вытереть досуха, иначе история не продолжится");
        }
        try {
            if (carl.getAge() <= 0 || freken.getAge() <= 0 || julius.getAge() <= 0) {
                throw new NoAgeException("Неправильно введена информация о персонаже");
            }
        } catch (NoAgeException noAgeException) {
            System.out.println(noAgeException.getMessage());
            System.out.println("Введите правильную информацию о персонаже");
        }
    }
}