/*
 * Flockr Social Proof API
 * API for sending product user actions and retrieving social proof
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@flockr.co
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.58
 *
 * Do not edit the class manually.
 *
 */
import ApiClient from "../ApiClient";
import Event from '../model/Event';
import Flockr from '../model/Flockr';

/**
* CustomerEvent service.
* @module api/CustomerEventApi
* @version 1.0.0
*/
export default class CustomerEventApi {

    /**
    * Constructs a new CustomerEventApi. 
    * @alias module:api/CustomerEventApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the event operation.
     * @callback moduleapi/CustomerEventApi~eventCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Flockr{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Registers an event for the customer
     * By passing the details of event for a product, the social proof for that product is updated. The social proof for that product is returned 
     * @param {module:model/Event} body Details of the event
     * @param {String} apiKey your api key
     * @param {module:api/CustomerEventApi~eventCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    event(body, apiKey, callback) {
      
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling event");
      }
      // verify the required parameter 'apiKey' is set
      if (apiKey === undefined || apiKey === null) {
        throw new Error("Missing the required parameter 'apiKey' when calling event");
      }

      let pathParams = {
        'apiKey': apiKey
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = Flockr;

      return this.apiClient.callApi(
        '/{apiKey}/event', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}