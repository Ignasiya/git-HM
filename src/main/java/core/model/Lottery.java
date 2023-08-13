package core.model;

import core.data.Client;
import core.data.Toy;
import core.data.ToysDistributor;

import java.util.*;

public class Lottery extends Mode {
    private final List<Integer> id = new ArrayList<>();
    private final List<Short> chance = new ArrayList<>();
    private int count;

    public Lottery() {
        super("start", "начать розыгрыш игрушек");
    }

    @Override
    public void execute(ToysDistributor toys, Scanner scanner) {
        if (toys.getToys() == null) {
            System.out.println("сначала добавьте список игрушек");
            throw new NullPointerException();
        } else {
            System.out.print("введите Ваше имя ->");
            String name = scanner.next().trim().strip();
            Client client = new Client(name);
            prepare(toys.getToys());
            List<String> resultLottery = new LinkedList<>();
            boolean game = true;
            do {
                System.out.println(name + " для розыгрыша нажмите enter");
                scanner.next();
                Toy result = toys.searchById(randomGeneration());
                System.out.println("Вы выиграли \"" + result.getName() + "\"");
                resultLottery.add(result.getName());
                toys.decreaseRemove(result);
                System.out.println("Прододжить розыгрыш? Y/N");
                String ok = scanner.next().trim().strip().toLowerCase();
                if (!ok.equals("y")) game = false;
            } while (game);
            client.setWinning(resultLottery);
            client.writeToFile();
        }
    }

    /**
     * @apiNote подготовка состояния класса для генерация лотереи
     * @param toys список игрушек
     */
    private void prepare(Queue<Toy> toys) {
        for (Toy toy : toys) {
            this.id.add(toy.getId());
            this.chance.add(toy.getChanceFalling());
            this.count += toy.getChanceFalling();
        }
    }

    /**
     * @apiNote генерация лотереи через мнимый массив и случайное число
     * @return id игрушки, -1 в идеале не возвращается
     */
    private int randomGeneration() {
        Random random = new Random();
        int index = random.nextInt(count);
        for (int i = 0; i < chance.size(); i++) {
            index -= chance.get(i);
            if (index < 0) {
                return id.get(i);
            }
        }
        return -1;
    }
}
