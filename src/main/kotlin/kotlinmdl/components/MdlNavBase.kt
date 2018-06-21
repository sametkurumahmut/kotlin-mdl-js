package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element

abstract class MdlNavBase<out T : Element> protected constructor(element: T, classes: String = String.empty)
    : MdlLayoutElement<T>(element.apply { classList.add(IMdlNav.BLOCK_NAME) }, classes), IMdlNav<T>
