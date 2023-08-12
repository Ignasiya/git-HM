package core.model;

import core.data.ToysDistributor;

import java.util.Scanner;

public class AutoMode extends Mode {

    public AutoMode() {
        super("auto", "загружаем базу из файла");
    }

    @Override
    public void execute(ToysDistributor toys, Scanner scanner) {

    }
}
