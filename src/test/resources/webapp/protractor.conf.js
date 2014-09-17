'use strict';

exports.config = {
	allScriptsTimeout : 11000,

	specs : [ 'e2e/*.js' ],

	chromeOnly : true,

	baseUrl : 'http://localhost:8080/',

	framework : 'jasmine',

	jasmineNodeOpts : {
		defaultTimeoutInterval : 30000
	}
};