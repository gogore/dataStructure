/**
 * 버블정렬
 */

(function(arr) {
	var i, j, t;
	for (i = 0; i < arr.length - 1; i++) {
		for (j = 0; j < arr.length - 1 - i; j++) {
			if (arr[j] > arr[j + 1]) {
				t = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = t;
			}
		}
	}
	console.log(arr);
})([ 4, 6, 78, 2, 1, 9, 0, 11, 10 ]);