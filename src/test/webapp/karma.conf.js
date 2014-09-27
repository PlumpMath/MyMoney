(function() {
	'use strict';

	module.exports = function(config) {
		config.set({

			basePath : '../../',

			files : [ 'main/webapp/bower_components/angular/angular.js',
					'main/webapp/bower_components/angular-mocks/angular-mocks.js',
					'main/webapp/bower_components/angular-route/angular-route.js',
					'main/webapp/js/**/*.js', 'test/webapp/unit/**/*.js' ],

			autoWatch : true,

			frameworks : [ 'jasmine' ],

			browsers : [ 'Chrome' ],

			plugins : [ 'karma-chrome-launcher', 'karma-jasmine' ],

			junitReporter : {
				outputFile : 'test_out/unit.xml',
				suite : 'unit'
			}

		});
	};
})();