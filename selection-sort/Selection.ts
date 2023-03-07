function selection(arr: number[]) {
	let min: number;
	for (let i = 0; i < arr.length - 1; i++) {
		min = i;
		for (let j = i + 1; j < arr.length; j++) {
			if (arr[j] < arr[min]) {
				min = j;
			}
		}
		if (min !== i) [arr[i], arr[min]] = [arr[min], arr[i]]; // swap values
	}
	return arr;
}

const start = performance.now();
const arr = selection([12, 31, 25, 8, 32, 17]);
const end = performance.now();
console.log(`[${arr}] time: ${end - start}`);
