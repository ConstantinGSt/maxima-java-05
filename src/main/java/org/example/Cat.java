package org.example;

public class Cat {
    private String name;
    private int weight;
    private boolean isAngry;

    public Cat(String name, int weight, boolean isAngry) throws IncorrectCatWeightException {
        setName(name);
        setWeight(weight);
        setAngry(isAngry);
    }

    public Cat(String name, int weight) throws IncorrectCatWeightException {
        setName(name);
        setWeight(weight);
        setAngry(true);
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) throws IncorrectCatWeightException {
        if(weight <= 0) {
            throw new IncorrectCatWeightException();
        }
        this.weight = weight;
    }
    /*public String toString() {
        return "Cat { "
                + "Cat name=\"" + getName() + "\""
                + ", weight=" + getWeight()
                + ", isAngry=" + isAngry()
                + " }";
    } */
    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        this.isAngry = angry;
    }
}
