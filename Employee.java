
package project;

import java.util.ArrayList;
import java.util.Scanner;


 interface Person{
   
   public int getId();
   
   public void setId(int id);     
     
   public String getName();
   
   public void setName(String name);
   
   public char getGender();
   
   public void setGender(char gender);
   
   public int getAge();
   
   public void setAge(int age);
   
   public String getPosition();
   
   public void setPosition(String position);
   
   
}
public class Employee implements Person{
    
    protected int id;
    
    protected String name;//Ten nhan vien
    
    protected int age;//Tuoi nhan vien
    
    protected char gender;//Gioi tinh nhan vien
    
    protected String position;//Ten chuc vu
    
    protected int choose;//Chon chuc vu
    
    protected Employee nhanVien;
     
    public Employee() {
        super();
    }
    
    public Employee(int id, String name, int age, char gender, String position){
        this.id = id;
        
        this.name = name;
        
        this.age = age;
        
        this.gender = gender;
        
        this.position = position;
    }
    
    
    @Override
    public int getId() {
         return id;

    }     
         
    @Override
    public void setId(int id) {
        this.id = id;
    }
     
    
    @Override
        public String getName(){
        return name;
   }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
       
    @Override
    public char getGender(){
        return gender;
    }    
   
    
    @Override
    public void setGender(char gender) {
        this.gender = gender;
    }
   
    
    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setPosition(String position) {
        this.position = position;
    }

    public void nhap(){
        
        Scanner input = new Scanner(System.in);
        System.out.print("\t\t\t\t\t\t\t Nhap id: ");
        id = input.nextInt();
        System.out.print("\n\t\t\t\t\t\t\t Nhap ho va ten: ");
        input.nextLine();
        name = input.nextLine();
        System.out.print("\n\t\t\t\t\t\t\t Nhap tuoi: ");
        age = input.nextInt();
        
        do{
            System.out.printf("\n\t\t\t\t\t\t\t Nhap gioi tinh: \n\t\t\t\t\t\t\t F.(Nam) \n\t\t\t\t\t\t\t M.(Nu):\n");
            System.out.print("\n\t\t\t\t\t\t\t Lua chon cua ban la: ");
            input.nextLine();
            gender = input.nextLine().charAt(0);
        }while(gender !='F' && gender !='M'&& gender != 'f' && gender!='m');
           
        }
    
    public String getGender2() {
            if(gender == 'F'|| gender == 'f')
                return("Nam");
            else
                return("Nu");    
        }   
    
    public long Salary(){
        return 0;
    }
    
    
    @Override
    public String toString(){
        return "Employee[Id: " + getId() + ", Name :" + getName() + ", Age:" + getAge() + ", Gender: " + getGender2()+"]" ;
    }
    
        public String toString1(){
        return "Employee[Id: " + getId() + ", Name :" + getName() + ", Age:" + getAge() + ", Gender: " + getGender2()+"]" ;
    }

   
}



     

    
    

