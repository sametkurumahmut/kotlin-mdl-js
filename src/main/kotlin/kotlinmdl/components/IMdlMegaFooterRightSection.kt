package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlMegaFooterRightSection<out T : Element> : IMdlMegaFooterSection<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-mega-footer__right-section"
    }
}
