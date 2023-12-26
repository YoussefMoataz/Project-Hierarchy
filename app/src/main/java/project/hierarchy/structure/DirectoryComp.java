package project.hierarchy.structure;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryComp extends ProjectComponent {

    private File directory;
    private List<ProjectComponent> children;

    public DirectoryComp(File dir) {
        this.directory = dir;
        children = new ArrayList<ProjectComponent>();
    }

    @Override
    public void display(String prefix) {
        System.out.println(prefix + directory.getName());
        for (ProjectComponent projectComponent : children) {
            projectComponent.display(prefix + "-");
        }
    }

    public void addChild(ProjectComponent child) {
        this.children.add(child);
    }

    public File getDirectory() {
        return directory;
    }
    
}
