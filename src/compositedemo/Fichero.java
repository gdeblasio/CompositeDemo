package compositedemo;

public class Fichero implements Component {
    private final String name;
    private final Indentacion indentacion;

    public Fichero(String name, Indentacion indentacion) {
        this.name = name;
        this.indentacion = indentacion;
    }
    
    @Override
    public void mostrar() {
        System.out.println(indentacion.getIndentacion() + "-" + name);
    }
    
}
