package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHp(700);
        boss.setDamage(50);
        boss.setDefenceType("Magical");
        System.out.println("Boss's health: " + boss.getBossHp() + ";\nBoss's damage:  " + boss.getDamage() +
                ";\nBoss's defence: " + boss.getDefenceType() + ".");
        for (Hero b : createHeroes()) {
            System.out.println("Hero - damage = " + b.getDamage() + "; health = " + b.getHeroHp() +
                    "; super ability " + b.getSuperAbility() + ".");
        }
    }

    public static Hero[] createHeroes() {
        Hero lucky = new Hero(100, 25, "lucky");
        Hero valkiriya = new Hero(120, 30, "aye damage");
        Hero mag = new Hero(70, 20, "magical");
        return new Hero[]{lucky, valkiriya, mag};

    }
}

//Затем вызвать этот метод в методе main и распечатать информацию о всех героях массива через цикл.
