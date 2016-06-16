package algospot;

import java.util.HashMap;

public class NamesCount {

    private double count;
    private HashMap<String, Double> counts = new HashMap<>();

    /**
     * Adds the name.
     * 
     * @param name
     *            Name.
     */
    public void addName(String name) {
        Double nameCount = counts.get(name);

        if (nameCount == null) {
            nameCount = 0.0;
        }

        nameCount++;
        counts.put(name, nameCount);
        count++;
    }

    /**
     * Returns proportion of parameter name in all calls to addName.
     * 
     * @param name
     *            Name.
     * @return Double in interval [0, 1]. Returns 0 if AddName has not been called.
     */
    public double nameProportion(String name) {
        return counts.get(name) / count;
    }

    public static void main(String[] args) {
        NamesCount namesCount = new NamesCount();

        namesCount.addName("James");
        namesCount.addName("John");
        namesCount.addName("Mary");
        namesCount.addName("Mary");

        System.out.println("Fraction of Johns: " + namesCount.nameProportion("John"));
        System.out.println("Fraction of Marys: " + namesCount.nameProportion("Mary"));
    }

}
