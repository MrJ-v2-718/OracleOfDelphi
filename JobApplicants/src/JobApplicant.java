public class JobApplicant {
    // Variables
    private String name;
    private String phone;
    private boolean hasWordSkill;
    private boolean hasSpreadsheetSkill;
    private boolean hasDatabaseSkill;
    private boolean hasGraphicsSkill;

    public JobApplicant() {
    }

    public JobApplicant(String nam, String phone, boolean word,
                        boolean spread, boolean data, boolean graph) {
        name = nam;
        this.phone = phone;
        hasWordSkill = word;
        hasSpreadsheetSkill = spread;
        hasDatabaseSkill = data;
        hasGraphicsSkill = graph;
    }

    public String getName() {

        return name;
    }

    public String getPhone() {

        return phone;
    }

    public boolean getHasWordSkill() {

        return hasWordSkill;
    }

    public boolean getHasSpreadsheetSkill() {

        return hasSpreadsheetSkill;
    }

    public boolean getHasDatabaseSkill() {

        return hasDatabaseSkill;
    }

    public boolean getHasGraphicsSkill() {

        return hasGraphicsSkill;
    }
}
