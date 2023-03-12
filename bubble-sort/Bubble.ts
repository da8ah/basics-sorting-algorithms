function bubble(arr: number[]) {
	for (let i = 0; i < arr.length; i++) {
		for (let j = 0; j < arr.length - 1; j++) {
			if (arr[j] > arr[j + 1]) {
				const temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}
	return arr;
}

const start = performance.now();
const arr = bubble([12, 31, 25, 8, 32, 17]);
const end = performance.now();
console.log(`[${arr}] time: ${end - start}`);
