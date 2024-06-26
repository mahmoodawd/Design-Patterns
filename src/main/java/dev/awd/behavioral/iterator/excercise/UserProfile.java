package dev.awd.behavioral.iterator.excercise;

public class UserProfile {
    private String id;
    private String name;

    public UserProfile() {
        this.id = "";
        this.name = "";
    }

    public UserProfile(String id, String name) {
        this.id = id;
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
