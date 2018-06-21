package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlRaisedButton<out T : Element> : IMdlButton<T> {

    companion object {

        const val MODIFIER_NAME = "mdl-button--raised"
    }
}
