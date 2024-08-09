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
    describe('Flockr', function() {
      beforeEach(function() {
        instance = new FlockrSocialProofApi.Flockr();
      });

      it('should create an instance of Flockr', function() {
        // TODO: update the code to test Flockr
        expect(instance).to.be.a(FlockrSocialProofApi.Flockr);
      });

      it('should have the property result (base name: "result")', function() {
        // TODO: update the code to test the property result
        expect(instance).to.have.property('result');
        // expect(instance.result).to.be(expectedValueLiteral);
      });

      it('should have the property socialProof (base name: "socialProof")', function() {
        // TODO: update the code to test the property socialProof
        expect(instance).to.have.property('socialProof');
        // expect(instance.socialProof).to.be(expectedValueLiteral);
      });

      it('should have the property recommendations (base name: "recommendations")', function() {
        // TODO: update the code to test the property recommendations
        expect(instance).to.have.property('recommendations');
        // expect(instance.recommendations).to.be(expectedValueLiteral);
      });

    });
  });

}));
