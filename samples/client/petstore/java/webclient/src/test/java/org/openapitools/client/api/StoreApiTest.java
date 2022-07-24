/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.model.Order;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for StoreApi
 */
@Ignore
public class StoreApiTest {

    private final StoreApi api = new StoreApi();

    
    /**
     * Delete purchase order by ID
     *
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     */
    @Test
    public void deleteOrderTest()  {
        String orderId = null;
        api.deleteOrder(orderId).block();

        // TODO: test validations
    }
    
    /**
     * Returns pet inventories by status
     *
     * Returns a map of status codes to quantities
     */
    @Test
    public void getInventoryTest()  {
        Map<String, Integer> response = api.getInventory().block();

        // TODO: test validations
    }
    
    /**
     * Find purchase order by ID
     *
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
     */
    @Test
    public void getOrderByIdTest()  {
        Long orderId = null;
        Order response = api.getOrderById(orderId).block();

        // TODO: test validations
    }
    
    /**
     * Place an order for a pet
     *
     * 
     */
    @Test
    public void placeOrderTest()  {
        Order order = null;
        Order response = api.placeOrder(order).block();

        // TODO: test validations
    }
    
}
