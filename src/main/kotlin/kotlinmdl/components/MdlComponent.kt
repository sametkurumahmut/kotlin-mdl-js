package kotlinmdl.components

import kotlinmdl.extensions.attributeSeparator
import kotlinmdl.extensions.plus
import kotlinmdl.internal.extensions.empty
import kotlinmdl.material.style.IMaterialIcon
import kotlinmdl.style.IMdlStyle
import org.w3c.dom.Element
import org.w3c.dom.Node

abstract class MdlComponent<out T : Element> protected constructor(element: T, classes: String = String.empty)
    : IMdlComponent<T> {

    init {
        if (classes.isNotEmpty()) element.className = classes attributeSeparator element.className
    }

    override val element = element

    override fun <Comp : IMdlComponent<E>, E : Element> append(component: Comp) = +component

    override fun <N : Node> append(node: N) = +node

    override fun toString() = this.element.outerHTML

    override infix fun String.to(value: Number) = this to value.toString()

    override infix fun String.to(value: String) = this@MdlComponent.also { it.element.setAttribute(this, value) }

    override operator fun <Comp : IMdlComponent<E>, E : Element> plus(component: Comp) = +component

    override operator fun <N : Node> plus(node: N) = +node

    override operator fun IMaterialIcon.unaryPlus() = +this.ligature

    override operator fun IMdlStyle.unaryPlus() = this@MdlComponent.also { it.element.classList.add(this.toString()) }

    override operator fun Number.unaryPlus() = +this.toString()

    override operator fun String.unaryPlus()
            = this@MdlComponent.element.appendChild(element.ownerDocument!!.createTextNode(this))

    override operator fun <N : Node> N.unaryPlus() = this@MdlComponent.element + this

    override operator fun <Comp : IMdlComponent<E>, E : Element> Comp.unaryPlus()
            = this.also { this@MdlComponent.element + it.element }
}
