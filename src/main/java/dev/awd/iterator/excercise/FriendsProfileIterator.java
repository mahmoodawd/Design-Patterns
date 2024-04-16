package dev.awd.iterator.excercise;

public class FriendsProfileIterator implements ProfileIterator {
    private final SocialMediaIterableCollection iterableCollection;
    private int currentFriendProfilePosition;

    public FriendsProfileIterator(SocialMediaIterableCollection iterableCollection) {
        this.iterableCollection = iterableCollection;
    }

    @Override
    public boolean hasNext() {
        return currentFriendProfilePosition < iterableCollection.getProfiles().size();
    }

    @Override
    public UserProfile getNext() {
        if (!hasNext()) {
            return null;
        } else
            return iterableCollection.getProfiles().get(currentFriendProfilePosition++);
    }
}
