package com.bootmongo.bootMongo.configuration;

import com.bootmongo.bootMongo.datamodels.GroceryItem;
import com.bootmongo.bootMongo.repository.ItemInterface;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfig {
/*
    @Bean
    CommandLineRunner commandLineRunner(ItemInterface itemInterface){
        return args -> {
            itemInterface.save(new GroceryItem("Whole Wheat Biscuit", "Whole Wheat Biscuit", 5, "snacks"));
            itemInterface.save(new GroceryItem("Kodo Millet", "XYZ Kodo Millet healthy", 2, "millets"));
            itemInterface.save(new GroceryItem("Dried Red Chilli", "Dried Whole Red Chilli", 2, "spices"));
            itemInterface.save(new GroceryItem("Pearl Millet", "Healthy Pearl Millet", 1, "millets"));
            itemInterface.save(new GroceryItem("Cheese Crackers", "Bonny Cheese Crackers Plain", 6, "snacks"));
        };
    }*/

}
