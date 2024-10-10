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

  beforeEach(function() {
    instance = new FlockrSocialProofApi.ProductDetailsApi();
  });

  describe('(package)', function() {
    describe('ProductDetailsApi', function() {
      describe('productVisit', function() {
        it('should call productVisit successfully', function(done) {
          // TODO: uncomment, update parameter values for productVisit call and complete the assertions
          /*
          var opts = {};

          instance.productVisit(body, apiKey, opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(FlockrSocialProofApi.Flockr);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
    });
  });

}));
