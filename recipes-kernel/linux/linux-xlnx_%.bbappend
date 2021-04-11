FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += "file://defconfig"

KBUILD_DEFCONFIG = "file://defconfig"

SRC_URI += "file://bsp.cfg \
            file://user.cfg \
            file://vitis_kconfig.cfg \
"
