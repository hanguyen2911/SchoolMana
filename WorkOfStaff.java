
package project;

import project.*;
import java.util.Scanner;

interface Work1{
    
    public String getNameWork();
    
    public void setNameWork(String nameWork);
    
    public String getLevel();//trình độ
   
    public void setLevel(String level);
   
    public double getCoefSalary();
   
    public void setCoefSalary(double coefSalary);
   
    public int getAllowance();
   
    public void setAllowance(int allowance);
    
}

public class WorkOfStaff extends Employee implements Work1{
    
    protected String nameWork;
    
    protected String level;
    
    protected double coefSalary;
    
    protected int allowance;
    
    protected int numOfWorkday;
    
    public WorkOfStaff(){
        
    }
    
    public WorkOfStaff(String nameWork, String level, double coefSalary, int allowance, int numOfWorkday){
        
        this.nameWork = nameWork;
        
        this.coefSalary =coefSalary;
        
        this.level = level;
        
        this.nameWork = nameWork; 
        
        this.numOfWorkday = numOfWorkday;
    }

    @Override
    public String getNameWork() {
        return nameWork;
    }

    @Override
    public void setNameWork(String nameWork) {
        this.nameWork = nameWork;
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
    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }
    
        public int getNumOfWorkday() {
        return numOfWorkday;
    }

    public void setNumOfWorkday(int numOfWorkday) {
        this.numOfWorkday = numOfWorkday;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        int key;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.print("\n\t\t\t\t\t\t\t Nhap chuc vu:\n\t\t\t\t\t\t\t 1. Hieu truong\n\t\t\t\t\t\t\t 2. Pho hieu truong\n\t\t\t\t\t\t\t 3. Truong phong\n\t\t\t\t\t\t\t 4. Pho phong\n\t\t\t\t\t\t\t 5. Nhan vien\n");          
            System.out.print("\n\t\t\t\t\t\t\t Lua chon cua ban la: ");
            key = input.nextInt();
            
            
            switch(key){
                case 1:
                    nameWork = "Hieu truong";
                    setCoefSalary(2.5);
                    setAllowance(3500);
                    break;
                case 2:
                    nameWork = "Pho hieu truong";
                //    setCoefSalary(2.0);
                    setAllowance(3000);
                    break;
                case 3:
                    nameWork = "Truong phong";
                //    setCoefSalary(1.5);
                    setAllowance(2500);
                    break;
                    
                case 4:
                    nameWork = "Pho phong";
                //    setCoefSalary(1.25);
                    setAllowance(2000);
                    break;
                case 5:
                    nameWork = "Nhan vien";
                //    setCoefSalary(1.0);
                    setAllowance(1500);
                    break;
                default:
                    System.out.println("\t\t\t\t\t\t\t Ban da nhap sai!!");
                    break;
            }
        }while(key < 1 || key > 5);
        input.nextLine();
        
        int m;
        do{
            System.out.printf("\n\t\t\t\t\t\t Nhap trinh do:\n\t\t\t\t 1.(Cu nhan)\n\t\t\t\t\t\t\t 2.(Thac si)\n\t\t\t\t\t\t\t 3.(Tien si)\n");
            System.out.print("\n\t\t\tLua chon cua ban la: ");
            m = input.nextInt();
            
            switch(m){
                case 1:{
                    level = "Cu nhan";
                    break;
                }
                case 2:{
                    level = "Thac si";
                    break;
                }
                case 3:{
                    level = "Tien si";
                    break; 
                }
                default:{
                    System.out.print("\n\t\t\t\t\t\t\t Chon khong dung!");
                    break;
                }
            }
        } while(m < 1 || m > 3);
        System.out.print("\n\t\t\t\t\t\t\t Nhap so ngay cong: ");
        numOfWorkday = input.nextInt();
    }
    
    @Override
    public long Salary(){
        return (long) (getCoefSalary()*700 + getAllowance() + getNumOfWorkday()*200);
    }
    
    @Override
    public String toString(){
        return super.toString()+" Staff[ Name Of Work = " + getNameWork() + ", Level = " + getLevel() + ", CoefSalary = " + getCoefSalary() + ", Allowance = " + getAllowance() + ", Number of workdays = " + getNumOfWorkday() +"]";
    }
    
}
