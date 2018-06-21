package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlMiniFooterLinkList<out T : Element> : IMdlComponent<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-mini-footer__link-list"
    }
}
