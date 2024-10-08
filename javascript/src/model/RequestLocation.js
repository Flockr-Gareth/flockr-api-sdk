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
 * The RequestLocation model module.
 * @module model/RequestLocation
 * @version 1.0.0
 */
export default class RequestLocation {
  /**
   * Constructs a new <code>RequestLocation</code>.
   * @alias module:model/RequestLocation
   * @class
   * @param host {String} The host name or ip address
   */
  constructor(host) {
    this.host = host;
  }

  /**
   * Constructs a <code>RequestLocation</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/RequestLocation} obj Optional instance to populate.
   * @return {module:model/RequestLocation} The populated <code>RequestLocation</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new RequestLocation();
      if (data.hasOwnProperty('host'))
        obj.host = ApiClient.convertToType(data['host'], 'String');
    }
    return obj;
  }
}

/**
 * The host name or ip address
 * @member {String} host
 */
RequestLocation.prototype.host = undefined;

