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
				// 피봇 보다 작은 숫자 통과 loop 결과 low의 값이 pivot 보다 큰 숫자
				low++;
			}
			while (left + 1 <= high && pivot <= array[high]) {
				// 피봇 보다 큰 숫자는 통과 loop 결과 high의 값이 pivot 보다 작은 숫자
				high--;
			}
			if (low < high) {
				// low high 위차가 swap대상이면 swap
				var temp = array[low];
				array[low] = array[high];
				array[high] = temp;
			}
		}
		// 우측에서 부터 처음으로 pivot 보다 작은 숫자가 나온 위치의 값과 pivot swap 
		array[left] = array[high];
		array[high] = pivot;
		
		sort(array, left, high - 1);
		sort(array, high + 1, right);
	}
	sort(array, 0, array.length - 1);
	console.log(array);
})([10,5,3,8,4,9,1,6,2,7]);