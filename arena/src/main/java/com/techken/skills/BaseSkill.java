package com.techken.skills;

public abstract class BaseSkill {
    private String name;
    private Object action;

    public BaseSkill(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Object getAction() {
        return action;
    }

    public void setAction(Object action) {
        this.action = action;
    }
}
