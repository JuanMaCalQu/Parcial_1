package entities;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.ArrayList;
import java.util.List;

public class Group {
    /**
     * ATRIBUTOS DE LA CLASE
     */

    private String name;
    private List<Project> projects;

    public Group(String name) {
        this.name = name;
        this.projects = new ArrayList<>();
    }

    /**
     * Metod Adicionar un nuevo proyecto
     * @param project
     */
    public void addProject(Project project) {
        this.projects.add(project);
    }

    /**
     * Cuenta los proyectos activos en el momento
     * @return
     */
    public int CountActiveProjects() {
         int a=0;
        for (Project p: this.projects)
            a += p.isActive();
    }
}
