package core.model;

import core.data.ToysDistributor;

import java.util.Scanner;

public abstract class Mode {
    protected String nameMenu;
    protected String description;

    public Mode(String nameMenu, String description) {
        this.nameMenu = nameMenu;
        this.description = description;
    }

    public abstract void execute(ToysDistributor toys, Scanner scanner);

    public String getNameMenu() {
        return nameMenu;
    }

    public String getDescription() {
        return description;
    }
}
