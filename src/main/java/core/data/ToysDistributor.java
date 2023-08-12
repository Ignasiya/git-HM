package core.data;

import java.util.Queue;

public class ToysDistributor {
    private Queue<Toy> toys;

    public ToysDistributor(Queue<Toy> toys) {
        this.toys = toys;
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
