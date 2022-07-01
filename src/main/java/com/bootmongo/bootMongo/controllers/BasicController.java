package com.bootmongo.bootMongo.controllers;


import com.bootmongo.bootMongo.commonstuff.CommonResponse;
import com.bootmongo.bootMongo.datamodels.GroceryItem;
import com.bootmongo.bootMongo.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mongo")
public class BasicController {

    private ApiService apiService;

    @Autowired
    public BasicController(ApiService apiService){
        this.apiService = apiService;


    }


    @PostMapping("/saveUser")
    public CommonResponse postNewUser(@RequestBody GroceryItem groceryItem){
        return apiService.saveUser(groceryItem);
    }

    @GetMapping("/getUsers")
    public List<GroceryItem> getAllUsersList(){
        return apiService.getUsers();

    }

    @PostMapping("/updateUser")
    public CommonResponse updateCurrentUser(@Param("name") String name,@Param("updatedQuantity") String updatedQuantity){




    }
}
