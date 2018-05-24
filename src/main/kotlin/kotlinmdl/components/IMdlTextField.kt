package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlTextField<out T : Element> : IMdlComponent<T> {

    var hasFloatingLabel: Boolean
    var isAlignRightEnabled: Boolean
    var isExpandable: Boolean

    companion object {

        const val ALIGN_RIGHT_MODIFIER_NAME = "mdl-textfield--align-right"
        const val BLOCK_NAME = "mdl-textfield mdl-js-textfield"
        const val EXPANDABLE_MODIFIER_NAME = "mdl-textfield--expandable"
        const val HAS_FLOATING_LABEL_MODIFIER_NAME = "mdl-textfield--floating-label"
    }
}
