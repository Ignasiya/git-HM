package core.model;

import core.data.Toy;
import core.data.ToysDistributor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Add extends Mode {

    public Add() {
        super("add", "добавить");
    }

    @Override
    public void execute(ToysDistributor toys, Scanner scanner) {
        System.out.print("Введите имя игрушки ->");
        String name = scanner.next().trim().strip();
        int chanceFalling;
        int quantity;
        try {
            System.out.print("Введите колличество игрушек ->");
            quantity = scanner.nextInt();
            System.out.print("Введите шанс выпадения (1-9) ->");
            chanceFalling = scanner.nextInt();
            if (chanceFalling < 1 || chanceFalling > 9) throw new InputMismatchException();
        } catch (InputMismatchException e) {
            throw new RuntimeException();
        }
        Toy newToy = new Toy(toys.maxId() + 1, chanceFalling, quantity, name);
        toys.addToy(newToy);
        System.out.println("-> добавлено успешно");
    }
}
