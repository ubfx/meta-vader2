AVNET_FILES = "${THISDIR}/../../../meta-avnet/recipes-bsp/device-tree/files/u96v2-sbc"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:${AVNET_FILES}:"

SRC_URI += "file://system-bsp.dtsi \
        file://system-conf.dtsi \
        file://openamp.dtsi \
"

DT_INCLUDE += "${THISDIR}/files "