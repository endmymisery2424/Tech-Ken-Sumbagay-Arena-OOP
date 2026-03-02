package com.techken.model;

import com.techken.skills.BaseSkill;

public abstract class BaseCharacter {
    private String name;
    private int health;
    private int speed;
    private int defense;
    protected BaseSkill[] skills; // store lng skills here, protected para ma read sa uban chars

    public BaseCharacter(String name, int health, int speed, int defense) {
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.defense = defense;
        this.skills = new BaseSkill[3]; // store skill here, change if naay more
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDefense() {
        return defense;
    }

    public BaseSkill[] getSkills() {
        return skills;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }
}
