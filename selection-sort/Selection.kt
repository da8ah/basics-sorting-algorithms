fun selection(arr: IntArray): IntArray {
    var min: Int
    for (i in 0..arr.lastIndex - 1) {
        min = i
        for (j in (i + 1)..arr.lastIndex) {
            if (arr[j] < arr[min]) {
                min = j
            }
        }
        // swap values
        if (min != i) {
            val temp = arr[i]
            arr[i] = arr[min]
            arr[min] = temp
        }
    }
    return arr
}

fun main() {
    val start = System.currentTimeMillis()
    val arr = selection(intArrayOf(12, 31, 25, 8, 32, 17))
    val end = System.currentTimeMillis()
    println(arr.contentToString() + " time: " + ((end - start) / 1000.0))
}
