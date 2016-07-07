package com.tikal.course.java.model.customers;

import java.util.List;

/**
 * Created by Haim.Turkel on 9/10/2015.
 *
 * not all parameters need to be part of constructor
 */
public class Female extends Person{
    private int childCount;

    public Female(Integer id, String firstName, String lastName, int age) {
        super(id,firstName, lastName, age);
        childCount = 0;

    }
    public Female(String firstName, String lastName, int age) {
        this(null,firstName,lastName,age);
    }

    public int getChildCount() {
        return childCount;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    @Override
    public String getTitle() {
        return "MRS " + super.getTitle();
    }


    @Override
    public String toString() {
        return "Female{" +
                "childCount=" + childCount +
                '}' + super.toString();
    }

    public static <T extends Comparable<? super T>> T max(List<? extends T> list, int begin, int end){
        T maxElement = list.get(begin);
        return  maxElement;
    }
}
