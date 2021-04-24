FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://ntpdate.default"

do_install_append () {
    rm -f ${D}${sysconfdir}/default/ntpdate
    install -m 644 ${WORKDIR}/ntpdate.default ${D}${sysconfdir}/default/ntpdate
}