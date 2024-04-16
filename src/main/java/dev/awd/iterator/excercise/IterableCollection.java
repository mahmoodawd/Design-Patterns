package dev.awd.iterator.excercise;

public interface IterableCollection {

    public ProfileIterator CreateFriendsProfileIterator();

    public ProfileIterator CreatePeopleProfileIterator();

    public ProfileIterator CreateMutualProfileIterator();
}
