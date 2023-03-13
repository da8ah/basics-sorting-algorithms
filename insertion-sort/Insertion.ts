function insertion(arr: number[]) {
	let current: number;
	let i: number;
	for (let j = 0; j < arr.length - 1; j++) {
		i = j + 1;
		current = arr[i];
		while (i > 0 && current < arr[i - 1]) {
			arr[i] = arr[i - 1];
			i--;
		}
		arr[i] = current;
	}
	return arr;
}

const start = performance.now();
const arr = insertion([5, 21, 44, 33, 18, 10]);
const end = performance.now();
console.log(`[${arr}] time: ${end - start}`);
