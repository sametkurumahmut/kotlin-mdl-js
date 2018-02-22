package kotlinmdl.style

sealed class MdlTypography : IMdlTypography {

    sealed class Body : MdlTypography(), IMdlBodyTypography {

        class B1 : Body() {
            override val value = "mdl-typography--body-1"
        }

        class B1ColorContrast : Body() {
            override val value = "mdl-typography--body-1-color-contrast"
        }

        class B1ForcePreferredFont : Body() {
            override val value = "mdl-typography--body-1-force-preferred-font"
        }

        class B1ForcePreferredFontColorContrast : Body() {
            override val value = "mdl-typography--body-1-force-preferred-font-color-contrast"
        }

        class B2 : Body() {
            override val value = "mdl-typography--body-2"
        }

        class B2ColorContrast : Body() {
            override val value = "mdl-typography--body-2-color-contrast"
        }

        class B2ForcePreferredFont : Body() {
            override val value = "mdl-typography--body-2-force-preferred-font"
        }

        class B2ForcePreferredFontColorContrast : Body() {
            override val value = "mdl-typography--body-2-force-preferred-font-color-contrast"
        }
    }

    class Button : MdlTypography(), IMdlButtonTypography {
        override val value = "mdl-typography--button"
    }

    class ButtonColorContrast : MdlTypography(), IMdlButtonTypography {
        override val value = "mdl-typography--button-color-contrast"
    }

    class Caption : MdlTypography(), IMdlCaptionTypography {
        override val value = "mdl-typography--caption"
    }

    class CaptionColorContrast : MdlTypography(), IMdlCaptionTypography {
        override val value = "mdl-typography--caption-color-contrast"
    }

    class CaptionForcePreferredFont : MdlTypography(), IMdlCaptionTypography {
        override val value = "mdl-typography--caption-force-preferred-font"
    }

    class CaptionForcePreferredFontColorContrast : MdlTypography(), IMdlCaptionTypography {
        override val value = "mdl-typography--caption-force-preferred-font-color-contrast"
    }

    sealed class Display : MdlTypography(), IMdlDisplayTypography {

        class D1 : Display() {
            override val value = "mdl-typography--display-1"
        }

        class D1ColorContrast : Display() {
            override val value = "mdl-typography--display-1-color-contrast"
        }

        class D2 : Display() {
            override val value = "mdl-typography--display-2"
        }

        class D2ColorContrast : Display() {
            override val value = "mdl-typography--display-2-color-contrast"
        }

        class D3 : Display() {
            override val value = "mdl-typography--display-3"
        }

        class D3ColorContrast : Display() {
            override val value = "mdl-typography--display-3-color-contrast"
        }

        class D4 : Display() {
            override val value = "mdl-typography--display-4"
        }

        class D4ColorContrast : Display() {
            override val value = "mdl-typography--display-4-color-contrast"
        }
    }

    class Headline : MdlTypography(), IMdlHeadlineTypography {
        override val value = "mdl-typography--headline"
    }

    class HeadlineColorContrast : MdlTypography(), IMdlHeadlineTypography {
        override val value = "mdl-typography--headline-color-contrast"
    }

    class Menu : MdlTypography(), IMdlMenuTypography {
        override val value = "mdl-typography--menu"
    }

    class MenuColorContrast : MdlTypography(), IMdlMenuTypography {
        override val value = "mdl-typography--menu-color-contrast"
    }

    class SubHead : MdlTypography(), IMdlSubHeadTypography {
        override val value = "mdl-typography--subhead"
    }

    class SubHeadColorContrast : MdlTypography(), IMdlSubHeadTypography {
        override val value = "mdl-typography--subhead-color-contrast"
    }

    sealed class Text : MdlTypography(), IMdlTextTypography {

        class Capitalize : Text() {
            override val value = "mdl-typography--text-capitalize"
        }

        class Center : Text() {
            override val value = "mdl-typography--text-center"
        }

        class Justify : Text() {
            override val value = "mdl-typography--text-justify"
        }

        class Left : Text() {
            override val value = "mdl-typography--text-left"
        }

        class LowerCase : Text() {
            override val value = "mdl-typography--text-lowercase"
        }

        class NoWrap : Text() {
            override val value = "mdl-typography--text-nowrap"
        }

        class Right : Text() {
            override val value = "mdl-typography--text-right"
        }

        class UpperCase : Text() {
            override val value = "mdl-typography--text-uppercase"
        }
    }

    class Title : MdlTypography(), IMdlTitleTypography {
        override val value = "mdl-typography--title"
    }

    class TitleColorContrast : MdlTypography(), IMdlTitleTypography {
        override val value = "mdl-typography--title-color-contrast"
    }

    override fun toString() = this.value
}
