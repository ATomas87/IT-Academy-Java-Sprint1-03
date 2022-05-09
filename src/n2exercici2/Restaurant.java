package n2exercici2;

import java.util.Objects;

public class Restaurant implements Comparable {
    private String name;
    private int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        //return score == that.score && Objects.equals(name, that.name);
        return this.score == that.score && this.name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return name + ": " + score + " puntos.";
    }

    @Override
    public int compareTo(Object o) {
        Restaurant that = (Restaurant) o;
        if (this.name.compareTo(that.getName())==0){
            return this.score - that.getScore();
        } else if (this.name.compareTo(that.getName())>0){
            return 1;
        } else {
            return -1;
        }
    }
}
