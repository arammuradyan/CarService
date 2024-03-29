package com.company.carservice;

import java.util.Comparator;

public class SortByYear implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if(o1.getYear()-o2.getYear()>0){
            return 1;
        }else if(o1.getYear()-o2.getYear()<0){
            return -1;
        }else return 0;
    }
}
