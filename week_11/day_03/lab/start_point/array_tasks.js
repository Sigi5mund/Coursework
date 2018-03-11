var arrayTasks = {

	concat: function (arr1, arr2) {
		arr2.forEach(function(element){
			arr1.push(element);
		})
		return arr1;

	},

	insertAt: function (arr, itemToAdd, index) {
		arr.splice(index, 0, itemToAdd);
		return arr;
	},

	square: function (arr) {
		return arr.map(function(num){
			return num ** 2;
		})
	},

	sum: function (arr) {
		var total = 0;
		arr.forEach(function(element){
			total += element;
		})
		return total;
	},

	findDuplicates: function (arr) {
		var results = [];
		for (var i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] == arr[i]) {
				results.push(arr[i]);
			}
		}
		for (var i = 0; i < arr.length; i++) {
			if (results[i + 1] == results[i]) {
				results.splice(i+1, 1);
			}
		}
		return results;
	},

	removeAndClone: function (arr, valueToRemove) {
		return arr.filter(function(element){
			return element !=valueToRemove
		})
	},

	findIndexesOf: function (arr, itemToFind) {
		var index = 0;
		var indexes = [];
		for (number of arr) {
			if (number ==itemToFind){
				indexes.push(index);
				index ++;
			}
			else {
				index ++;
			}
		}
		return indexes;
	},


	sumOfAllEvenNumbersSquared: function (arr) {
		var total = 0;
		var evenArray = arr.filter(function(num){
			return num %2 ===0;
		})
		evenArray.forEach(function(element){
			total += (element ** 2)
		})
		return total;
	}

}

module.exports = arrayTasks
