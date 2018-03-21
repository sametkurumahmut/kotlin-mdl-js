package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlMiniFooter<out T : Element> : IMdlComponent<T> {

    var leftSection: IMdlMiniFooterLeftSection<Element>?
    var rightSection: IMdlMiniFooterRightSection<Element>?

    companion object {

        const val BLOCK_NAME = "mdl-mini-footer"
    }
}
