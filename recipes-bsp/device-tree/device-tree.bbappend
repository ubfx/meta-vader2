FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
DT_INCLUDE += "${THISDIR}/files"

SRC_URI += "file://system-bsp.dtsi \
            file://system-conf.dtsi \
"

SRC_URI_append_u96v2-vader2 = "file://system-bsp.dtsi \
                               file://system-conf.dtsi \
"

do_configure_append () {
        echo '#include "system-bsp.dtsi"' >> ${DT_FILES_PATH}/system-top.dts
}

#python() {
#    bb.debug(1, "DTI >" + d.getVar("DT_INCLUDE") + "<\n\nTD: " + d.getVar("THISDIR") + "<\n DT_FILES_PATH: >" + d.getVar("DT_FILES_PATH") + "<");
#}