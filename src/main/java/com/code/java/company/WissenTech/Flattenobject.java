package com.code.java.company.WissenTech;

import java.util.ArrayList;
import java.util.List;

public class Flattenobject {
    public static void main(String[] args) {
        Object[] nested = {1, new Object[]{2, 3}, 4, new Object[]{5, new Object[]{6}}};
        List<Object> flattenObject = new ArrayList<>();
        performFlattenObject(nested,flattenObject);
        System.out.println(flattenObject.toString());

    }

    private static void performFlattenObject(Object[] nested, List<Object> flattenObject) {
        for (Object object: nested){
            if(object instanceof Object[]){
                performFlattenObject((Object[]) object,flattenObject);
            }else {
                flattenObject.add(object);
            }
        }
    }
}
