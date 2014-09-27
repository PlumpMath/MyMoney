(function() {
	'use strict';

	/* jasmine specs for controllers go here */

	describe('MyMoney controllers', function() {
		describe('TipoGastoListCtrl', function() {
			var scope;
			var ctrl;
			var $httpBackend;

			beforeEach(module('myMoneyApp'));

			beforeEach(inject(function(_$httpBackend_, $rootScope, $controller) {
				scope = $rootScope.$new();

				$httpBackend = _$httpBackend_;
				$httpBackend.expectGET('rest/tipos').respond([ {
					descricao : 'Oi'
				}, {
					descricao : 'Tchau'
				} ]);

				ctrl = $controller('TipoGastoListCtrl', {
					$scope : scope
				});
			}));

			it('should create "tipos" de gasto with 2 tipos', function() {
				expect(scope.tipos).toBeUndefined();
				$httpBackend.flush();
				expect(scope.tipos).toEqual([ {
					descricao : 'Oi'
				}, {
					descricao : 'Tchau'
				} ]);
			});

			it('should set the default value of orderProp model', function() {
				expect(scope.orderProp).toBe('descricao');
			});
		});
	});
})();