package compositedemo;

public class Main {

    public static void main(String[] args) {
        Indentacion i = new Indentacion();
        Carpeta c1 = new Carpeta("Carpeta 1", i);
        Carpeta c2 = new Carpeta("Carpeta 2", i);
        Carpeta c3 = new Carpeta("Carpeta 3", i);
        Fichero a1 = new Fichero("archivo 1", i);
        Fichero a2 = new Fichero("archivo 2", i);
        Fichero a3 = new Fichero("archivo 3", i);
        Fichero a4 = new Fichero("archivo 4", i);
        Fichero a5 = new Fichero("archivo 5", i);
        c1.add(a1);
        c1.add(a2);
        c1.add(c2);
        c2.add(a3);
        c2.add(a4);
        c2.add(c3);
        c3.add(a5);
        c1.mostrar();        
    }
    
}
