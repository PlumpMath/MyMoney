(function() {
	'use strict';

	var myMoneyApp = angular.module('myMoneyApp', [ 'ngRoute', 'myMoneyControllers' ]);

	myMoneyApp.config([ '$routeProvider', function($routeProvider) {
		$routeProvider.when('/tipos', {
			templateUrl : 'partials/tipo-list.html',
			controller : 'TipoGastoListCtrl'
		}).otherwise({
			redirectTo : '/tipos'
		});
	} ]);

})();