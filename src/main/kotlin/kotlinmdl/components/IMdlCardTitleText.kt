package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlCardTitleText<out T : Element> : IMdlComponent<T> {

    var text: String

    companion object {

        const val ELEMENT_NAME = "mdl-card__title-text"
    }
}
