package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlMiniFooterSocialButton<out T : Element> : IMdlComponent<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-mini-footer__social-btn"
    }
}
