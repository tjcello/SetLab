/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setlab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author tduwe
 */
public class Turkey implements Comparable {

    private int tagId;
    private String name;
    private String color;

    public Turkey(int tagId, String name, String color) {
        this.tagId = tagId;
        this.name = name;
        this.color = color;
    }

    public int gettagId() {
        return tagId;
    }

    public void settagId(int turkeyId) {
        this.tagId = tagId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.tagId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Turkey other = (Turkey) obj;
        if (this.tagId != other.tagId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Turkey ID: " + tagId + "      Name: " + name + "       Color: " + color;
    }

    @Override
    public int compareTo(Object other) {
        Turkey t = (Turkey) other;

        return new CompareToBuilder()
                .append(this.tagId, t.tagId)
//                .append(this.color, t.color)
//                .append(this.name, t.name)
                .toComparison();
    }

    public static void main(String[] args) {
        Turkey turkey1 = new Turkey(24, "George", "Brown");
        Turkey turkey2 = new Turkey(66, "Matilda", "White");
        Turkey turkey3 = new Turkey(37, "Bob", "Grey");
        Turkey turkey4 = new Turkey(96, "Harry", "Brown");
        Turkey turkey5 = new Turkey(66, "Helga", "Brown");
        Turkey turkey6 = new Turkey(11, "Zach", "Purple");

        Set<Turkey> set = new TreeSet<Turkey>();
        set.add(turkey1);
        set.add(turkey2);
        set.add(turkey3);
        set.add(turkey4);
        set.add(turkey5);
        set.add(turkey6);
        

        for (Turkey t : set) {
            System.out.println(t);

        }

        System.out.println("_______________________________________________________________");

        List<Turkey> list = new ArrayList<>(set);

        Collections.sort(list, new TurkeyByName());

        for (Turkey e : list) {
            System.out.println(e);
        }
        System.out.println("_______________________________________________________________");

        Collections.sort(list, new TurkeyByColor());

        for (Turkey f : list) {
            System.out.println(f);
        }

    }

}
