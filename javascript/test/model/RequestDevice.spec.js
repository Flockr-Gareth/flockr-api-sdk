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
(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.FlockrSocialProofApi);
  }
}(this, function(expect, FlockrSocialProofApi) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('RequestDevice', function() {
      beforeEach(function() {
        instance = new FlockrSocialProofApi.RequestDevice();
      });

      it('should create an instance of RequestDevice', function() {
        // TODO: update the code to test RequestDevice
        expect(instance).to.be.a(FlockrSocialProofApi.RequestDevice);
      });

      it('should have the property screen (base name: "screen")', function() {
        // TODO: update the code to test the property screen
        expect(instance).to.have.property('screen');
        // expect(instance.screen).to.be(expectedValueLiteral);
      });

      it('should have the property userAgent (base name: "userAgent")', function() {
        // TODO: update the code to test the property userAgent
        expect(instance).to.have.property('userAgent');
        // expect(instance.userAgent).to.be(expectedValueLiteral);
      });

    });
  });

}));
