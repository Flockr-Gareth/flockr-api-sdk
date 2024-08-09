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
    describe('RequestVisitor', function() {
      beforeEach(function() {
        instance = new FlockrSocialProofApi.RequestVisitor();
      });

      it('should create an instance of RequestVisitor', function() {
        // TODO: update the code to test RequestVisitor
        expect(instance).to.be.a(FlockrSocialProofApi.RequestVisitor);
      });

      it('should have the property id (base name: "id")', function() {
        // TODO: update the code to test the property id
        expect(instance).to.have.property('id');
        // expect(instance.id).to.be(expectedValueLiteral);
      });

      it('should have the property sessionId (base name: "sessionId")', function() {
        // TODO: update the code to test the property sessionId
        expect(instance).to.have.property('sessionId');
        // expect(instance.sessionId).to.be(expectedValueLiteral);
      });

    });
  });

}));
