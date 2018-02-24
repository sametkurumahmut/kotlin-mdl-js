package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element

abstract class MdlLayoutSpacerBase<out T : Element> protected constructor(element: T, classes: String = String.empty)
    : MdlLayoutElement<T>(element.apply { classList.add(IMdlLayoutSpacer.BLOCK_NAME) }, classes), IMdlLayoutSpacer<T>
