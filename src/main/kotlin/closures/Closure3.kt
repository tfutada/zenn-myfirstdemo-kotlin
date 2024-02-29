package jp.tf.closures

import kotlinx.coroutines.*

fun main() = runBlocking {
    var counter = 3

    // Call sendMoneyWithLog2 without waiting for it to complete
    val sendMoneyJob = launch {
        sendMoneyWithLog2 {
            counter
        }
    }

    // Ensure there's a slight delay before launching the counter update,
    // aiming to let sendMoneyWithLog2 enter its delay period
    delay(100) // Adjust this delay as necessary

    // Update counter in a separate coroutine
    launch(Dispatchers.Default) {
        // Adding a small delay to ensure that sendMoneyWithLog2 has already started
        delay(500) // Adjust timing based on experimentation
        counter = 4
        println("in launch: counter = $counter")
    }

    // Wait for sendMoneyWithLog2 to complete its execution
    sendMoneyJob.join()
}

suspend fun sendMoneyWithLog2(f: () -> Int) {
    println("in sendMoneyWithLog")
    delay(3000) // Simulates some processing delay
    val money = f()
    println("send money: $money")
}
