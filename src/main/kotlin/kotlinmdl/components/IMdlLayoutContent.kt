package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlLayoutContent<out T : Element> : IMdlLayoutElement<T> {

    var title: String

    companion object {

        const val ELEMENT_NAME = "mdl-layout__content"
    }
}
