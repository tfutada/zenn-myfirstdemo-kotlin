package jp.tf.`class`

sealed class Base(p: Int)

class Derived(p: Int) : Base(p)

fun main() {
    val d = Derived(1)
    println(d)
}

