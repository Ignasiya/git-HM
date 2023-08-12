package core.data;

public class Toy implements Comparable<Toy> {
    private int id;
    private Integer chanceFalling;
    private Integer quantity;
    private final String name;


    public Toy(int id, Integer chanceFalling, Integer quantity, String name) {
        this.id = id;
        this.chanceFalling = chanceFalling;
        this.quantity = quantity;
        this.name = name;
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
        return "Игрушка \"" + name + "\", количество [" + quantity + "], шанс выпадения [" + chanceFalling + "]\n";
    }

    @Override
    public int compareTo(Toy o) {
        return o.chanceFalling > this.chanceFalling ? 1 : -1;
    }
}