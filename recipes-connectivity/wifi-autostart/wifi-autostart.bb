SUMMARY = "Load the wilc-sdio kernel module on boot and start wifi"
SECTION = "vader2"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"


inherit update-rc.d

INITSCRIPT_NAME = "wilc_wifi"
INITSCRIPT_PARAMS = "start 00 2 3 4 5 ."

SRC_URI = "file://wilc_wifi_init \
"

do_install () {
	install -d ${D}${sysconfdir}/init.d
	install -m 0755 ${WORKDIR}/wilc_wifi_init ${D}${sysconfdir}/init.d/wilc_wifi
}