import java.util.Random;

public class Student {
    String name;
    int age;

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void guessingAge(){
        //METHOD RANDOM WITH MAX NUM 35
        int randomNumber = new Random().nextInt(35);
        System.out.println("The number for "+name+" is "+randomNumber);
        //IF CYCLE
        if (randomNumber>age){
            System.out.println("The random number is bigger than the age of "+name);
        }else if (randomNumber<age) {
            System.out.println("The random number is lesser than the age of "+name);
        }else{
            System.out.println("The random number is equal the age of "+name);
        }
    }
}
