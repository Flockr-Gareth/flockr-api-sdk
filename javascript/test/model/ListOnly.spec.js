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
    describe('ListOnly', function() {
      beforeEach(function() {
        instance = new FlockrSocialProofApi.ListOnly();
      });

      it('should create an instance of ListOnly', function() {
        // TODO: update the code to test ListOnly
        expect(instance).to.be.a(FlockrSocialProofApi.ListOnly);
      });

      it('should have the property category (base name: "category")', function() {
        // TODO: update the code to test the property category
        expect(instance).to.have.property('category');
        // expect(instance.category).to.be(expectedValueLiteral);
      });

      it('should have the property products (base name: "products")', function() {
        // TODO: update the code to test the property products
        expect(instance).to.have.property('products');
        // expect(instance.products).to.be(expectedValueLiteral);
      });

      it('should have the property images (base name: "images")', function() {
        // TODO: update the code to test the property images
        expect(instance).to.have.property('images');
        // expect(instance.images).to.be(expectedValueLiteral);
      });

    });
  });

}));
