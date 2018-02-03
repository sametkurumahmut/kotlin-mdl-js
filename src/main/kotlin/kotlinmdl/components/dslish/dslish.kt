package kotlinmdl.components.dslish

import kotlinmdl.components.MdlComponent
import kotlinmdl.components.MdlLayoutTitle
import kotlinmdl.extensions.empty
import kotlinmdl.extensions.plus
import org.w3c.dom.Element

//region Mdl Component Extensions
fun <T : Element> MdlComponent<T>.layoutTitle(
        title: String,
        classes: String = String.empty,
        block: MdlLayoutTitle.() -> Unit = {}) = this + MdlLayoutTitle(title, classes).apply(block)
//endregion

//region Element Extensions
fun Element.mdlLayoutTitle(
        title: String,
        classes: String = String.empty,
        block: MdlLayoutTitle.() -> Unit = {}) = this + MdlLayoutTitle(title, classes).apply(block)
//endregion
