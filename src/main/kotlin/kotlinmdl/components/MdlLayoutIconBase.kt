package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element

abstract class MdlLayoutIconBase<out T : Element> protected constructor(element: T, classes: String = String.empty)
    : MdlLayoutElement<T>(element.apply { classList.add(IMdlLayoutIcon.BLOCK_NAME) }, classes), IMdlLayoutIcon<T>
