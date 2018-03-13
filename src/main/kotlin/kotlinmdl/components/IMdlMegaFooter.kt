package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlMegaFooter<out T : Element> : IMdlComponent<T> {

    var bottomSection: IMdlMegaFooterBottomSection<Element>?
    var middleSection: IMdlMegaFooterMiddleSection<Element>?
    var topSection: IMdlMegaFooterTopSection<Element>?

    companion object {

        const val BLOCK_NAME = "mdl-mega-footer"
    }
}
