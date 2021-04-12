FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://system-bsp.dtsi \
        file://system-conf.dtsi \
"

DT_INCLUDE += "${THISDIR}/files "

SRC_URI_append_u96v2-vader2 = " file://openamp.dtsi \
"

do_configure_append () {
        echo '#include "system-bsp.dtsi"' >> ${DT_FILES_PATH}/system-top.dts
}
