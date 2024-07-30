package dev.awd.ultimate;

public class MongoDbMessageRepo implements MessageRepository {
    @Override
    public void saveMessage(String message) {
        System.out.println("Saving message using MongoDB Repo: " + message);
    }
}
