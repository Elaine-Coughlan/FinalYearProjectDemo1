package com.elaine.demo1;

import java.util.ArrayList;



public class Constants {

    public static ArrayList<Tasks> getList(){

        ArrayList<Tasks> tasklist = new ArrayList<Tasks>();

        Tasks task1 = new Tasks("Breakfast","Something filling");
        Tasks task2 = new Tasks("Morning Stretches","10 mins for back");
        Tasks task3 = new Tasks("Brush Teeth","At least 30 seconds");
        Tasks task4 = new Tasks("Walk","Finish podcast while walking");
        Tasks task5 = new Tasks("Breakfast","Something filling");
        Tasks task6 = new Tasks("Morning Stretches","10 mins for back");
        Tasks task7 = new Tasks("Brush Teeth","At least 30 seconds");
        Tasks task8 = new Tasks("Walk","Finish podcast while walking");

        tasklist.add(task1);
        tasklist.add(task2);
        tasklist.add(task3);
        tasklist.add(task4);
        tasklist.add(task5);
        tasklist.add(task6);
        tasklist.add(task7);
        tasklist.add(task8);

        return  tasklist;
    }
}
