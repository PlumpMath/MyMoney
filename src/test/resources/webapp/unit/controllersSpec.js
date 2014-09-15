'use strict';

/* jasmine specs for controllers go here */

describe('MyMoney controllers', function() {
	describe('TipoGastoListCtrl', function() {
		beforeEach(module('myMoneyApp'));
		it('should create "tipos" de gasto with 5 tipos', inject(function($controller) {
			var scope = {}, ctrl = $controller('TipoGastoListCtrl', {
				$scope : scope
			});

			expect(scope.tipos.length).toBe(5);
		}));
	});
});