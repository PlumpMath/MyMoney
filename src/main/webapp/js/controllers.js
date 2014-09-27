(function() {
	'use strict';

	/* Controllers */

	var myMoneyControllers = angular.module('myMoneyControllers', []);

	myMoneyControllers.controller('TipoGastoListCtrl', [ '$scope', '$http',
			function($scope, $http) {
				$http.get('rest/tipos').success(function(data) {
					$scope.tipos = data;
				});

				$scope.orderProp = 'descricao';
			} ]);

})();