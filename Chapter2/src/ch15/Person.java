package ch15;

public class Person {

    String personName;
    int money;

    public Person(String personName, int money){
        this.personName = personName;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi){
        taxi.take(10000);
        this.money -= 10000;
    }

    public void showInfor () {
        System.out.println(personName + "님의 잔액은 " + money + "원 입니다.");
    }

}
