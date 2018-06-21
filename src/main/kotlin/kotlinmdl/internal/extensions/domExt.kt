package kotlinmdl.internal.extensions

import org.w3c.dom.Element
import org.w3c.dom.Node

var Element.styleAttribute: String?
    get() = this.getAttribute("style")
    set(value) {
        this.setAttribute("style", value ?: String.empty)
    }

fun <T : Node> Node.replaceOrAppendExistingChild(newChild: T, oldChild: Node) = newChild.also {
    if (this.contains(oldChild)) this.replaceChild(it, oldChild) else this.appendChild(newChild)
}

fun <T : Node> Node.removeExistingChild(child: T) = child.also { if (this.contains(it)) this.removeChild(it) }
