package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlMiniFooterLeftSection<out T : Element> : IMdlMiniFooterSection<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-mini-footer__left-section"
    }
}
