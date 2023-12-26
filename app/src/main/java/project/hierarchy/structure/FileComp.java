package project.hierarchy.structure;

import java.io.File;

public class FileComp extends ProjectComponent{

    private File file;

    public FileComp(File file) {
        this.file = file;
    }

    @Override
    public void display(String prefix) {
        System.out.println(prefix + file.getName());
    }

    public File getFile() {
        return file;
    }
    
}
