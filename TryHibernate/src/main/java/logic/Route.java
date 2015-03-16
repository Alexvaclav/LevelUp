package logic;

import java.util.HashSet;
import java.util.Set;

public class Route {

    private long id;
    private String name;
    private int number;
    private Set busses = new HashSet();

    public Route() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Set getBusses() {
        return busses;
    }

    public void setBusses(Set busses) {
        this.busses = busses;
    }
}
