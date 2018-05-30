package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlTextFieldExpandableHolder<out T : Element> : IMdlComponent<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-textfield__expandable-holder"
    }
}
