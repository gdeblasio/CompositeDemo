package compositedemo;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements Component {
    private final String name;
    private final Indentacion indentacion;
    private final List<Component> files = new ArrayList<>();

    public Carpeta(String name, Indentacion indentacion) {
        this.name = name;
        this.indentacion = indentacion;
    }
    
    public void add(Component c) {
        files.add(c);
    }
    
    @Override
    public void mostrar() {
        System.out.println(indentacion.getIndentacion() + "+" + name);
        indentacion.aumentarIndentacion();
        for (Component component : files) {
            component.mostrar();
        }
    }
    
}
