package core.view;

import core.control.Control;
import core.data.ToysDistributor;
import core.model.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View implements BasicView {
    private Control control;

    public View() {
        Mode read = new Read();
        Mode save = new Save();
        Mode add = new Add();
        Mode show = new Show();
        Mode exit = new Exit();
        Map<String, Mode> menu = new LinkedHashMap<>();
        menu.put(read.getNameMenu(), read);
        menu.put(save.getNameMenu(), save);
        menu.put(add.getNameMenu(), add);
        menu.put(show.getNameMenu(), show);
        menu.put(exit.getNameMenu(), exit);
        this.control = new Control(new ToysDistributor(), menu);
        start(control);
    }

    @Override
    public void start(Control control) {
        Scanner in = new Scanner(System.in).useDelimiter("\r?\n");
        System.out.println("\nПриветствуем в Магазине игрушек");
        System.out.print(control.toString() + "\n");
        while (true) {
            System.out.print(" ->");
            String input = in.next().strip().trim();
            control.onExecute(input, in);
        }
    }
}
