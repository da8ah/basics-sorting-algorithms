import kotlin.math.roundToInt

fun merge(arr: IntArray): IntArray {
    if (arr.size <= 1) return arr

    val mid = (arr.size / 2.0).roundToInt()
    val left = arr.slice(0..(mid - 1)).toIntArray()
    val right = arr.slice(mid..(arr.size - 1)).toIntArray()

    return mergeSort(merge(left), merge(right))
}

fun mergeSort(left: IntArray, right: IntArray): IntArray {
    var arr = IntArray(left.size + right.size)
    var indexArr = 0; var indexL = 0; var indexR = 0
    while (indexL < left.size && indexR < right.size) {
        if (left[indexL] < right[indexR]) {
            // when left it's lower than right
            arr[indexArr] = left[indexL]; // add left element to arr
            // and advance one position arr & left
            indexArr++
            indexL++
        } else {
            // otherwise
            arr[indexArr] = right[indexR]; // add right element to arr
            // and advance one position arr & right
            indexArr++
            indexR++
        }
    }

    // Add remaining left & right elements
    while (indexL < left.size) {
        arr[indexArr] = left[indexL]
        indexArr++
        indexL++
    }
    while (indexR < right.size) {
        arr[indexArr] = right[indexR]
        indexArr++
        indexR++
    }

    return arr
}

fun main() {
    val start = System.currentTimeMillis()
    val arr = merge(intArrayOf(5, 21, 44, 33, 18, 10))
    val end = System.currentTimeMillis()
    println(arr.contentToString() + " time: " + ((end - start) / 1000.0))
}
