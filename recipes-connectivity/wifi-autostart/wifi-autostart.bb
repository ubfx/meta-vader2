SUMMARY = "Load the wilc-sdio kernel module on boot"
SECTION = "vader2"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://init"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

inherit update-rc.d

INITSCRIPT_NAME = "wifi_init"
INITSCRIPT_PARAMS = "start 90 5 ."

do_install () {
	install -d ${D}${sysconfdir}/init.d/
    install -m 755 ${WORKDIR}/init ${D}${sysconfdir}/init.d/wifi_init
}

FILES_${PN} += "${sysconfdir}/*"