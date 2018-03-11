package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlMegaFooterMiddleSection<out T : Element> : IMdlMegaFooterVerticalSection<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-mega-footer__middle-section"
    }
}
