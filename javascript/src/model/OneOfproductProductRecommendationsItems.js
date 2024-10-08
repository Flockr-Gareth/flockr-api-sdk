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
 * Swagger Codegen version: 3.0.62
 *
 * Do not edit the class manually.
 *
 */
import ApiClient from '../ApiClient';

/**
 * The OneOfproductProductRecommendationsItems model module.
 * @module model/OneOfproductProductRecommendationsItems
 * @version 1.0.0
 */
export default class OneOfproductProductRecommendationsItems {
  /**
   * Constructs a new <code>OneOfproductProductRecommendationsItems</code>.
   * @alias module:model/OneOfproductProductRecommendationsItems
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OneOfproductProductRecommendationsItems</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OneOfproductProductRecommendationsItems} obj Optional instance to populate.
   * @return {module:model/OneOfproductProductRecommendationsItems} The populated <code>OneOfproductProductRecommendationsItems</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OneOfproductProductRecommendationsItems();
    }
    return obj;
  }
}
