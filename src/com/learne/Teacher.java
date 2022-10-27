package com.learne;

public class Teacher extends User {
    private int experience;
    public Teacher(){}
    public Teacher(int experience,String name){
        super(name);
        this.experience=experience;
    }
    public int getExperience(){
        return experience;
    }
    public void setExperience(int experience){
        this.experience=experience;
    }
    public void printInfo(){
        System.out.println("about teacher:" + experience + getName());
    }
}
