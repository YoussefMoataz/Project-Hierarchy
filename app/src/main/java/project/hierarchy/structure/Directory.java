package project.hierarchy.structure;

import java.util.ArrayList;
import java.util.List;

public class Directory extends ProjectComponent {

    private String name;
    private List<ProjectComponent> children;

    public Directory(String name) {
        this.name = name;
        children = new ArrayList<ProjectComponent>();
    }

    public void addChild(ProjectComponent child) {
        this.children.add(child);
    }

    @Override
    public void display(String prefix) {
        System.out.println(prefix + name);
        for (ProjectComponent projectComponent : children) {
            projectComponent.display(prefix + "-");
        }
    }
    
}
