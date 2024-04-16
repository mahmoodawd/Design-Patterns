package dev.awd;

import dev.awd.iterator.excercise.ProfileIterator;
import dev.awd.iterator.excercise.SocialMediaIterableCollection;

public class Main {
    public static void main(String[] args) {


        SocialMediaIterableCollection collection = new SocialMediaIterableCollection("1");
        ProfileIterator iterator = collection.CreateFriendsProfileIterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.getNext().getName());
        }

    }
}