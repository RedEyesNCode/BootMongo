package com.bootmongo.bootMongo.service;


import com.bootmongo.bootMongo.commonstuff.CommonResponse;
import com.bootmongo.bootMongo.datamodels.GroceryItem;
import com.bootmongo.bootMongo.repository.ItemInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public class ApiService {


    private ItemInterface itemInterface;


    @Autowired
    public ApiService(ItemInterface itemInterface){
        this.itemInterface = itemInterface;

    }
    public CommonResponse saveUser(GroceryItem groceryItem){
        itemInterface.save(groceryItem);

        return new CommonResponse(200,"success","User saved successfully");



    }

    public List<GroceryItem> getUsers(){
        return itemInterface.findAll();
    }
    public CommonResponse updateUser(String name,String updatedQuantity){

        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(name).and("quantity").is(updatedQuantity));




    }




}
