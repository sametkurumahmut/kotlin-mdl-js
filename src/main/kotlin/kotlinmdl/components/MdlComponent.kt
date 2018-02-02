package kotlinmdl.components

import kotlinmdl.extensions.attributeSeparator
import kotlinmdl.extensions.empty
import kotlinmdl.extensions.plus
import org.w3c.dom.Element
import kotlin.dom.appendText

abstract class MdlComponent<T> protected constructor(val element: T, classes: String = String.empty) where T : Element {

    init {
        if (classes.isNotEmpty()) this.element.className = classes attributeSeparator this.element.className
    }

    open fun <T : MdlComponent<E>, E : Element> append(component: T) = this + component

    open fun <T : Element> append(element: T) = this + element

    infix fun String.to(value: String) {
        this@MdlComponent.element.setAttribute(this, value)
    }

    open operator fun <T : MdlComponent<E>, E : Element> plus(component: T)
            = component.also { this.element + component.element }

    open operator fun <T : Element> plus(element: T) = this.element + element

    open operator fun String.unaryPlus() = this@MdlComponent.element.appendText(this)

    open operator fun <T : Element> T.unaryPlus() = this@MdlComponent.element + this
}
