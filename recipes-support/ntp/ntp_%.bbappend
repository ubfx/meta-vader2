FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://ntpdate-cfg"

do_install_append () {
    rm -f ${D}${sysconfdir}/default/ntpdate
    install -m 644 ${WORKDIR}/ntpdate-cfg ${D}${sysconfdir}/default/ntpdate
}