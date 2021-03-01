/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author PNV044
 */
import java.util.Scanner;

import project.*;

interface Worker {
    
    public String getCourse();//khóa học
   
    public void setCourse(String course);
   
    public String getSubject();
   
    public void setSubject(String subject);
   
    public String getLevel();//trình độ
   
    public void setLevel(String level);
   
    public double getCoefSalary();
   
    public void setCoefSalary(double coefSalary);
   
    public int getAllowance();
   
    public void setAllwance(int allowance);
    
}
    
        
public class WorkerOfTeacher extends Employee implements Worker{
    protected String course;//Khoa day
    
    protected String subject;//Mon day
    
    protected String level;//Trinh do
    
    protected double coefSalary;//He so luong
    
    protected int allowance;//Phu cap
    
    protected int numLesson;
    
    public WorkerOfTeacher(){
        
    }
    
    public WorkerOfTeacher(String course, String subject, String level, double coefSalary, int allowance, int numLesson, int choose){
        this.course = course;
        this.subject = subject;
        this.level = level;
        this.coefSalary =coefSalary;
        this.allowance = allowance;
        this.numLesson = numLesson;
    }


    @Override
    public String getCourse() {
        return course;
    }

    @Override
    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String getSubject() {
        return subject;
    }

    @Override
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getLevel() {
        return level;
    }

    @Override
    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public double getCoefSalary() {
        return coefSalary;
    }

    @Override
    public void setCoefSalary(double coefSalary) {
        this.coefSalary = coefSalary;
    }

    @Override
    public int getAllowance() {
        return allowance;
    }

    @Override
    public void setAllwance(int allowance) {
        this.allowance = allowance;
    }
         
    public int getNumLesson(){
        return numLesson;
    }
    
    public void setNumLesson(){ 
        this.numLesson = numLesson;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("\t\t\t\t\t\t\t Nhap khoa day:");
        course = input.nextLine();
        System.out.print("\n\t\t\t\t\t\t\t Nhap mon day:");
        subject = input.nextLine();
        do{
            System.out.printf("\n\t\t\t\t\t\t\t Nhap trinh do:\n\t\t\t\t\t\t\t 1.(Cu nhan)\n\t\t\t\t\t\t\t 2.(Thac si)\n\t\t\t\t\t\t\t 3.(Tien si)\n");
            System.out.print("\n\t\t\t\t\t\t\t Lua chon cua ban la: ");
            n = input.nextInt();
            
            switch(n){
                case 1:{
                    level = "Cu nhan";
                    setAllwance(300);
                    break;
                }
                case 2:{
                    level = "Thac si";
                    setAllwance(500);
                    break;
                }
                case 3:{
                    level = "Tien si";
                    setAllwance(1000);
                    break; 
                }
                default:{
                    System.out.print("\n\t\t\t\t\t\t\t Chon khong dung!");
                    break;
                }
            }
        } while(n < 1 || n > 3);
        
            System.out.print("\n\t\t\t\t\t\t\t Nhap he so luong:");
            coefSalary = input.nextDouble();
            System.out.print("\n\t\t\t\t\t\t\t Nhap so tiet day: ");
            numLesson = input.nextInt();
        
    }
    

    @Override
    public long Salary() {
        return (long) (getCoefSalary() * 500  + getAllowance() + getNumLesson() * 45);
    }
    
    @Override
    public String toString(){
        return super.toString()+" Teacher[ Course: " + getCourse() + ", Subject: " + getSubject() + ", Level: " + getLevel() + ", CoefSalary: " + getCoefSalary() +", Allowance: " + getAllowance() + ", Number of Lesson: " + getNumLesson() + "]";
    }

}
