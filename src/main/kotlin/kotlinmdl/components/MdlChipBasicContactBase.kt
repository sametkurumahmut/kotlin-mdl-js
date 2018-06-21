package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceNewClassOfThis
import kotlinmdl.internal.extensions.setTextContentOfThis
import kotlinmdl.style.IMdlBackgroundColor
import kotlinmdl.style.IMdlTextColor
import org.w3c.dom.Element

abstract class MdlChipBasicContactBase<out T : Element> protected constructor(
        element: T,
        text: String,
        color: IMdlTextColor? = null,
        backgroundColor: IMdlBackgroundColor? = null,
        classes: String = String.empty)
    : MdlChipContactBase<T>(element, classes), IMdlChipBasicContact<T> {

    override var color: IMdlTextColor? by this.replaceNewClassOfThis(element, color)
    override var backgroundColor: IMdlBackgroundColor? by this.replaceNewClassOfThis(element, backgroundColor)
    override var text by this.setTextContentOfThis(element, text)
}
