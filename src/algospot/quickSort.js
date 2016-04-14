/**
 * 퀵정렬
 */

(function(array) {
	function sort(array, left, right) {
		if (left >= right) {
			console.log(array);
			return;
		}
		var low, high, pivot;
		low = left + 1, high = right;
		pivot = array[left];
		while (low <= high) {
			while (low <= right && array[low] <= pivot) {
				low++;
			}
			while (left + 1 <= high && pivot <= array[high]) {
				high--;
			}
			if (low <= high) {
				var temp = array[low];
				array[low] = array[high];
				array[high] = temp;
			} else {
				array[left] = array[high];
				array[high] = pivot;
			}
		}
		sort(array, left, high - 1);
		sort(array, high + 1, right);
	}
	sort(array, 0, array.length - 1);
})([ 93, 2, 1, 10 ]);