package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class Project {
    /**
     * ATRIBUTOS DE LA CLASE
     */
    private String name;
    private LocalDate dateInit;
    private LocalDate dateEnd;
    private LocalDate now;
    private Group group;
    private List<Iteration> iterations;

    public Project(String name, LocalDate dateInit, LocalDate dateEnd, Group group) {
        this.name = name;
        this.dateInit = dateInit;
        this.dateEnd = dateEnd;
        this.group = group;
        this.iterations = new ArrayList<>();

        group.addProject(this);
    }

    public void addIteration(Iteration iteration) {
        this.iterations.add(iteration);
    }

    public void setDateInit(LocalDate dateInit) {
        this.dateInit = dateInit;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    /**
     * Evaluate if a project is active.
     *
     * INVARIANBTES
     *
     * La hora final tiene que ser menor a la hora del sistema
     *
     * @return false if the project has open activities or the dateEnd is before than the system date.
     */
    public boolean isActive() {
        final LocalDateTime now = ZoneId;
        if (this.dateEnd < this.now){
            return false;
        }
        return false;

        for(Iteration i: this.iterations)
            i.countOpenActivities();


    }


}
