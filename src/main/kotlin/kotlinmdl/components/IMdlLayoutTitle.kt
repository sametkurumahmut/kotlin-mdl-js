package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlLayoutTitle<out T : Element> : IMdlLayoutElement<T> {

    var title: String

    companion object {

        const val BLOCK_NAME = "mdl-layout-title"
    }
}
