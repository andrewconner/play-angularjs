'use strict';


// Declare app level module which depends on filters, and services
angular.module('playAngularExample', ['playAngularExample.filters', 'playAngularExample.services', 'playAngularExample.directives']).
  config(['$routeProvider', '$locationProvider', function($routeProvider, $locationProvider) {
    $locationProvider.html5Mode(true);

    $routeProvider.when('/view1', {template: 'assets/partials/partial1.html', controller: My1Ctrl});
    $routeProvider.when('/view2', {template: 'assets/partials/partial2.html', controller: My2Ctrl});
    $routeProvider.otherwise({redirectTo: '/'});
  }]);
