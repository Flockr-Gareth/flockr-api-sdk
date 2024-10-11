/*
 * Flockr Social Proof API
 * API for sending product user actions and retrieving social proof
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@flockr.co
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.Flockr;
import io.swagger.client.model.ListOnly;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ListApi
 */
@Ignore
public class ListApiTest {

    private final ListApi api = new ListApi();

    /**
     * Fetches a set of proofs for the provided product IDs. Flockr will decide which products to return proofs for
     *
     * Returns a list of Social Proof values for the products provided 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cartDrawerTest() throws Exception {
        ListOnly body = null;
        String apiKey = null;
        String flockrDemo = null;
        String flockrFakeData = null;
        Boolean transparent = null;
        Flockr response = api.cartDrawer(body, apiKey, flockrDemo, flockrFakeData, transparent);

        // TODO: test validations
    }
    /**
     * Fetches a set of proofs for the provided product IDs based on sample interactions, e.g, number of samples for a given product ordered. Flockr will decide which products to return proofs for
     *
     * Returns a list of Social Proof values for the products provided 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void samplesListTest() throws Exception {
        ListOnly body = null;
        String apiKey = null;
        String flockrDemo = null;
        String flockrFakeData = null;
        Boolean transparent = null;
        Flockr response = api.samplesList(body, apiKey, flockrDemo, flockrFakeData, transparent);

        // TODO: test validations
    }
}
