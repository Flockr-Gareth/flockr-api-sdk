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
 * The MessageRawShort model module.
 * @module model/MessageRawShort
 * @version 1.0.0
 */
export default class MessageRawShort {
  /**
   * Constructs a new <code>MessageRawShort</code>.
   * @alias module:model/MessageRawShort
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>MessageRawShort</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MessageRawShort} obj Optional instance to populate.
   * @return {module:model/MessageRawShort} The populated <code>MessageRawShort</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new MessageRawShort();
      if (data.hasOwnProperty('heading'))
        obj.heading = ApiClient.convertToType(data['heading'], 'String');
      if (data.hasOwnProperty('text'))
        obj.text = ApiClient.convertToType(data['text'], 'String');
    }
    return obj;
  }
}

/**
 * The short heading, these values can be managed in template for the message the Flockr portal
 * @member {String} heading
 */
MessageRawShort.prototype.heading = undefined;

/**
 * The lonshortg text, these values can be managed in template for the message the Flockr portal
 * @member {String} text
 */
MessageRawShort.prototype.text = undefined;

