package core.model;

import core.data.ToysDistributor;

import java.util.Scanner;

public class ManualMode extends Mode {

    public ManualMode() {
        super("manual", "создаем базу вручную");
    }

    @Override
    public void execute(ToysDistributor toys, Scanner scanner) {

    }
}
