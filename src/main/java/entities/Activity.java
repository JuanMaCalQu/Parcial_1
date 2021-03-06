package entities;

import java.time.LocalDate;

public class Activity {
    /**
     * atributos de la clase
     *
     */

    public static final String ACTIVE_STATE = "active";
    public static final String CLOSED_STATE = "closed";
    public static final String PENDING_STATE = "pending";
    public static final String CANCELED_STATE = "canceled";

    private String name;
    private String state;
    private Iteration iteration;

    /**
     * Crea una nueva actividad con sus respectivas propiedades
     * @param name
     * @param state
     * @param iteration
     */
    public Activity(String name, String state, Iteration iteration) {
        this.name = name;
        this.state = state;
        this.iteration = iteration;

        this.iteration.addActivity(this);
    }

    /**
     * Evaluate if an activity is active.
     *
     * @return true if the activity is in state pending or active, otherwise return false.
     */
    public boolean isActive() {
       return

    }

}
