package core.control;

import core.data.ToysDistributor;
import core.model.Mode;

import java.util.Arrays;
import java.util.Scanner;

public class Control implements BasicControl {
    private final Mode[] modes;
    private ToysDistributor toys;

    public Control(ToysDistributor toys, Mode... modes) {
        this.modes = modes;
        this.toys = toys;
    }

    public int[] maxSizeMenu() {
        int maxName = 0, maxDescription = 0;
        for (Mode mode : modes) {
            if (mode.getNameMenu().length() > maxName) maxName = mode.getNameMenu().length();
            if (mode.getDescription().length() > maxDescription) maxDescription = mode.getDescription().length();
        }
        return new int[]{maxName, maxDescription};
    }

    @Override
    public void onExecute(int item, Scanner in) {
        modes[item].execute(toys, in);
    }

    @Override
    public String toString() {
        StringBuilder main = new StringBuilder();
        int[] size = maxSizeMenu();
        System.out.println("-".repeat(size[0]) + "  " + "-".repeat(size[1]));
        for (int i = 0; i < modes.length; i++) {
            main
        }
        main.append()
        return main.toString();
    }
}
