package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element

abstract class MdlContactChipBase<out T : Element> protected constructor(
        element: T,
        classes: String = String.empty) : MdlBasicChipBase<T>(element, true, classes = classes), IMdlContactChip<T>
