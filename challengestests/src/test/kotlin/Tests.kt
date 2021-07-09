import org.junit.Assert.assertEquals
import org.junit.Test

/*
* max_subset_sum_no_adjacent([75, 105, 120, 75, 90, 135]) -> 330 # 75 + 120 + 135
max_subset_sum_no_adjacent([]) -> 0
max_subset_sum_no_adjacent([1]) -> 1
max_subset_sum_no_adjacent([1, 2]) -> 2 # 2 should not be summed with 1 because they are adjacent, and 2 is the highest value
max_subset_sum_no_adjacent([1, 2, 3]) -> 4 # 1 + 3
max_subset_sum_no_adjacent([1, 15, 3]) -> 15 # This is a tricky one, since 15 is greater than 1 + 3, 15 is the max subset sum
max_subset_sum_no_adjacent([7, 10, 12, 7, 9, 14]) -> 33 # 7 + 12 + 14
max_subset_sum_no_adjacent([4, 3, 5, 200, 5, 3]) -> 207 # 4 + 200 + 3 // (array[0] + array[3] + array[5]), again this is tricky
max_subset_sum_no_adjacent([10, 5, 20, 25, 15, 5, 5, 15]) -> 60 # 10 + 20 + 15 + 15 // (array[0] + array[2] + array[4] + array[7])
max_subset_sum_no_adjacent([10, 5, 20, 25, 15, 5, 5, 15, 3, 15, 5, 5, 15]) -> 90 # 10 + 20 + 15 + 15 + 15 + 15 // (array[0] + array[2] + array[4] + array[7] + array[9] + array[12])
*
*
* */

class Tests {
    @Test
    fun testCase1() {
        val arr = arrayOf(75, 105, 120, 75, 90, 135)
        assertEquals(330, maxSubsetSumNoAdjacent(arr))
    }

    @Test
    fun testCase2() {
        val arr = emptyArray<Int>()
        assertEquals(0, maxSubsetSumNoAdjacent(arr))
    }

    @Test
    fun testCase3() {
        val arr = arrayOf(1)
        assertEquals(1, maxSubsetSumNoAdjacent(arr))
    }

    @Test
    fun testCase4() {
        val arr = arrayOf(1, 2)
        assertEquals(2, maxSubsetSumNoAdjacent(arr))
    }

    @Test
    fun testCase5() {
        val arr = arrayOf(1, 2, 3)
        assertEquals(4, maxSubsetSumNoAdjacent(arr))
    }

    @Test
    fun testCase6() {
        val arr = arrayOf(1, 15, 3)
        assertEquals(15, maxSubsetSumNoAdjacent(arr))
    }

    @Test
    fun testCase7() {
        val arr = arrayOf(7, 10, 12, 7, 9, 14)
        assertEquals(33, maxSubsetSumNoAdjacent(arr))
    }

    @Test
    fun testCase8() {
        val arr = arrayOf(4, 3, 5, 200, 5, 3)
        assertEquals(207, maxSubsetSumNoAdjacent(arr))
    }

    @Test
    fun testCase9() {
        val arr = arrayOf(10, 5, 20, 25, 15, 5, 5, 15)
        assertEquals(60, maxSubsetSumNoAdjacent(arr))
    }

    @Test
    fun testCase10() {
        val arr = arrayOf(10, 5, 20, 25, 15, 5, 5, 15, 3, 15, 5, 5, 15)
        assertEquals(90, maxSubsetSumNoAdjacent(arr))
    }
}