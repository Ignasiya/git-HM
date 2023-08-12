package core.view;

import core.control.Control;

import java.util.Scanner;

public class View implements BasicView {
    private Control control;

    public View() {
        this.control = control;
    }

    @Override
    public void start(Control control) {
        Scanner in = new Scanner(System.in).useDelimiter("\r?\n");

    }
}
