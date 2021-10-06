package searching


/**
 * Start with an array sorted in descending order.
In each step: Pick the middle element of the array m and compare it to e.
If element values are equal, then return index of m.
If e is greater than m, then e must be in left subarray.
If m is greater than e, then e must be in the right subarray.
Repeat those steps on new subarray.
 *
 */


fun <T : Comparable<T>> List<T>.binarySearch(value: T): Boolean {
    if(value > elementAt(size - 1 ) || value < elementAt(0)) return false
    val index = size / 2

    return when (value.compareTo(elementAt(index))) {
       -1 -> subList(0, index).binarySearch(value)
        1 -> subList(index, size).binarySearch(value)
        else -> true
    }

}