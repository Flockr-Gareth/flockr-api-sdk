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
import Message from './Message';
import SocialProofProduct from './SocialProofProduct';

/**
 * The SocialProof model module.
 * @module model/SocialProof
 * @version 1.0.0
 */
export default class SocialProof {
  /**
   * Constructs a new <code>SocialProof</code>.
   * @alias module:model/SocialProof
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>SocialProof</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/SocialProof} obj Optional instance to populate.
   * @return {module:model/SocialProof} The populated <code>SocialProof</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new SocialProof();
      if (data.hasOwnProperty('messages'))
        obj.messages = ApiClient.convertToType(data['messages'], [Message]);
      if (data.hasOwnProperty('product'))
        obj.product = SocialProofProduct.constructFromObject(data['product']);
    }
    return obj;
  }
}

/**
 * @member {Array.<module:model/Message>} messages
 */
SocialProof.prototype.messages = undefined;

/**
 * @member {module:model/SocialProofProduct} product
 */
SocialProof.prototype.product = undefined;

