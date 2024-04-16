package dev.awd.iterator.excercise;

public class MutualProfileIterator implements ProfileIterator {
    private final SocialMediaIterableCollection iterableCollection;
    private int currentMutualFriendProfilePosition;

    public MutualProfileIterator(SocialMediaIterableCollection iterableCollection) {
        this.iterableCollection = iterableCollection;
    }

    @Override
    public boolean hasNext() {
        return currentMutualFriendProfilePosition < iterableCollection.getProfiles().size();
    }

    @Override
    public UserProfile getNext() {
        if (!hasNext()) {
            return null;
        } else
            return iterableCollection.getProfiles().get(currentMutualFriendProfilePosition++);
    }
}
