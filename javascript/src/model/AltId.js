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
import ApiClient from '../ApiClient';

/**
 * The AltId model module.
 * @module model/AltId
 * @version 1.0.0
 */
export default class AltId {
  /**
   * Constructs a new <code>AltId</code>.
   * @alias module:model/AltId
   * @class
   * @param altId {String} 
   */
  constructor(altId) {
    this.altId = altId;
  }

  /**
   * Constructs a <code>AltId</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AltId} obj Optional instance to populate.
   * @return {module:model/AltId} The populated <code>AltId</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AltId();
      if (data.hasOwnProperty('altId'))
        obj.altId = ApiClient.convertToType(data['altId'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} altId
 */
AltId.prototype.altId = undefined;

// Implement OneOfproductProductRecommendationsItems interface:
