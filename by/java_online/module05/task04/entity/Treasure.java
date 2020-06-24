package by.java_online.module05.task04.entity;

public class Treasure {
    private int cost;
    private String description;

    public Treasure() {
        cost = 0;
        description = "";
    }

    public Treasure(int cost, String description) {
        this.cost = cost;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "cost:" + cost +
                ", description: " + description +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cost;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Treasure other = (Treasure) obj;
        if (cost != other.cost)
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        return true;
    }
}