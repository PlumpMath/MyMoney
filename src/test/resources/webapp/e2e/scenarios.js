'use strict';

describe('My Money', function() {
	describe('Tipos de gasto list view', function() {
		beforeEach(function() {
			browser.get('mymoney/');
		});
		it('should filter the list as user types into the search box', function() {
			var tiposList = element.all(by.repeater('tipo in tipos'));
			var query = element(by.model('query'));

			expect(tiposList.count()).toBe(5);

			query.sendKeys('exemplo');
			expect(tiposList.count()).toBe(4);

			query.clear();
			query.sendKeys('supermercado');
			expect(tiposList.count()).toBe(2);
		});
	});
});