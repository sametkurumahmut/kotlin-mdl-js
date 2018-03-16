package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlMegaFooterDropdownSection<out T : Element> : IMdlMegaFooterSection<T> {

    var heading: IMdlMegaFooterHeading<Element>?
    var headingCheckBox: IMdlMegaFooterHeadingCheckBox<Element>?

    companion object {

        const val ELEMENT_NAME = "mdl-mega-footer__drop-down-section"
    }
}
