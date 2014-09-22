(function() {
	'use strict';

	/* Controllers */

	var myMoneyApp = angular.module('myMoneyApp', []);

	myMoneyApp.controller('TipoGastoListCtrl', [ '$scope', '$http', function($scope, $http) {
		$http.get('rest/tipos').success(function(data) {
			$scope.tipos = data;
		});

		$scope.orderProp = 'descricao';
	} ]);
})();