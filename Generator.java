package OOP_1;

import java.util.Random;
public class Generator {

    public String[] surname = new String[]{
    "Алексеев", "Беляев", "Иванов", "Петров", "Костров", "Сидоров", "Чернов", "Щербаков"}; 

    public String[] name = new String[]{
    "Андрей", "Антон", "Виктор", "Геннадий", "Иван", "Роман", "Сергей", "Юрий"};

    public String[] unitType = new String[]{"crossbowman", "thug", "farmer", "wizard", "monk", "pikeman", "sniper"};

    public String getName(){
        Random random = new Random();
        return surname[random.nextInt(surname.length)] + " " + name[random.nextInt(name.length)];
    }

    public String getUnitType(){
        Random random = new Random();
        return unitType[random.nextInt(unitType.length)];
    }
}