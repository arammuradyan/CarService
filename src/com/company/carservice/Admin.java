package com.company.carservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin {
private int profit;
private List<Car> cars= new ArrayList<>();



public int getProfit(){

    return profit;
}

public List<Car> getCars(){

    return cars;
}

public void addCar(Car car)
{
    cars.add(car);
}

public void incrementProfit(int carPrice)
{
    profit+=carPrice;
}


public void printCarlist(){
if(cars.isEmpty()){
    System.out.println("\u001B[31m Storage is empty \u001B[0m");
}else{
    int index=0;
    for (Car car:cars) {
    System.out.println(index+" "+car.toString());
index++;
}
}
}


public void saleCar( Scanner scanner){
    if(cars.isEmpty()){
        System.out.println("\u001B[31m Storage is empty \u001B[0m");
        Main.showMenu(scanner,new Admin());}
    System.out.println("choose car to sale");
int index=scanner.nextInt();
    if (index>=0 && index < cars.size()){
        int carPrice=cars.get(index).getPrice();
        incrementProfit(carPrice);
        cars.remove(index);
    }
    else{
        System.out.println(" \u001B[31m wrong number \u001B[0m");
        saleCar(scanner);
    }


}

}
