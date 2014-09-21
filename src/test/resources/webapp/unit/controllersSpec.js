(function() {
	'use strict';

	/* jasmine specs for controllers go here */

	describe('MyMoney controllers', function() {
		describe('TipoGastoListCtrl', function() {
			var scope, ctrl;

			beforeEach(module('myMoneyApp'));

			beforeEach(inject(function($controller) {
				scope = {};
				ctrl = $controller('TipoGastoListCtrl', {
					$scope : scope
				});
			}));

			it('should create "tipos" de gasto with 5 tipos', function() {
				expect(scope.tipos.length).toBe(5);
			});

			it('should set the default value of orderProp model', function() {
				expect(scope.orderProp).toBe('descricao');
			});
		});
	});
})();