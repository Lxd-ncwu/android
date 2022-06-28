infix fun String.beginWith(prefix: String) = startsWith(prefix)

infix fun <T> Collection<T>.has(element: T) = contains(element)

fun main() {
    if ("Hello Kotlin" beginWith "Hello") {
        println(12)
        println(1221)
    }
}