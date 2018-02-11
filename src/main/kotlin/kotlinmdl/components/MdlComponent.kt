package kotlinmdl.components

import kotlinmdl.extensions.attributeSeparator
import kotlinmdl.extensions.plus
import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element
import kotlin.dom.appendText

abstract class MdlComponent<T> protected constructor(val element: T, classes: String = String.empty) where T : Element {

    init {
        if (classes.isNotEmpty()) this.element.className = classes attributeSeparator this.element.className
    }

    open fun <Comp : MdlComponent<E>, E : Element> append(component: Comp) = this + component

    open fun <E : Element> append(element: E) = this + element

    infix fun String.to(value: String) {
        this@MdlComponent.element.setAttribute(this, value)
    }

    open operator fun <Comp : MdlComponent<E>, E : Element> plus(component: Comp)
            = component.also { this.element + component.element }

    open operator fun <E : Element> plus(element: E) = this.element + element

    open operator fun String.unaryPlus() = this@MdlComponent.element.appendText(this)

    open operator fun <E : Element> E.unaryPlus() = this@MdlComponent.element + this

    open operator fun <Comp : MdlComponent<E>, E : Element> Comp.unaryPlus() = this@MdlComponent + this
}
