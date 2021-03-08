package javaTutorialBeginner.project36_superMethod;

public class Hero extends Person{
    
    String power;

    Hero(String name, int age, String power){
        super(name, age);
        this.power = power;
    }

    // @Override
    public String toString() {
        // return name+" "+age+" "+power;
        return super.toString() + power;
    }
}
