package study_works;

public class Cats implements Comparable<Cats> {
    private String name;
    private int weight;

    public Cats(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Cats randomCat) {
        if (this.weight > randomCat.weight) {
            return 1;
        } else if (this.weight < randomCat.weight) {
            return -1;
        } else if (this.weight == randomCat.weight) {
            if (this.getName().charAt(0) > randomCat.getName().charAt(0)) {
                return -1;
            } else {
                return 1;
            }
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Вес: " + weight;
    }
}
