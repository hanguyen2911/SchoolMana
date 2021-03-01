
package project;
/**
 *
 * @author Administrator
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author PNV044
 */
class TestEmployee extends Menu {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);        
        String password = "123456789";
        String guessUser, guessPass;
          
        System.out.println("\t\t\t\t\t ===== Vui long dang nhap vao he thong ====\n");

        System.out.print("\t\t\t\t\t Nhap vao ten nguoi dung: ");
        guessUser = input.nextLine();
        nhapLai:
        while(true){

            System.out.print("\n\t\t\t\t\t Nhap vao mat khau (mat khau gom 9 ki tu): ");
            guessPass = input.nextLine(); 
            
        if( guessPass.trim().equals(password) != true){
            System.out.print("\n\t\t\t\t\t Mat khau khong dung! \n\t\t\t\t\t Vui long nhap lai:\n");
            continue nhapLai;
        
        } else{
        
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t ^^^^^^^^^^ WELCOME: " + guessUser.toUpperCase()+ " ^^^^^^^^^^");
        System.out.println();
        
        System.out.println("\t\t\t\t   ++***********************************************************************************************************++");
        System.out.println("\n\t\t\t\t   ++****************************|      Chuong Trinh Quan Ly Nhan Vien Truong Hoc     |*************************++");
        System.out.println("\n\t\t\t\t   ++***********************************************************************************************************++");
        int n, demTeacher = 0, demStaff = 0;
        int choose;
        long sumSalary = 0;
        ArrayList<Employee> arrEmp = new ArrayList<Employee>();
        QuayLai:
        while (true) {
            int choose1;
            menu();
            do {
                System.out.print("\n\t\t\t\t\t\t Lua chon cua ban la: ");
                choose1 = input.nextInt();
            } while (choose1 < 1 || choose1 > 8);

            switch (choose1) {

                case 1: {

                    Tieptuc:
                    while (true) {

                        System.out.println("\t\t\t\t\t\t -----Nhap thong tin nhan vien thu " + (arrEmp.size() + 1) + "-----");
                        System.out.printf("\t\t\t\t\t\t\t Chon loai nhan vien: \n\t\t\t\t\t\t\t 1.(Teacher) \n\t\t\t\t\t\t\t 2.(Staff)\n");
                        System.out.print("\t\t\t\t\t\t\t Lua chon cua ban la: ");
                        choose = input.nextInt();

                        switch (choose) {

                            case 1:

                                arrEmp.add(new WorkerOfTeacher());
                                arrEmp.get(arrEmp.size() - 1).nhap();
                                demTeacher++;
                                break;

                            case 2:

                                arrEmp.add(new WorkOfStaff());
                                arrEmp.get(arrEmp.size() - 1).nhap();
                                demStaff++;
                                break;

                            default:
                                System.out.println("\t\t\t\t\t\t\tChon khong hop le: ");
                                break;
                        }

                        int t;
                        do {
                            System.out.println("\n\t\t\t\t\t\t\t Ban co muon them nhan vien tiep theo \n\t\t\t\t\t\t\t1.(co) \n\t\t\t\t\t\t\t2.(khong): ");
                            t = input.nextInt();
                        } while (t != 1 && t != 2);

                        if (t == 1) {
                            continue Tieptuc;
                        } else {

                            int a;
                            System.out.print("\n\t\t\t\t\t\t\t Ban co muon quay lai menu chinh khong: \n\t\t\t\t\t\t\t 1 .(Co) \n\t\t\t\t\t\t\t 2. (Khong)\n");
                            System.out.print("\t\t\t\t\t\t\t Lua chon cua ban la: ");
                            a = input.nextInt();

                            if (a == 1) {
                                continue QuayLai;
                            } else {
                                break QuayLai;
                            }
                        }
                    }
                }

                case 2: {

                    if (arrEmp.size() == 0) {
                        System.out.printf("\n\t\t\t\t\t\t Xin loi ban chua nhap thong tin nhan vien");
                    } else {
                        int chon;
                        System.out.println("\t\t\t\t\t\t\t Hien thi danh sach nhan vien trong truong:");
                        for (int i = 0; i < arrEmp.size(); i++) {
                            System.out.println("\t\t\t\t\t\t\tThong tin nhan vien thu "+(i+1));
                            System.out.println("\t\t\t\t\t\t\t" + arrEmp.get(i).toString1());
                            System.out.printf("\t\t\t\t\t\t\t Ban co muon xem thong tin chi tiet cua nhan vien thu " + (i + 1) + ": \n\t\t\t\t\t\t\t 1.(Co) \n\t\t\t\t\t\t\t 2.(Khong)\n");
                            chon = input.nextInt();

                            if (chon == 1) {
                                System.out.println("\t\t\t\t" + arrEmp.get(i).toString());// truy cap den 1 phan tu bat ky trong ArrayList thong qua chi so cua phan tu do
                            } else {
                                continue;
                            }
                        }
                    }
                    int a;
                    System.out.print("\n\t\t\t\t\t\t\t Ban co muon quay lai menu chinh khong: \n\t\t\t\t\t\t\t 1. (Co) \n\t\t\t\t\t\t\t 2. (Khong)\n");
                    System.out.print("\t\t\t\tLua chon cua ban la: ");
                    a = input.nextInt();

                    if (a == 1) {
                        continue QuayLai;
                    } else {
                        break QuayLai;
                    }
                }

                case 3: {

                    if (arrEmp.size() == 0) {
                        System.out.printf("\n\t\t\t\t\t\t Xin loi ban chua nhap thong tin nhan vien");
                    } else {
                        System.out.println("\n\t\t\t\t\t\t\t So luong giao vien trong truong la: " + demTeacher);
                        System.out.print("\t\t\t\t\t\t\t So luong Staff trong truong la: " + demStaff);
                    }

                    int a;
                    System.out.print("\n\t\t\t\t\t\t\t Ban co muon quay lai menu chinh khong: \n\t\t\t\t\t\t\t 1. (Co) \n\t\t\t\t\t\t\t 2. (Khong)\n");
                    System.out.print("\t\t\t\t\t\t\t Lua chon cua ban la: ");
                    a = input.nextInt();

                    if (a == 1) {
                        continue QuayLai;
                    } else {
                        break QuayLai;
                    }
                }

                case 4: {

                    if (arrEmp.size() == 0) {
                        System.out.printf("\n\t\t\t\t\t\t Xin loi ban chua nhap thong tin nhan vien");
                    } else {
                        int choice;

                        do {
                            System.out.printf("\t\t\t\t\t\t\t Ban co muon xem tong luong cua nhan vien khong?\n\t\t\t\t\t\t\t 1.(Co) \n\t\t\t\t\t\t\t 2.(Khong) \n");
                            choice = input.nextInt();
                        } while (choice != 1 && choice != 2);

                        if (choice == 1) {
                            for (int i = 0; i < arrEmp.size(); i++) {
                                long salary = arrEmp.get(i).Salary();
                                sumSalary += salary;
                            }

                            System.out.println("\t\t\t\t\t\t\t Tong luong phai tra cho nhan vien cua truong la = " + sumSalary);

                        } else {
                            System.out.println("\t\t\t\t\t\t\t Ban da chon khong xem tong luong!!");
                        }
                    }

                    int a;
                    System.out.print("\n\t\t\t\t\t\t\t Ban co muon quay lai menu chinh khong: \n\t\t\t\t\t\t\t 1. (Co) \n\t\t\t\t\t\t\t 2. (Khong)\n");
                    System.out.print("\t\t\t\t\t\t\t Lua chon cua ban la: ");
                    a = input.nextInt();

                    if (a == 1) {
                        continue QuayLai;
                    } else {
                        break QuayLai;
                    }
                }

                case 5: {

                    if (arrEmp.size() == 0) {
                        System.out.printf("\n\t\t\t\t\t\t Xin loi ban chua nhap thong tin nhan vien");
                    } else {
                        int c;
                        long avrSalary = 0;

                        do {
                            System.out.printf("\t\t\t\t\t\t\t Ban co muon xem muc luong trung binh cua nhan vien toan truong khong?\n\t\t\t\t\t\t\t 1.(Co) \n\t\t\t\t\t\t\t 2.(Khong) ");
                            c = input.nextInt();
                        } while (c != 1 && c != 2);

                        if (c == 1) {
                            avrSalary = sumSalary / arrEmp.size();
                            System.out.println("\t\t\t\t\t\t\t Luong trung binh cua nhan vien toan truong la: " + avrSalary);

                        } else {
                            System.out.println("\t\t\t\t\t\t\t Ban da chon khong xem muc luong trung binh!!");
                        }
                    }

                    int a;
                    System.out.print("\n\t\t\t\t\t\t\t Ban co muon quay lai menu chinh khong: \n\t\t\t\t\t\t\t 1. (Co) \n\t\t\t\t\t\t\t 2. (Khong)\n");
                    System.out.print("\t\t\t\t\t\t\t Lua chon cua ban la: ");
                    a = input.nextInt();

                    if (a == 1) {
                        continue QuayLai;
                    } else {
                        break QuayLai;
                    }
                }

                case 6: {

                    if (arrEmp.size() == 0) {
                        System.out.printf("\n\t\t\t\t\t\t Xin loi ban chua nhap thong tin nhan vien");
                    } else {
                        int b;

                        do {
                            System.out.printf("\t\t\t\t\t\t\t Ban co muon xem danh sach nhan vien theo muc luong tang dan khong?\n\t\t\t\t\t\t\t 1.(Co) \n\t\t\t\t\t\t\t 2.(Khong) \n");
                            b = input.nextInt();
                        } while (b != 1 && b != 2);

                        if (b == 1) {
                            for (int i = 0; i < arrEmp.size() - 1; i++) {
                                for (int j = i + 1; i < arrEmp.size(); i++) {
                                    if (arrEmp.get(i).Salary() > arrEmp.get(i).Salary()) {

                                        Employee temp = arrEmp.get(i);
                                        arrEmp.set(i,arrEmp.get(j));
                                        arrEmp.set(j, temp);

                                    }
                                }
                            }

                            for (int i = 0; i < arrEmp.size(); i++) {
                                System.out.println("\t\t\t\t\t\t\t"+arrEmp.get(i).toString1() + " co muc luong la: " + arrEmp.get(i).Salary());
                            }
                        } else {
                            System.out.println("\t\t\t\t\t\t\t Ban khong chon xem danh sach nhan vien theo muc luong trung binh!!");
                        }
                    }
                    int a;
                    System.out.print("\n\t\t\t\t\t\t\t Ban co muon quay lai menu chinh khong: \n\t\t\t\t\t\t\t 1. (Co) \n\t\t\t\t\t\t\t 2. (Khong)");
                    a = input.nextInt();
                    if (a == 1) {
                        continue QuayLai;
                    } else {
                        break QuayLai;
                    }
                }

                case 7: {

                    if (arrEmp.size() == 0) {
                        System.out.printf("\n\t\t\t\t\t\t Xin loi ban chua nhap thong tin nhan vien");
                    } else {
                        int b;

                        do {
                            System.out.printf("\t\t\t\t\t\t\t Ban co muon xem nhan vien co muc luong cao nhat khong?\n\t\t\t\t\t\t\t 1.(Co) \n\t\t\t\t\t\t\t 2.(Khong) \n");
                            b = input.nextInt();
                        } while (b != 1 && b != 2);

                        if (b == 1) {
                            long max = arrEmp.get(0).Salary();
                            for (int i = 1; i < arrEmp.size(); i++) {
                                if (max < arrEmp.get(i).Salary()) {
                                    max = arrEmp.get(i).Salary();
                                }
                            }

                            for (int i = 0; i < arrEmp.size(); i++) {
                                if (max == arrEmp.get(i).Salary()) {
                                    System.out.println("\t\t\t\t\t\t\t"+arrEmp.get(i).toString() + " co muc luong cao nhat la: " + max);
                                }
                            }

                        }
                    }
                    int a;
                    System.out.print("\n\t\t\t\t\t\t\t Ban co muon quay lai menu chinh khong: \n\t\t\t\t\t\t\t 1. (Co) \n\t\t\t\t\t\t\t 2. (Khong)");
                    a = input.nextInt();
                    if (a == 1) {
                        continue QuayLai;
                    } else {
                        break QuayLai;
                    }
                }

                case 8:
                    System.out.println("\n\t\t\t\t\t\t ========================Chuong Trinh ket thuc==========================");
                    break QuayLai;
                    }
                }
            }
        }
    }
}


