package kotlinmdl.components

import kotlinmdl.material.style.IMaterialIcon
import kotlinmdl.style.IMdlStyle
import org.w3c.dom.Element
import org.w3c.dom.Node

interface IMdlComponent<out T : Element> {

    val element: T

    fun <Comp : IMdlComponent<E>, E : Element> append(component: Comp): Comp
    fun <N : Node> append(node: N): N

    infix fun String.to(value: Number): IMdlComponent<T>
    infix fun String.to(value: String): IMdlComponent<T>

    operator fun <Comp : IMdlComponent<E>, E : Element> plus(component: Comp): Comp
    operator fun <N : Node> plus(node: N): N
    operator fun IMaterialIcon.unaryPlus(): Node
    operator fun IMdlStyle.unaryPlus(): IMdlComponent<T>
    operator fun Number.unaryPlus(): Node
    operator fun String.unaryPlus(): Node
    operator fun <N : Node> N.unaryPlus(): N
    operator fun <Comp : IMdlComponent<E>, E : Element> Comp.unaryPlus(): Comp
}
