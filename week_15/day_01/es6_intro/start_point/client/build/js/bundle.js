/******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};
/******/
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/
/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId]) {
/******/ 			return installedModules[moduleId].exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			i: moduleId,
/******/ 			l: false,
/******/ 			exports: {}
/******/ 		};
/******/
/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);
/******/
/******/ 		// Flag the module as loaded
/******/ 		module.l = true;
/******/
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/
/******/
/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;
/******/
/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;
/******/
/******/ 	// identity function for calling harmony imports with the correct context
/******/ 	__webpack_require__.i = function(value) { return value; };
/******/
/******/ 	// define getter function for harmony exports
/******/ 	__webpack_require__.d = function(exports, name, getter) {
/******/ 		if(!__webpack_require__.o(exports, name)) {
/******/ 			Object.defineProperty(exports, name, {
/******/ 				configurable: false,
/******/ 				enumerable: true,
/******/ 				get: getter
/******/ 			});
/******/ 		}
/******/ 	};
/******/
/******/ 	// getDefaultExport function for compatibility with non-harmony modules
/******/ 	__webpack_require__.n = function(module) {
/******/ 		var getter = module && module.__esModule ?
/******/ 			function getDefault() { return module['default']; } :
/******/ 			function getModuleExports() { return module; };
/******/ 		__webpack_require__.d(getter, 'a', getter);
/******/ 		return getter;
/******/ 	};
/******/
/******/ 	// Object.prototype.hasOwnProperty.call
/******/ 	__webpack_require__.o = function(object, property) { return Object.prototype.hasOwnProperty.call(object, property); };
/******/
/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";
/******/
/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(__webpack_require__.s = 2);
/******/ })
/************************************************************************/
/******/ ([
/* 0 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


var MakeupGetterES5 = function MakeupGetterES5(brand) {
  this.brand = brand;
  this.products = [];
};

MakeupGetterES5.prototype = {
  fetchProducts: function fetchProducts() {
    var url = 'http://makeup-api.herokuapp.com/api/v1/products.json?brand=' + this.brand;
    var xhr = new XMLHttpRequest();

    xhr.open('GET', url);
    xhr.addEventListener('load', function () {
      this.products = JSON.parse(xhr.responseText);

      for (var i = 0; i < this.products.length; i++) {
        console.log('product at index', i, 'in loop:', this.products[i]);
      }

      console.log('i after loop:', i);
    }.bind(this));

    xhr.send();
  }
};

module.exports = MakeupGetterES5;

/***/ }),
/* 1 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


Object.defineProperty(exports, "__esModule", {
  value: true
});

var _createClass = function () { function defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } } return function (Constructor, protoProps, staticProps) { if (protoProps) defineProperties(Constructor.prototype, protoProps); if (staticProps) defineProperties(Constructor, staticProps); return Constructor; }; }();

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

var MakeupGetterES6 = function () {
  function MakeupGetterES6(brand) {
    _classCallCheck(this, MakeupGetterES6);

    this.brand = brand;
    this.products = [];
  }

  _createClass(MakeupGetterES6, [{
    key: "fetchProducts",
    value: function fetchProducts() {
      var _this = this;

      var url = "http://makeup-api.herokuapp.com/api/v1/products.json?brand=" + this.brand;

      var xhr = new XMLHttpRequest();
      xhr.open("GET", url);

      // xhr.onload = function(){
      //   this.products =JSON.parse(xhr.responseText);
      // }.bind(this)

      xhr.onload = function () {
        _this.products = JSON.parse(xhr.responseText);

        var _iteratorNormalCompletion = true;
        var _didIteratorError = false;
        var _iteratorError = undefined;

        try {
          for (var _iterator = _this.products[Symbol.iterator](), _step; !(_iteratorNormalCompletion = (_step = _iterator.next()).done); _iteratorNormalCompletion = true) {
            var product = _step.value;

            console.log(product);
          }
        } catch (err) {
          _didIteratorError = true;
          _iteratorError = err;
        } finally {
          try {
            if (!_iteratorNormalCompletion && _iterator.return) {
              _iterator.return();
            }
          } finally {
            if (_didIteratorError) {
              throw _iteratorError;
            }
          }
        }
      };

      xhr.send();
    }
  }]);

  return MakeupGetterES6;
}();

exports.default = MakeupGetterES6;
// can also have export default at top line instead

/***/ }),
/* 2 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


var _MakeupGetterES = __webpack_require__(1);

var _MakeupGetterES2 = _interopRequireDefault(_MakeupGetterES);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var MakeupGetter = __webpack_require__(0);


var app = function app() {
  // var mg = new MakeupGetter("maybelline");
  // mg.fetchProducts();
  var mg = new _MakeupGetterES2.default("maybelline");
  mg.fetchProducts();
};

window.onload = app;

/***/ })
/******/ ]);
//# sourceMappingURL=bundle.js.map