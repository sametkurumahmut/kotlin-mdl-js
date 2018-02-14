package kotlinmdl.material.style

sealed class MaterialShade : IMaterialShade {

    sealed class Primary : MaterialShade(), IMaterialPrimaryShade {

        class S50 : Primary() {
            override val value = "50"
        }

        class S100 : Primary() {
            override val value = "100"
        }

        class S200 : Primary() {
            override val value = "200"
        }

        class S300 : Primary() {
            override val value = "300"
        }

        class S400 : Primary() {
            override val value = "400"
        }

        class S500 : Primary() {
            override val value = "500"
        }

        class S600 : Primary() {
            override val value = "600"
        }

        class S700 : Primary() {
            override val value = "700"
        }

        class S800 : Primary() {
            override val value = "800"
        }

        class S900 : Primary() {
            override val value = "900"
        }

        override val defaultValue = "500"
    }

    sealed class Accent : MaterialShade(), IMaterialAccentShade {

        class A100 : Accent() {
            override val value = "A100"
        }

        class A200 : Accent() {
            override val value = "A200"
        }

        class A400 : Accent() {
            override val value = "A400"
        }

        class A700 : Accent() {
            override val value = "A700"
        }
    }

    override fun toString() = this.value
}
