import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.html.a
import kotlinx.html.dom.append
import kotlinx.html.h1
import kotlinx.html.js.header
import kotlinx.html.li
import kotlinx.html.ul
import org.w3c.dom.HTMLElement


fun main() {
    window.onload = {
        // routing 😅
        val slug = document.URL.substringAfterLast("/")
        if (slug == "blog") {
            document.body?.addHeader()
        } else {
            document.body?.addHeader()
            document.body?.addBlog()
        }
    }
}

private fun HTMLElement.addHeader() {
    append {
        header {
            h1 { text("Siggi Gunnarss") }
            ul {
                li { a("https://github.com/sigurdurrafn/") { text("Code") } }
                li { a("https://www.twitter.com/sigurdur") { text("Twitter") } }
                li { a("https://www.linkedin.com/in/sigurdurrafn/") { text("LinkedIn") } }
                li { a("https://www.festinasweden.se/") { text("Join me!") } }
                li { a("/blog") { text("Blog") } }
            }
        }
    }
}

fun HTMLElement.addBlog() {
    append {
        li { a("https://www.festinasweden.se/kotlin-multiplatform/") { text("Kotlin Multiplatform at Festina") } }
    }

}


