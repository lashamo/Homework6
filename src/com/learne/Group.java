package com.learne;

public class Group {
    private static final int STUDENT_MAX_NUMBER = 1000;
    private int level;
    private Teacher teacher;
    private Student[] studentsArr;

    public Group() {
    }

    public Group(int level, Teacher teacher) {
        this.level = level;
        this.teacher = teacher;
        studentsArr=new Student[STUDENT_MAX_NUMBER];
    }

    public int getLevel(){
        return level;
    }
    public void setLevel(int level){
        this.level=level;
    }
    public Teacher getTeacher(){
        return teacher;
    }
    public void setTeacher(Teacher teacher){
        this.teacher=teacher;
    }






}
