package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlCardSupportingText<out T : Element> : IMdlCardElement<T> {

    var text: String

    companion object {

        const val ELEMENT_NAME = "mdl-card__supporting-text"
    }
}
