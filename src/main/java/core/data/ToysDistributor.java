package core.data;

import java.util.PriorityQueue;
import java.util.Queue;

public class ToysDistributor {
    private Queue<Toy> toys;

    public ToysDistributor(Queue<Toy> toys) {
        this.toys = toys;
    }

    public ToysDistributor() {
    }

    public Queue<Toy> getToys() {
        return toys;
    }

    public void setToys(Queue<Toy> toys) {
        this.toys = toys;
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public int maxId() {
        if (toys == null){
            this.toys = new PriorityQueue<>();
            return 1;
        }
        int max = 0;
        for (Toy toy : toys) {
            if (toy.getId() > max) max = toy.getId();
        }
        return max;
    }

    public Toy searchById(int search) {
        for (Toy toy : toys) {
            if (toy.getId() == search) return toy;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Toy toy : toys) {
            result.append(toy.toString());
        }
        return result.toString();
    }
}
