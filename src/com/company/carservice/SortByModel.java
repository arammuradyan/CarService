package com.company.carservice;

import java.util.Comparator;

public class SortByModel implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if(o1.getModel().compareTo(o2.getModel())<0){
    return -1;
        }
        else if(o1.getModel().compareTo(o2.getModel())>0){
            return 1;
        }else return 0;
    }
}
