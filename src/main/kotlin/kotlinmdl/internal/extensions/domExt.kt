package kotlinmdl.internal.extensions

import org.w3c.dom.Element

var Element.styleAttribute: String?
    get() = this.getAttribute("style")
    set(value) {
        this.setAttribute("style", value ?: String.empty)
    }
