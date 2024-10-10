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
import EventEvent from './EventEvent';
import Request from './Request';
import RequestDevice from './RequestDevice';
import RequestLocale from './RequestLocale';
import RequestLocation from './RequestLocation';
import RequestVisitor from './RequestVisitor';

/**
 * The Event model module.
 * @module model/Event
 * @version 1.0.0
 */
export default class Event extends Request {
  /**
   * Constructs a new <code>Event</code>.
   * @alias module:model/Event
   * @class
   * @extends module:model/Request
   * @param visitor {} 
   * @param location {} 
   */
  constructor(visitor, location) {
    super(visitor, location);
  }

  /**
   * Constructs a <code>Event</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Event} obj Optional instance to populate.
   * @return {module:model/Event} The populated <code>Event</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new Event();
      Request.constructFromObject(data, obj);
      if (data.hasOwnProperty('event'))
        obj.event = EventEvent.constructFromObject(data['event']);
    }
    return obj;
  }
}

/**
 * @member {module:model/EventEvent} event
 */
Event.prototype.event = undefined;

