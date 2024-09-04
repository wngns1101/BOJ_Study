fun main(args: Array<String>) {
        val br = System.`in`.bufferedReader()
        var (index, price) = br.readLine().split(" ").map{it.toInt()}
        var coins: MutableList<Int> = mutableListOf()
        var result: Int = 0
        for (i in 0 until index) {
            coins.add(br.readLine().toInt())
        }
        coins.reverse()
        for (c in coins) {
            if (price / c > 0) {
                result += price / c
                price = price % c
            }
        }
        println(result)
}