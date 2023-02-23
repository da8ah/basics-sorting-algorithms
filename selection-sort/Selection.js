function selection(arr) {
    var _a;
    var min;
    for (var i = 0; i < arr.length - 1; i++) {
        min = i;
        for (var j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[min]) {
                min = j;
            }
        }
        if (min !== i)
            _a = [arr[min], arr[i]], arr[i] = _a[0], arr[min] = _a[1]; // swap values
    }
    return arr;
}
console.log(selection([12, 31, 25, 8, 32, 17]));
console.log(selection([80, 10, 29, 11, 8, 30, 15]));
