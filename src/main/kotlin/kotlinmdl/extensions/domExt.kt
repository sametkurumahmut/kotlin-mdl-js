package kotlinmdl.extensions

import kotlinmdl.components.IMdlComponent
import kotlinmdl.style.IMdlStyle
import org.w3c.dom.Element
import org.w3c.dom.Node

operator fun Element.plus(style: IMdlStyle) = this.apply { classList.add(style.toString()) }

operator fun <T : IMdlComponent<E>, E : Element> Node.plus(component: T) = component.also { this + it.element }

operator fun <T : Node> Node.plus(node: T) = node.also { this.appendChild(it) }

operator fun Node.plus(text: String) = this.appendChild(this.ownerDocument!!.createTextNode(text))
