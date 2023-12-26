package project.hierarchy.files_nagivation;

import java.io.File;
import java.util.Scanner;

import project.hierarchy.structure.DirectoryComp;
import project.hierarchy.structure.FileComp;

public class FileNavigator {
    
    private DirectoryComp parentDirectory;

    public void navigate(String path){
        parentDirectory = new DirectoryComp(new File(path));
        builParentDirectory(parentDirectory);
    }

    private void builParentDirectory(DirectoryComp parent){
        File file = parent.getDirectory();
        for(File child : file.listFiles()){
            buildChildren(parent, child);
        }
    }

    private void buildChildren(DirectoryComp parent, File currentFile){

        File file = currentFile;

        if (file.isFile()) {
            parent.addChild(new FileComp(currentFile));
        }else if(file.isDirectory()) {
            DirectoryComp childDir = new DirectoryComp(currentFile);
            for(File child : file.listFiles()){
                buildChildren(childDir, child);
            }
            parent.addChild(childDir);
        }

    }

    public void print() {
        parentDirectory.display("");
    }

    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);
        // String path = scanner.nextLine();
        // scanner.close();
        String path = "";

        FileNavigator fn = new FileNavigator();
        fn.navigate(path);
        fn.print();
    }

}
