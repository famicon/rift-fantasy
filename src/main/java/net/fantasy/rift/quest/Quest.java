package net.fantasy.rift.quest;

public class Quest {
    private final String id;
    private final String title;
    private final String description;
    private final boolean requiresRiftTravel;

    public Quest(String id, String title, String description, boolean requiresRiftTravel) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.requiresRiftTravel = requiresRiftTravel;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public boolean isRiftRequired() { return requiresRiftTravel; }
}
