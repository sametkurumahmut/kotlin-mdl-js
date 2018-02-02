package kotlinmdl.extensions

import kotlinmdl.components.MdlComponent
import org.w3c.dom.Element
import kotlin.dom.appendText

var Element.styleAttribute: String?
    get() = this.getAttribute("style")
    set(value) {
        this.setAttribute("style", value ?: String.empty)
    }

operator fun <T : MdlComponent<E>, E : Element> Element.plus(component: T)
        = component.also { this.appendChild(component.element) }

operator fun <T : Element> Element.plus(element: T) = element.also { this.appendChild(element) }

operator fun Element.plus(text: String) = this.appendText(text)
