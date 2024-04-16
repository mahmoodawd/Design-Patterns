package dev.awd.iterator.excercise;

public class PeopleProfileIterator implements ProfileIterator {
    private final SocialMediaIterableCollection iterableCollection;
    private int currentPersonProfilePosition;

    public PeopleProfileIterator(SocialMediaIterableCollection iterableCollection) {
        this.iterableCollection = iterableCollection;
    }

    @Override
    public boolean hasNext() {
        return currentPersonProfilePosition < iterableCollection.getProfiles().size();
    }

    @Override
    public UserProfile getNext() {
        if (!hasNext()) {
            return null;
        } else
            return iterableCollection.getProfiles().get(currentPersonProfilePosition++);
    }
}
