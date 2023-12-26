package project.hierarchy.structure;

public class File extends ProjectComponent{

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display(String prefix) {
        System.out.println(prefix + name);
    }
    
}
