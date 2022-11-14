package Set;

import java.util.Scanner;
import java.util.TreeSet;

public class Set {

    Scanner input = new Scanner(System.in);

    TreeSet<Integer> treeSetA = new TreeSet<>();
    TreeSet<Integer> treeSetB = new TreeSet<>();
    TreeSet<Integer> setUnion = new TreeSet<>();
    TreeSet<Integer> setIntersection = new TreeSet<>();
    private int setA;
    private int setB;

    public void unionSet() {
        for (int i = 0; i <= 2; i++) {
            System.out.println("Elements of set A: {");
            this.setA = input.nextInt();
            this.treeSetA.add(this.setA);
            setUnion.addAll(this.treeSetA);
        }
        for (int x = 0; x <= 2; x++) {
            System.out.println("Elements of set B: {");
            this.setB = input.nextInt();
            this.treeSetB.add(this.setB);
            setUnion.addAll(this.treeSetB);
        }
        System.out.println("Union of Set: {" + this.setUnion + "}");
    }

    public void intersectionSet() {
        this.setIntersection.add(this.setA);
        this.setIntersection.add(this.setB);
        this.setIntersection.retainAll(setIntersection);
        System.out.println("Intersection of Set: {" + this.setIntersection + "}");
    }
}
