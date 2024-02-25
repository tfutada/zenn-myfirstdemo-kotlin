package jp.tf.closures

fun main() {
    sendMoneyWithLog {
        8
    }
}

fun sendMoneyWithLog(f: () -> Int) {
    println("in getMoneyWithLog")
    val money = f()
    println("send modey: $money")
}

