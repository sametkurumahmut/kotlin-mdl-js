package kotlinmdl.style

import kotlinmdl.material.style.IMaterialPrimaryShade
import kotlinmdl.material.style.IMaterialShade
import kotlinmdl.material.style.MaterialShade

sealed class MdlColor : IMdlColor {

    sealed class Background : MdlColor(), IMdlBackgroundColor {

        class Accent : Background() {
            override val value = "mdl-color--accent"
        }

        class AccentContrast : Background() {
            override val value = "mdl-color--accent-contrast"
        }

        class Primary : Background() {
            override val value = "mdl-color--primary"
        }

        class PrimaryContrast : Background() {
            override val value = "mdl-color--primary-contrast"
        }

        class PrimaryDark : Background() {
            override val value = "mdl-color--primary-dark"
        }

        class Black : Background() {
            override val value = "mdl-color--black"
        }

        class White : Background() {
            override val value = "mdl-color--white"
        }

        class Amber(shade: IMaterialShade = MaterialShade.Primary.S500()) : Background() {
            override val value = "mdl-color--amber-${shade.value}"
        }

        class Blue(shade: IMaterialShade = MaterialShade.Primary.S500()) : Background() {
            override val value = "mdl-color--blue-${shade.value}"
        }

        class BlueGrey(shade: IMaterialPrimaryShade = MaterialShade.Primary.S500()) : Background() {
            override val value = "mdl-color--blue-grey-${shade.value}"
        }

        class Brown(shade: IMaterialPrimaryShade = MaterialShade.Primary.S500()) : Background() {
            override val value = "mdl-color--brown-${shade.value}"
        }

        class Cyan(shade: IMaterialShade = MaterialShade.Primary.S500()) : Background() {
            override val value = "mdl-color--cyan-${shade.value}"
        }

        class DeepOrange(shade: IMaterialShade = MaterialShade.Primary.S500()) : Background() {
            override val value = "mdl-color--deep-orange-${shade.value}"
        }

        class DeepPurple(shade: IMaterialShade = MaterialShade.Primary.S500()) : Background() {
            override val value = "mdl-color--deep-purple-${shade.value}"
        }

        class Green(shade: IMaterialShade = MaterialShade.Primary.S500()) : Background() {
            override val value = "mdl-color--green-${shade.value}"
        }

        class Grey(shade: IMaterialPrimaryShade = MaterialShade.Primary.S500()) : Background() {
            override val value = "mdl-color--grey-${shade.value}"
        }

        class Indigo(shade: IMaterialShade = MaterialShade.Primary.S500()) : Background() {
            override val value = "mdl-color--indigo-${shade.value}"
        }

        class LightBlue(shade: IMaterialShade = MaterialShade.Primary.S500()) : Background() {
            override val value = "mdl-color--light-blue-${shade.value}"
        }

        class LightGreen(shade: IMaterialShade = MaterialShade.Primary.S500()) : Background() {
            override val value = "mdl-color--light-green-${shade.value}"
        }

        class Lime(shade: IMaterialShade = MaterialShade.Primary.S500()) : Background() {
            override val value = "mdl-color--lime-${shade.value}"
        }

        class Orange(shade: IMaterialShade = MaterialShade.Primary.S500()) : Background() {
            override val value = "mdl-color--orange-${shade.value}"
        }

        class Pink(shade: IMaterialShade = MaterialShade.Primary.S500()) : Background() {
            override val value = "mdl-color--pink-${shade.value}"
        }

        class Purple(shade: IMaterialShade = MaterialShade.Primary.S500()) : Background() {
            override val value = "mdl-color--purple-${shade.value}"
        }

        class Red(shade: IMaterialShade = MaterialShade.Primary.S500()) : Background() {
            override val value = "mdl-color--red-${shade.value}"
        }

        class Teal(shade: IMaterialShade = MaterialShade.Primary.S500()) : Background() {
            override val value = "mdl-color--teal-${shade.value}"
        }

        class Yellow(shade: IMaterialShade = MaterialShade.Primary.S500()) : Background() {
            override val value = "mdl-color--yellow-${shade.value}"
        }
    }

