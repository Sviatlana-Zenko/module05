package by.java_online.module05.task04.entity;

public class Dragon {
    private String name;
    private Cave cave;

    public Dragon() {
        name = "";
        cave = new Cave();
    }

    public Dragon(String name) {
        this.name = name;
        cave = new Cave();
    }

    public Dragon(String name, Cave cave) {
        this.name = name;
        this.cave = cave;
    }

    public String getName() {
        return name;
    }

    public Cave getCave() {
        return cave;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCave(Cave cave) {
        this.cave = cave;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "name: " + name +
                ", cave: " + cave +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cave == null) ? 0 : cave.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        Dragon other = (Dragon) obj;
        if (cave == null) {
            if (other.cave != null)
                return false;
        } else if (!cave.equals(other.cave))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}