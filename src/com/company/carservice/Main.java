package com.company.carservice;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       Admin admin=new Admin();
        showMenu(scanner,admin);
    }

     static void showMenu(Scanner scanner, Admin admin){
        System.out.println("Choose action");
        System.out.println("1. show car list 2. sale a car    3. add new car 4. sort by model");
        System.out.println("5. sort by year  6. sort by price 7. show profit 8. exit" );
        int i =scanner.nextInt();
        switch (i){
            case 1:
                admin.printCarlist();
                showMenu(scanner,admin);
            break;
                case 2:
                    System.out.println("1. Sale 2. Return to main menu");
                    int j=scanner.nextInt();
                    if (j==1){
                        admin.saleCar(scanner);
                        System.out.println("Choosen car saled");
                        showMenu(scanner,admin);}
                    else
                    { showMenu(scanner,admin); }
                break;
            case 3:
                System.out.println("1. Add 2. Return to main menu");
                int k=scanner.nextInt();
                if (k==1){
                Model model=chooseModelMenu(scanner);
                admin.addCar(createNewCar(scanner,model));
                    System.out.println("a new car added");
                showMenu(scanner,admin);}
                else { showMenu(scanner,admin);}
                break;
            case 4:
                System.out.println("Cars list sort by model");
                Collections.sort(admin.getCars(),new SortByModel());
                admin.printCarlist();
                showMenu(scanner,admin);
                break;
            case 5:
                System.out.println("Cars list sort by year");
                Collections.sort(admin.getCars(),new SortByYear());
                admin.printCarlist();
                showMenu(scanner,admin);
                break;
            case 6:
                System.out.println("Cars list sort by price");
                Collections.sort(admin.getCars(),new SortByPrice());
                admin.printCarlist();
                showMenu(scanner,admin);
                break;
            case 7:
                System.out.println("amount profit - "+admin.getProfit());
                showMenu(scanner,admin);
                break;
            case 8:
                System.out.println("amount profit - "+admin.getProfit());
                System.out.println("Work is done !!!");
                break;
                default:
                    System.out.println("\u001B[31m Wrong number \u001B[0m");
                    showMenu(scanner,admin);
                    break;
        }

    }

    private static Car createNewCar(Scanner scanner,Model model){
    System.out.println("input price");
    int price =scanner.nextInt();

    System.out.println("input year");
    int year =scanner.nextInt();

    return new Car(model,year,price);
    }

    private static Model chooseModelMenu(Scanner scanner){
        System.out.println("choose car model");
        System.out.println("1.BMW 2.MERCEDES 3.KIA 4.VAZ 5.ERAZ");
        int choosenValue= scanner.nextInt();
        Model model= chooseModel(choosenValue);
        while (model==Model.NOSELECTED){

            model=chooseModelMenu(scanner);
        }
    return model;
    }


    private static Model chooseModel(int number){
        switch (number){
            case 1:
                return Model.BMW;
            case 2:
                return Model.MERCEDES;
            case 3:
                return Model.KIA;
            case 4:
                return Model.VAZ;
            case 5:
                return Model.ERAZ;
                default:
                    System.out.println("\u001B[31m Wrong number \u001B[0m");
                    return Model.NOSELECTED;
        }
}
}
