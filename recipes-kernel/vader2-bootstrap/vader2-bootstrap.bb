SUMMARY = "Vader2 Bootstrapper"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4a0f8ad6a793571b331b0e19e3dd925c"

inherit module

SRC_URI = "file://Makefile \
           file://vader2-bootstrap.c \
           file://LICENSE \
          "

S = "${WORKDIR}"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

RPROVIDES_${PN} += "kernel-module-vader2-bootstrap"