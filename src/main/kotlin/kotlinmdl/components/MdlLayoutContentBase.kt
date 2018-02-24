package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element

abstract class MdlLayoutContentBase<out T : Element> protected constructor(
        element: T,
        override var title: String = String.empty,
        classes: String = String.empty)
    : MdlLayoutElement<T>(element.apply { classList.add(IMdlLayoutContent.ELEMENT_NAME) }, classes),
        IMdlLayoutContent<T>
