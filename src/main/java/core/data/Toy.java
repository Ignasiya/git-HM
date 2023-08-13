package core.data;

import java.util.Objects;

public class Toy implements Comparable<Toy> {
    private int id;
    private Short chanceFalling;
    private Integer quantity;
    private String name;


    public Toy(int id, Short chanceFalling, Integer quantity, String name) {
        this.id = id;
        this.chanceFalling = chanceFalling;
        this.quantity = quantity;
        this.name = name;
    }

    public Toy() {
    }

    public int getId() {
        return id;
    }

    public Short getChanceFalling() {
        return chanceFalling;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setToy(Toy toy) {
        this.id = toy.getId();
        this.chanceFalling = toy.getChanceFalling();
        this.quantity = toy.getQuantity();
        this.name = toy.getName();
    }

    public void decreaseQuantity() {
        this.quantity -= 1;
    }

    @Override
    public String toString() {
        return "Игрушка \"" + name + "\", количество [" + quantity + "], шанс выпадения [" + chanceFalling + "%]\n";
    }

    @Override
    public int compareTo(Toy o) {
        return o.chanceFalling > this.chanceFalling ? 1 : -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return id == toy.id;
    }
}
