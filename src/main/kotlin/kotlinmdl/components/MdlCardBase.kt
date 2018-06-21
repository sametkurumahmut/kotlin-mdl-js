package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceNewClassOfThis
import kotlinmdl.style.IMdlShadow
import kotlinmdl.style.MdlShadow
import org.w3c.dom.Element

abstract class MdlCardBase<out T : Element> protected constructor(
        element: T,
        shadow: IMdlShadow? = MdlShadow.DP2,
        classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlCard.BLOCK_NAME) }, classes), IMdlCard<T> {

    override var shadow: IMdlShadow? by this.replaceNewClassOfThis(element, shadow)
}
