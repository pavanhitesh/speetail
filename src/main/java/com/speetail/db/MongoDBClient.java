package com.speetail.db;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class MongoDBClient {

	public static void main(String[] args) {
		MongoDBClient cl = new MongoDBClient();
		BasicDBObject queryObject = new BasicDBObject();
		queryObject.append("name", "pavan");
		System.out.println(cl.getDataFromCollections(queryObject));
	}

	MongoClient mongo=null;

	public MongoClient getMongoConnection() {

		if(mongo==null) {
			mongo = new MongoClient( "localhost" , 27017 );
		}
		return mongo;
	}

	public List<Document> getDataFromCollections() {
		List<Document> list = new ArrayList<>();
		try(MongoClient mongoClient = getMongoConnection()){
			MongoDatabase database = mongoClient.getDatabase("config");  
			MongoCollection<Document> collection = database.getCollection("myCollections");
			FindIterable<Document> iterDoc = collection.find();
			MongoCursor<Document> it = iterDoc.iterator(); 
			while (it.hasNext()) {  
				list.add(it.next());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<Document> getDataFromCollections(BasicDBObject queryObject) {
		List<Document> list = new ArrayList<>();
		try(MongoClient mongoClient = getMongoConnection()){
			MongoDatabase database = mongoClient.getDatabase("config");  
			MongoCollection<Document> collection = database.getCollection("myCollections");
			FindIterable<Document> iterDoc = collection.find(queryObject);
			MongoCursor<Document> it = iterDoc.iterator(); 
			while (it.hasNext()) {  
				list.add(it.next());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
