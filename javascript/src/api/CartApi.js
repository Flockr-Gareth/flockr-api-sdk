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
import Flockr from '../model/Flockr';
import ListOnly from '../model/ListOnly';

/**
* Cart service.
* @module api/CartApi
* @version 1.0.0
*/
export default class CartApi {

    /**
    * Constructs a new CartApi. 
    * @alias module:api/CartApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the cartDrawer operation.
     * @callback moduleapi/CartApi~cartDrawerCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Flockr{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Fetches a set of proofs for the provided product IDs. Flockr will decide which products to return proofs for
     * Returns a list of Social Proof values for the products provided 
     * @param {module:model/ListOnly} body An array of product IDs or altIds
     * @param {String} apiKey your api key
     * @param {Object} opts Optional parameters
     * @param {String} opts.flockrDemo append this parameter with the value \&quot;true\&quot; to return demo data for testing
     * @param {module:model/String} opts.flockrFakeData append this value to return demo data of a specific proof type
     * @param {module:api/CartApi~cartDrawerCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    cartDrawer(body, apiKey, opts, callback) {
      opts = opts || {};
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling cartDrawer");
      }
      // verify the required parameter 'apiKey' is set
      if (apiKey === undefined || apiKey === null) {
        throw new Error("Missing the required parameter 'apiKey' when calling cartDrawer");
      }

      let pathParams = {
        'apiKey': apiKey
      };
      let queryParams = {
        'flockrDemo': opts['flockrDemo'],'flockrFakeData': opts['flockrFakeData']
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
        '/{apiKey}/cartDrawer/visit', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}