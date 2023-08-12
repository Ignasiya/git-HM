package core.data;

import java.util.Objects;

public class Toy implements Comparable<Toy> {
    private int id;
    private Integer chanceFalling;
    private Integer quantity;
    private String name;


    public Toy(int id, Integer chanceFalling, Integer quantity, String name) {
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

    public Integer getChanceFalling() {
        return chanceFalling;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setChanceFalling(Integer chanceFalling) {
        try {
            if (chanceFalling <= 0 || chanceFalling == null) throw new RuntimeException();
            this.chanceFalling = chanceFalling;
        } catch (RuntimeException e) {
            System.out.println("шанс выпадения задан неверно,\n принимаются значения от 1 до 9");
        }
    }

    public void decreaseQuantity() {
        this.quantity -= 1;
    }

    @Override
    public String toString() {
        return "Игрушка \"" + name + "\", количество [" + quantity + "], шанс выпадения [" + chanceFalling * 10 + "%]\n";
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
