package com.bestbuy.model.ProductReusableMethod;

import com.bestbuy.steps.ProductSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

/**
 * Created by Jay
 */
public class ProductReusableMethod {

    @Steps
    ProductSteps steps;

    @Step
    public int getProductById(int productID){
       return steps.getProductById(productID).extract().path("id");
    }


}
