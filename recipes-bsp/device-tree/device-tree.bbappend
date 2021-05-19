# AVNET_FILES = "${THISDIR}/../../../meta-avnet/recipes-bsp/device-tree/files/u96v2-sbc"

# We will use our own device tree bsp from now on
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://vader2.dtsi \
        file://system-conf.dtsi \
"

DT_INCLUDE += "${THISDIR}/files "

do_configure_append () {
        echo '/include/ "vader2.dtsi"' >> ${DT_FILES_PATH}/system-top.dts
}