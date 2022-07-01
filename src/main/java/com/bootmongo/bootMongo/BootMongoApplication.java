package com.bootmongo.bootMongo;

import com.bootmongo.bootMongo.datamodels.GroceryItem;
import com.bootmongo.bootMongo.repository.ItemInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class BootMongoApplication {
	@Autowired
	ItemInterface groceryItemRepo;
	public static void main(String[] args) {
		SpringApplication.run(BootMongoApplication.class, args);

	}


}