    sealed class Text : MdlColor(), IMdlTextColor {

        class Accent : Text() {
            override val value = "mdl-color-text--accent"
        }

        class AccentContrast : Text() {
            override val value = "mdl-color-text--accent-contrast"
        }

        class Primary : Text() {
            override val value = "mdl-color-text--primary"
        }

        class PrimaryContrast : Text() {
            override val value = "mdl-color-text--primary-contrast"
        }

        class PrimaryDark : Text() {
            override val value = "mdl-color-text--primary-dark"
        }

        class Black : Text() {
            override val value = "mdl-color-text--black"
        }

        class White : Text() {
            override val value = "mdl-color-text--white"
        }

        class Amber(shade: IMaterialShade = MaterialShade.Primary.S500()) : Text() {
            override val value = "mdl-color-text--amber-${shade.value}"
        }

        class Blue(shade: IMaterialShade = MaterialShade.Primary.S500()) : Text() {
            override val value = "mdl-color-text--blue-${shade.value}"
        }

        class BlueGrey(shade: IMaterialPrimaryShade = MaterialShade.Primary.S500()) : Text() {
            override val value = "mdl-color-text--blue-grey-${shade.value}"
        }

        class Brown(shade: IMaterialPrimaryShade = MaterialShade.Primary.S500()) : Text() {
            override val value = "mdl-color-text--brown-${shade.value}"
        }

        class Cyan(shade: IMaterialShade = MaterialShade.Primary.S500()) : Text() {
            override val value = "mdl-color-text--cyan-${shade.value}"
        }

        class DeepOrange(shade: IMaterialShade = MaterialShade.Primary.S500()) : Text() {
            override val value = "mdl-color-text--deep-orange-${shade.value}"
        }

        class DeepPurple(shade: IMaterialShade = MaterialShade.Primary.S500()) : Text() {
            override val value = "mdl-color-text--deep-purple-${shade.value}"
        }

        class Green(shade: IMaterialShade = MaterialShade.Primary.S500()) : Text() {
            override val value = "mdl-color-text--green-${shade.value}"
        }

        class Grey(shade: IMaterialPrimaryShade = MaterialShade.Primary.S500()) : Text() {
            override val value = "mdl-color-text--grey-${shade.value}"
        }

        class Indigo(shade: IMaterialShade = MaterialShade.Primary.S500()) : Text() {
            override val value = "mdl-color-text--indigo-${shade.value}"
        }

        class LightBlue(shade: IMaterialShade = MaterialShade.Primary.S500()) : Text() {
            override val value = "mdl-color-text--light-blue-${shade.value}"
        }

        class LightGreen(shade: IMaterialShade = MaterialShade.Primary.S500()) : Text() {
            override val value = "mdl-color-text--light-green-${shade.value}"
        }

        class Lime(shade: IMaterialShade = MaterialShade.Primary.S500()) : Text() {
            override val value = "mdl-color-text--lime-${shade.value}"
        }

        class Orange(shade: IMaterialShade = MaterialShade.Primary.S500()) : Text() {
            override val value = "mdl-color-text--orange-${shade.value}"
        }

        class Pink(shade: IMaterialShade = MaterialShade.Primary.S500()) : Text() {
            override val value = "mdl-color-text--pink-${shade.value}"
        }

        class Purple(shade: IMaterialShade = MaterialShade.Primary.S500()) : Text() {
            override val value = "mdl-color-text--purple-${shade.value}"
        }

        class Red(shade: IMaterialShade = MaterialShade.Primary.S500()) : Text() {
            override val value = "mdl-color-text--red-${shade.value}"
        }

        class Teal(shade: IMaterialShade = MaterialShade.Primary.S500()) : Text() {
            override val value = "mdl-color-text--teal-${shade.value}"
        }

        class Yellow(shade: IMaterialShade = MaterialShade.Primary.S500()) : Text() {
            override val value = "mdl-color-text--yellow-${shade.value}"
        }
    }

    override fun toString() = this.value
}
