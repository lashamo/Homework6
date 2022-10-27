package com.learne;

public class Student extends User{
    private double averageMark;
    private int missDaysNumber;

    private boolean yesOrNo;

    private int missLimit;
    public Student(){}
    public Student(double averageMark, int missDaysNumber, int missLimit ,boolean yesOrNo,String name){
        super(name);
        this.averageMark=averageMark;
        this.missDaysNumber=missDaysNumber;
        this.missLimit=missLimit;
    }

    public double getAverageMark(){
        return averageMark;
    }
    public void setAverageMark(double averageMark){
        this.averageMark=averageMark;
    }
    public int getMissDaysNumber(){
        return missDaysNumber;
    }
    public void setMissDaysNumber(int missDaysNumber){
        this.missDaysNumber=missDaysNumber;
    }
    public int getMissLimit(){
        return missLimit;
    }
    public void setMissLimit(int missLimit){
        this.missLimit=missLimit;
    }

    public boolean isYesOrNo(){
        return yesOrNo;
    }
    public void setYesOrNo(boolean yesOrNo){
        this.yesOrNo=yesOrNo;
    }

    public boolean yesOrNo(){
        if (missDaysNumber>missLimit){
            yesOrNo=true;
        }else {
            yesOrNo=false;
        }
        return yesOrNo;

    }

    public void printInfo(){
        System.out.println("about students:" + averageMark +"  " + missLimit +"  " + yesOrNo );
    }










}
