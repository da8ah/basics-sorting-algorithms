function merge(arr: number[]) {
	const mid = Math.round(arr.length / 2);
	if (arr.length < 2) return arr;

	const left = arr.slice(0, mid);
	const right = arr.slice(mid, arr.length);

	return mergeSort(merge(left), merge(right));
}

function mergeSort(left: number[], right: number[]) {
	let arr: number[] = [];
	while (left.length && right.length) {
		if (left[0] < right[0]) arr.push(left.shift() || 0);
		else arr.push(right.shift() || 0);
	}

	return [...arr, ...left, ...right];
}

const start = performance.now();
const arr = merge([5, 21, 44, 33, 18, 10]);
const end = performance.now();
console.log(`[${arr}] time: ${end - start}`);
