package entities;

import java.util.ArrayList;
import java.util.List;

public class SabanaResearch {
    /**
     * ATRIBUTOS DE LA CLASE
     */

    private List<Group> groups;
    private List<Summary> summaries;


    public SabanaResearch(List<Group> groups) {
        this.groups = groups;
        this.summaries = new ArrayList<>();
    }

    public SabanaResearch() {
        this.summaries = new ArrayList<Summary>();
    }


    public int countOfGroups() {
        return this.groups.size();
    }

    public int countOfSummaries() {
        return this.summaries.size();
    }

    /**
     * Create a summary entry in the current date.
     * - Calculate the count of active projects.
     *
     * @return The new Summary entry.
     */
    public void addSummary(Summary summary) {
        this.summaries.add(summary);
    }

    public int createSummaryEntry() {

        new SabanaResearch();

        int ap = 0;
        for (Group g: this.groups)
            ap += g.CountActiveProjects();

    }



}
