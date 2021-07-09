/**
 * Max Subset Sum, No Adjacent:
 * Write a function that takes in an array of positive integers and
 * returns the maximum sum of non-adjacent elements in the array.
 * If the input array is empty, the function should return 0. Business Rules / Errata:
 * Don't sort the input array
 * You should return a Maximum sum that can be derived from any combination of non-adjacent numbers,
 * even if that comes from a single value in the array
 * (consider the sum of an array of length 1 == the numeric in the array).  */

fun maxSubsetSumNoAdjacent(arr: Array<Int>): Int? {
    if (arr.isEmpty()) return 0
    else if (arr.size < 3) {
        if (arr.size == 1) return arr[0]
        else if (arr.size == 2) return arr.maxOrNull()
    } else {
        var maxValue = 0
        for(i in 0..arr.lastIndex step 2) {
            maxValue += arr[i]
        }
        if(arr.maxOrNull()>maxValue)
        return maxValue
    }
    return 0
}

fun main() {

}