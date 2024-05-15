package dev.awd.behavioral.iterator.excercise;

public interface IterableCollection {

    public ProfileIterator CreateFriendsProfileIterator();

    public ProfileIterator CreatePeopleProfileIterator();

    public ProfileIterator CreateMutualProfileIterator();
}
