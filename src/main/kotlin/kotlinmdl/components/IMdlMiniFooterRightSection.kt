package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlMiniFooterRightSection<out T : Element> : IMdlMiniFooterSection<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-mini-footer__right-section"
    }
}
