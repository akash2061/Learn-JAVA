package oops;

public class Capsule {
    private String name;
    private int year;

    public Capsule(String name, int year) {
        this.setName(name);
        this.setYear(year);
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }
}
