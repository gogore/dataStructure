/**
 * 퀵정렬
 */

(function(array) {
	function sort(array, left, right) {
		// 메소드 종료 기본 조건
		if (left >= right)
			return;
		var low, high, pivot;
		pivot = array[left];
		low = left + 1;
		high = right;
		while (low <= high) {
			while (low <= right && array[low] <= pivot) {
				low++;
			}
			while (left + 1 <= high && pivot <= array[high]) {
				high--;
			}
			if (low < high) {
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
	console.log(array);
})([2,1]);