package dev.awd.iterator.excercise;

import java.util.List;

public class SocialMediaIterableCollection implements IterableCollection {

    private final String profileId;
    private List<UserProfile> profiles;


    public SocialMediaIterableCollection(String profileId) {
        this.profiles = List.of(
                new UserProfile("1452", "Medo"),
                new UserProfile("2565", "Ali"),
                new UserProfile("3654", "Kholood")
        );
        this.profileId = profileId;
    }

    public List<UserProfile> getProfiles() {
        return profiles;
    }

    @Override
    public ProfileIterator CreateFriendsProfileIterator() {
        return new FriendsProfileIterator(this);
    }

    @Override
    public ProfileIterator CreatePeopleProfileIterator() {
        return new FriendsProfileIterator(this);
    }

    @Override
    public ProfileIterator CreateMutualProfileIterator() {
        return new FriendsProfileIterator(this);

    }
}
