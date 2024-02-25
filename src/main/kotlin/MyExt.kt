package jp.tf

fun main() {
    val moji = "world".oomoji()
    println("Hello $moji")
}

fun String.oomoji(): String {
    return this.uppercase()
}