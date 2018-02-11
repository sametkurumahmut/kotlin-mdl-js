package kotlinmdl.extensions

import kotlinmdl.components.MdlComponent
import org.w3c.dom.Element
import kotlin.dom.appendText

operator fun <T : MdlComponent<E>, E : Element> Element.plus(component: T)
        = component.also { this.appendChild(component.element) }

operator fun <T : Element> Element.plus(element: T) = element.also { this.appendChild(element) }

operator fun Element.plus(text: String) = this.appendText(text)
