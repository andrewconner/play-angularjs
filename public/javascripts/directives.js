'use strict';
/* http://docs-next.angularjs.org/api/angular.module.ng.$compileProvider.directive */


angular.module('playAngularExample.directives', []).
  directive('appVersion', ['version', function(version) {
    return function(scope, elm, attrs) {
      elm.text(version);
    };
  }]);
