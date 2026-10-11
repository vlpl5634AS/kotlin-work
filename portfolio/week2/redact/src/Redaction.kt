// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
import kotlin.text.Regex

fun redact(text: String, replacement: String, pattern: Char = 'X'): String {
     if (replacement.isEmpty()) {
        return text
    }

    val redactionChar = pattern
    val swapping = redactionChar.toString().repeat(replacement.length)
    return text.replace(replacement, swapping)
}