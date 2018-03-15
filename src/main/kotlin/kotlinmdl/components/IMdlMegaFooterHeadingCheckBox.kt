package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlMegaFooterHeadingCheckBox<out T : Element> : IMdlComponent<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-mega-footer__heading-checkbox"
    }
}
