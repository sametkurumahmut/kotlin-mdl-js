package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlLayoutDrawer<out T : Element> : IMdlLayoutElement<T> {

    var layoutTitle: IMdlLayoutTitle<Element>?

    companion object {

        const val ELEMENT_NAME = "mdl-layout__drawer"
    }
}
