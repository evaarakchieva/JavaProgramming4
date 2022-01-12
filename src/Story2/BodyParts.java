package Story2;

public class BodyParts {
    protected String nameOfThePart;
    public BodyParts(String nameOfThePart){this.nameOfThePart = nameOfThePart;}
    // вложенные классы нестатические
    public class Eyes{
        public String openEyes(Human obj){return obj.getName() + " открыл " + nameOfThePart;}
    }
    public class Voice{
        public String comingOfTheVoice(Human obj){return "доносился " + nameOfThePart + " " + obj.getName();}
    }
}
